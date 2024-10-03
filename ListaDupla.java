
public class ListaDupla<A> implements Lista<A> {

    private NoDuplo<A> inicio;
    private Integer tamanho = 0;

    @Override
    public void adicionar(A elem, Integer indice) {
        novoIndiceValido(indice);

        if(indice == 0) {
            if (tamanho == 0) {
                inicio = new NoDuplo<>(null, null, elem);
            } else {
                var novoNo = new NoDuplo<>(null, inicio, elem);
                inicio.setAnterior(novoNo);
                inicio = novoNo;
            }
        } else {
            var noAnterior = inicio;
            for(int i=1; i<indice; i++) {
                noAnterior = noAnterior.getProximo();
            }

            var novoNo = new NoDuplo<>(noAnterior, noAnterior.getProximo(), elem);
            if (noAnterior.getProximo() != null) {
                noAnterior.getProximo().setAnterior(novoNo);
            }

            noAnterior.setProximo(novoNo);
        }

        tamanho++;
    }

    @Override
    public void adicionarFim(A elem) {
        adicionar(elem, tamanho);
    }

    @Override
    public void adicionarInicio(A elem) {
        adicionar(elem, 0);
    }

    @Override
    public A buscar(Integer indice) {
        indiceValido(indice);

        var no = inicio;
        for(int i=0; i<indice; i++) {
            no = no.getProximo();
        }

        return no.getElemento();
    }

    @Override
    public Boolean contem(A elem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contem'");
    }

    @Override
    public A remover(Integer indice) {
        indiceValido(indice);
        A elem;

        if (indice == 0) {
            elem = inicio.getElemento();
            if (tamanho == 1) {
                inicio = null;
            } else {
                inicio = inicio.getProximo();
                inicio.setAnterior(null);
            }
        } else {
            var no = inicio;
            for(int i=0; i<indice; i++) {
                no = no.getProximo();
            }

            elem = no.getElemento();
            if (no.getProximo() != null) {
                no.getProximo().setAnterior(no.getAnterior());
            }

            no.getAnterior().setProximo(no.getProximo());
        }

        tamanho--;
        return elem;
    }

    @Override
    public A removerInicio() {
        return remover(0);
    }

    @Override
    public A removerFim() {
        return remover(tamanho);
    }

    @Override
    public Integer tamanho() {
        return tamanho;
    }

    private void indiceValido(Integer indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new RuntimeException("Indice invalido: " + indice);
        }
    }

    private void novoIndiceValido(Integer indice) {
        if (indice < 0 || indice > tamanho) {
            throw new RuntimeException("Indice invalido: " + indice);
        }
    }
}

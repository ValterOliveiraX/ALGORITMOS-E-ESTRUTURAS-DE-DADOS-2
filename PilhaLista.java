
public class PilhaLista<A> implements Pilha<A> {

    private final Lista<A> elementos = new ListaDupla<>();

    @Override
    public void empilhar(A elem) {
        elementos.adicionarInicio(elem);
    }

    @Override
    public A desempilhar() {
        return elementos.removerInicio();
    }

    @Override
    public Integer tamanho() {
        return elementos.tamanho();
    }
    
}

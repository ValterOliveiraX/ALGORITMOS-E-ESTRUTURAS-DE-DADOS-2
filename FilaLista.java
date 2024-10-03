
public class FilaLista<A> implements Fila<A> {

    private final Lista<A> elementos = new ListaDupla<>();

    @Override
    public void enfileirar(A elem) {
        elementos.adicionarFim(elem);
    }

    @Override
    public A desenfileirar() {
        return elementos.removerInicio();
    }

    @Override
    public Integer tamanho() {
        return elementos.tamanho();
    }
}
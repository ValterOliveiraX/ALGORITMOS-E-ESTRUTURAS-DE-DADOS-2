
public interface Lista<A> extends Iterable<A>  {

    void adicionar(A elem, Integer indice);
    void adicionarInicio(A elem);
    void adicionarFim(A elem);

    A buscar(Integer indice);
    Boolean contem(A elem);

    A remover(Integer indice);
    A removerInicio();
    A removerFim();

    Integer tamanho();

}

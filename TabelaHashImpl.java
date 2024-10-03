public class TabelaHashImpl<A> implements TabelaHash<A> {

    private Lista<Lista<A>> elementos;

    public TabelaHashImpl(Integer tamanho) {
        elementos = new ListaDupla<>();
        for (int i=0; i<tamanho; i++) {
            elementos.adicionarInicio(new ListaDupla<>());
        }
    }

    @Override
    public void inserir(A elem) {
        var posicao = Math.abs(elem.hashCode() % elementos.tamanho());
        elementos.buscar(posicao).adicionarFim(elem);
    }

    @Override
    public Boolean contem(A elem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contem'");
    }
    

}

public class ArvoreNumerica implements ArvoreBinaria<Integer> {

    private No<Integer> raiz;

    @Override
    public void inserir(Integer elem) {
        inserir(elem, raiz);
    }

    private void inserir(Integer elem, No<Integer> noAtual) {
        if (noAtual == null) {
            noAtual = new No<>(elem);
            return;
        }

        if (elem < noAtual.getElemento()) {
            inserir(elem, noAtual.getEsquerda());
        } else {
            inserir(elem, noAtual.getDireita());
        }
    }
    
}

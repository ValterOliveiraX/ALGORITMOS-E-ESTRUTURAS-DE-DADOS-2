public class No<A> {
    private No<A> direita;
    private No<A> esquerda;
    private A elemento;

    public No() {
    }

    public No(A elemento) {
        this.elemento = elemento;
    }

    public No(No<A> direita, No<A> esquerda, A elemento) {
        this.direita = direita;
        this.esquerda = esquerda;
        this.elemento = elemento;
    }

    public No<A> getDireita() {
        return direita;
    }

    public void setDireita(No<A> direita) {
        this.direita = direita;
    }

    public No<A> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No<A> esquerda) {
        this.esquerda = esquerda;
    }

    public A getElemento() {
        return elemento;
    }

    public void setElemento(A elemento) {
        this.elemento = elemento;
    }
}

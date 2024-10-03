
public class NoDuplo<A> {
    private NoDuplo<A> proximo;
    private NoDuplo<A> anterior;
    private A elemento;

    public NoDuplo() {
    }

    public NoDuplo(NoDuplo<A> anterior, NoDuplo<A> proximo, A elemento) {
        this.anterior = anterior;
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public NoDuplo<A> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<A> proximo) {
        this.proximo = proximo;
    }

    public NoDuplo<A> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<A> anterior) {
        this.anterior = anterior;
    }

    public A getElemento() {
        return elemento;
    }

    public void setElemento(A elemento) {
        this.elemento = elemento;
    }
}

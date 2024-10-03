public interface Iterator<A> {
    boolean hasNext();
    Iterator<A> next();
    A value();
}

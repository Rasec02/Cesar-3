public class Nodo {
    private Estudiante dato;
    private Nodo next;

    public Nodo(Estudiante dato) {
        this.dato = dato;
        this.next = null;
    }

    public Estudiante getDato() { return dato; }
    public Nodo getNext() { return next; }
    public void setNext(Nodo next) { this.next = next; }
}
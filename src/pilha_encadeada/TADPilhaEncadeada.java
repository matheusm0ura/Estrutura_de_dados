package pilha_encadeada;

public interface TADPilhaEncadeada<T> {
    void insereTopo(T valor);

    T removeTopo();

    boolean pilhaVazia();
    void imprimirPilha();
}

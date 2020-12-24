package lista_encadeada;

public interface TADListaEncadeada<T> {

    void insereInicio(T valor);
    void insereFinal(T valor);
    void inserePosicao(T valor, int pos);

    T removePosicao(int pos);


    void imprimirLista();
    boolean listaVazia();

}

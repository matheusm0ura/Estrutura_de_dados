package lista_encadeada;

public interface TADListaEncadeada <T> {

    void insereInicio(T valor);
    void inserePosicao(T valor, int posicao);
    void insereFinal(T valor);

    T removePosicao(int posicao);

    boolean listaVazia();
    void imprimiLista();
}

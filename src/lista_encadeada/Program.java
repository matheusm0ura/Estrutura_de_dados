package lista_encadeada;

public class Program {
    public static void main(String[] args) {
        TADListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        //listaEncadeada.imprimirLista();

        listaEncadeada.insereInicio(10);
        listaEncadeada.imprimirLista();

        listaEncadeada.insereFinal(20);
        listaEncadeada.imprimirLista();

        listaEncadeada.inserePosicao(12, 1);
        listaEncadeada.imprimirLista();

        listaEncadeada.inserePosicao(14, 2);
        listaEncadeada.imprimirLista();

        listaEncadeada.inserePosicao(18, 3);
        listaEncadeada.imprimirLista();

        listaEncadeada.inserePosicao(13, 3);
        listaEncadeada.imprimirLista();

        listaEncadeada.removePosicao(2);
        listaEncadeada.imprimirLista();


    }
}

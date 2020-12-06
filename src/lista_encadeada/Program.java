package lista_encadeada;

public class Program {
    public static void main(String[] args) {

        TADListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        listaEncadeada.imprimiLista();

        listaEncadeada.insereInicio(10);
        listaEncadeada.insereFinal(20);
        listaEncadeada.imprimiLista();

        listaEncadeada.inserePosicao(12, 1);
        listaEncadeada.imprimiLista();

        listaEncadeada.inserePosicao(14, 2);
        listaEncadeada.imprimiLista();

        listaEncadeada.inserePosicao(8, 0);
        listaEncadeada.imprimiLista();

        listaEncadeada.removePosicao(0);
        listaEncadeada.imprimiLista();

        listaEncadeada.removePosicao(0);
        listaEncadeada.imprimiLista();

        listaEncadeada.removePosicao(2);
        listaEncadeada.imprimiLista();

        listaEncadeada.removePosicao(-1);
    }
}

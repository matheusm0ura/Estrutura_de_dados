package fila_encadeada;

public class Program {
    public static void main(String[] args) {

        TADFilaEncadeada<Integer> filaEncadeada = new FilaEncadeada<Integer>();

        filaEncadeada.imprimiLista();

        filaEncadeada.insereFinal(10);
        filaEncadeada.insereFinal(15);
        filaEncadeada.insereFinal(20);
        filaEncadeada.insereFinal(45);
        filaEncadeada.imprimiLista();
        filaEncadeada.removePosicao(1);
        filaEncadeada.imprimiLista();

    }
}

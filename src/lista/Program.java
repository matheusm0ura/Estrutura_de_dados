package lista;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        TADLista<Integer> lista = new Lista<Integer>(5);
       lista.insereValor(2, 0);
       lista.insereValor(3, 0);
       lista.imprimirLista();
       lista.removerValor(1);
       lista.imprimirLista();
    }
}

package fila;

public class Program {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.removerInicio();
        fila.imprimirFila();

        fila.insereFinal(3);
        fila.insereFinal(4);
        fila.insereFinal(1);
        fila.insereFinal(7);
        fila.insereFinal(8);
        fila.imprimirFila();

        fila.removerInicio();
        fila.imprimirFila();

        fila.removerInicio();
        fila.imprimirFila();

        fila.removerInicio();
        fila.imprimirFila();

        fila.removerInicio();
        fila.imprimirFila();

        fila.removerInicio();
        fila.imprimirFila();


    }
}

package pilha_encadeada;

public class Program {
    public static void main(String[] args) {
        TADPilhaEncadeada pilha = new PilhaEncadeada();
        pilha.insereTopo(10);
        pilha.imprimirPilha();

        pilha.insereTopo(11);
        pilha.insereTopo(14);
        pilha.insereTopo('a');
        pilha.insereTopo(20);
        pilha.removeTopo();
        pilha.removeTopo();
        pilha.imprimirPilha();


    }
}

package pilha;

public class Program {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.removeTopo();
        pilha.adicionaTopo(1);
        pilha.adicionaTopo(2);
        pilha.adicionaTopo(3);
        pilha.adicionaTopo(4);
        pilha.adicionaTopo(5);
        pilha.adicionaTopo(3);
        pilha.imprimirPilha();

    }
}

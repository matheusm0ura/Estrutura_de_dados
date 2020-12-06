package pilha;

public interface TADPilha {

    //Operações principais
    void adicionaTopo(Integer valor);

    Integer removeTopo();

    //Operações secundárias
    boolean pilhaCheia();
    boolean pilhaVazia();
    void imprimirPilha();

}

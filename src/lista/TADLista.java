package lista;

public interface TADLista <T>{ //Em tempo de execução, pode-se especificar o tipo do dado.

    void insereValor( T valor, int indice);

    T removerValor(int indice);

    boolean listaCheia();

    boolean listaVazia();

    void imprimirLista();





}

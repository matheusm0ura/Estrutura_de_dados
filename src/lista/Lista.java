package lista;

public class Lista <T> implements TADLista <T> {

    private T[] lista;
    private int posicao;

    public Lista(int tamanho) {
        lista = (T[]) new Object[tamanho];
        posicao = -1;
    }

    @Override
    public void insereValor(T valor, int indice) {
        if (listaCheia()){
            System.out.println("lista cheia."+" Valor" + valor + " não inserido.");
            return;
        }
        if (indice < 0 || indice > posicao + 1){
            System.out.println("índice " + indice + " inválido");
            return;
        }
        //Desloca todos os elementos iguais ou posteriores ao índice uma posição à direita.
        for (int i = posicao; i >= indice; i--){
             lista[i + 1] = lista[i];
         }
         lista[indice] = valor;
         posicao++;
    }

    @Override
    public T removerValor(int indice) {
        if (listaVazia()){
            System.out.println("Lista vazia. Não há elementos para remoção");
            return null;
        }
        if (indice < 0 || indice > posicao){
            System.out.println("Índice inválido.");
            return null;
        }

        //Desloca todos os elementos posteriores ao índice uma posição à esquerda.
        for (int i = indice; i < posicao; i--){
            lista[i] = lista[i + 1];
        }
        lista[posicao] = null;
        posicao -= 1;
        return lista[indice];

    }

    @Override
    public boolean listaCheia() {
        if (posicao == lista.length - 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean listaVazia() {
        if (posicao == -1){
            return true;
        }
        return false;
    }

    @Override
    public void imprimirLista() {
        if (listaVazia()){
            System.out.println("Lista vazia. Não há elementos para impressão.");
        }
        for (int i = 0; i <= posicao; i++){
            System.out.print(lista[i] + "\t");
        }
        System.out.println();

    }
}

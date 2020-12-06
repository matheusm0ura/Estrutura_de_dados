package fila;

public class Fila implements TADFila{

    private Integer[] fila; //usando alocação estática de memória. O tamanho da lista cresce de acordo com o número de elementos
                            //fazendo com que não seja preciso limitar o seu tamanho.

    private int posicao;

    public Fila(int tamanho) {
        fila = new Integer[tamanho];
        posicao = -1; //quer dizer que não há nenhum valor válido na lista, uma vez que todos eles são null.
    }

    @Override
    public void insereFinal(Integer valor) {
        if(filaCheia()){
            System.out.printf("O elemento %d não pôde ser inserido, pois o tamanho da fila excedeu.", valor);
            return; //finaliza a execução do método.
        }
        fila[++posicao] = valor; //Por exemplo, 1 + (-1) = 0. Isso quer dizer que a pos 0 recebe a variável valor
    }

    @Override
    public Integer removerInicio() {
        if(filaVazia()){
            System.out.println("Fila vazia. Elemento não removido.");
            return null;
        }
        for (int i = 0; i < posicao; i++){
            fila[i] = fila[i + 1];
        }
        fila[posicao] = null;
        posicao -= 1;
        return fila[0];
    }

    @Override
    public boolean filaCheia() {
        if (posicao == fila.length - 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean filaVazia() {
        if (posicao == -1){
            return true;
        }
        return false;
    }

    @Override
    public void imprimirFila() {
        if (filaVazia()){
            System.out.println("Fila vazia. Não há elementos para impressão.");
            return;
        }
        System.out.println();
        for (int i = 0; i <= posicao; i++){ //
            System.out.printf("%d" + "\t", fila[i]);
        }
        System.out.println();
    }
}

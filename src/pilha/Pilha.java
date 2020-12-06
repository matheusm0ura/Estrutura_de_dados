package pilha;

public class Pilha implements TADPilha{
    //O índice 0 é o topo nesta implementação.

    private Integer[] pilha;
    private int posicao;

    public Pilha(Integer tamanho) {
        pilha = new Integer[tamanho];
        posicao = -1; //Posição inicialmente começa com esse número, porque não há números válidos na pilha.
    }

    @Override
    public void adicionaTopo(Integer valor) {
        if (pilhaCheia()){
            System.out.println("Pilha cheia. Não é possível inserir o valor.");
            return;
        }
        //Desloca todos os elementos uma posição para direita.

        for (int i = posicao; i >= 0; i--){
            pilha[i + 1] = pilha[i];
        }
        pilha[0] = valor;
        posicao++;
    }

    @Override
    public Integer removeTopo() {
        if (pilhaVazia()){
            System.out.println("Pilha vazia. Não há elementos para impressão.");
            return null;
        }

        //Desloca todos os elementos para esquerda.

        for (int i = 0; i < posicao; i++){
            pilha[i] = pilha[i + 1];
        }
        pilha[posicao] = null; //O último índice, que possui o mesmo valor do antepenúltimo elemento, vai receber null.
        posicao -= 1;
        return pilha[0];
    }

    @Override
    public boolean pilhaCheia() {
        if (posicao == pilha.length - 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean pilhaVazia() {
        if (posicao == -1) {
            return true;
        }
        return false;
    }

    @Override
    public void imprimirPilha() {
        if (pilhaVazia()){
            System.out.println("Os elementos da pilha não podem ser impressos, porque ela está vazia.");
            return;
        }
        for (int i = 0; i <= posicao; i++){
            System.out.printf("%d" + "\t", pilha[i]);
        }
        System.out.println();
    }
}

package pilha_encadeada;

public class PilhaEncadeada<T> implements TADPilhaEncadeada <T>{
    private No<T> cabeca;
    private int tamanho;

    public PilhaEncadeada() {
        cabeca = null;
        tamanho = 0;
    }

    @Override
    public void insereTopo(T valor) {
        No<T> novoNo = new No<T>(valor, null);
        if (tamanho == 0){
            cabeca = novoNo;
        }
        else{
            novoNo.setProximo(cabeca);
            cabeca = novoNo;
        }
        tamanho++;
    }

    @Override
    public T removeTopo() {
        if (pilhaVazia()){
            System.out.println("Pilha vazia.");
            return null;
        }
        No<T> noRemovido = cabeca;
        cabeca = cabeca.getProximo();
        noRemovido.setProximo(null);
        tamanho--;
        return noRemovido.getValor();
    }

    @Override
    public boolean pilhaVazia() {
        if (tamanho == 0){
            return true;
        }
        return false;
    }

    @Override
    public void imprimirPilha() {
        if (pilhaVazia()){
            System.out.println("Pilha vazia.");
            return;
        }
        No<T> aux = cabeca;
        while (aux != null){
            System.out.print(" => " + aux.getValor());
            aux = aux.getProximo();
        }
        System.out.println();
    }
}

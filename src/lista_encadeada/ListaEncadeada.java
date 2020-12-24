package lista_encadeada;

public class ListaEncadeada<T> implements TADListaEncadeada<T> {

    private No<T> cabeca;
    private int tamanho;

    public ListaEncadeada() {
        cabeca = null;
        tamanho = 0;
    }

    @Override
    public void insereInicio(T valor) {
        No<T> novoNo = new No<T>(valor, null);
        if (cabeca == null){
            cabeca = novoNo;
        }
        else{
            novoNo.setProximo(cabeca);
            cabeca = novoNo;
        }
        tamanho++;
    }

    @Override
    public void insereFinal(T valor) {
        No<T> novoNo = new No<T>(valor,null);
        if (cabeca == null){
            cabeca = novoNo;
        }
        else {
            getCauda().setProximo(novoNo);
        }
        tamanho++;
    }

    @Override
    public void inserePosicao(T valor, int posicao) {
        if (posicao == 0) {
            insereInicio(valor);
            return;
        } else if (posicao == tamanho) {
            insereFinal(valor);
            return;
        } else if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida " + posicao + " para inserção.");
            return;
        }

        //Inserir no meio da lista
        No<T> novoNo = new No<T>(valor, null);

        No<T> noAnteriorInsercao = cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            noAnteriorInsercao = noAnteriorInsercao.getProximo();
        }

        No<T> noPosteriorInsercao = noAnteriorInsercao.getProximo();
        noAnteriorInsercao.setProximo(novoNo);
        novoNo.setProximo(noPosteriorInsercao);

        tamanho++;
    }

    @Override
    public T removePosicao(int pos) {
        if (listaVazia()){
            System.out.println("Lista vazia. Não há elementos para remoção.");
            return null;
        }
        else if (pos < 0 || pos >= tamanho){
            System.out.println("Posição inválida.");
            return null;
        }


        No<T> anterior = cabeca;
        for (int i = 0; i < pos - 1; i++){
            anterior = anterior.getProximo();
        }

        No<T> removido = anterior.getProximo();

        if (pos == 0){
            removido = cabeca;
            cabeca = removido.getProximo();

        }

        else {
            anterior.setProximo(removido.getProximo());
            removido.setProximo(null);
        }

        tamanho--;
        return removido.getValor();
    }

    @Override
    public void imprimirLista() {
        if (listaVazia()){
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

    @Override
    public boolean listaVazia() {
        if (cabeca == null){
            return true;
        }
        return false;
    }

    public No<T> getCauda(){
        No<T> aux = cabeca;
        if (aux == null){
            return null;
        }
        while (aux.getProximo() != null){
            aux =aux.getProximo();
        }
        return aux;
    }
}

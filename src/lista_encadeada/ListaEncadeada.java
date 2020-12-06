package lista_encadeada;

public class ListaEncadeada<T> implements TADListaEncadeada <T>{

    private No<T> cabeca;
    private int tamanho;
    

    public ListaEncadeada() {
        cabeca = null;
        tamanho = 0;
    }

    @Override
    public void insereInicio(T valor) {
        //Criando variável a No
        No<T> novoNo = new No<T>(valor, null);

        if(cabeca == null){
            cabeca = novoNo;
        }
        else {
            novoNo.setProximo(cabeca);
            cabeca = novoNo;
        }
        tamanho++;
    }

    @Override
    public void inserePosicao(T valor, int posicao) {

        if (posicao == 0){
            insereInicio(valor);
            return;
        }
        else if (posicao == tamanho){
            insereFinal(valor);
            return;

        }
        else if(posicao < 0 || posicao > tamanho){
            System.out.println("Posição inválida para inserção.");
        }
        No<T> novoNo = new No<T>(valor, null);
        No<T> noAnteriorInsercao = cabeca;
        for(int i = 0; i < posicao - 1; i ++){
            noAnteriorInsercao = noAnteriorInsercao.getProximo();
        }
        No<T> noPosteriorInserccao = noAnteriorInsercao.getProximo();
        noAnteriorInsercao.setProximo(novoNo);
        novoNo.setProximo(noPosteriorInserccao);
        tamanho++;
    }

    @Override
    public void insereFinal(T valor) {
        No<T> novoNo = new No<T>(valor, null);

        if (cabeca == null){
            cabeca = novoNo;
        }
        else {
            getCauda().setProximo(novoNo);
        }
        tamanho++;
    }

    @Override
    public T removePosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho){
            System.out.println("Não é possível remover. Posição inválida.");
            return null;
        }
        No<T> noAnteriorRemocao = cabeca;

        //Encontra o nó anterior que será removido
        for (int i = 0; i < posicao - 1; i++){
            noAnteriorRemocao = noAnteriorRemocao.getProximo();
        }

        No <T> noRemovido = noAnteriorRemocao.getProximo();

        if(posicao == 0){
            noRemovido = cabeca;
            cabeca = noRemovido.getProximo();
        }
        else {
            noAnteriorRemocao.setProximo(noRemovido.getProximo());
            noRemovido.setProximo(null);

        }
        tamanho--;

        return noRemovido.getValor();
    }

    @Override
    public boolean listaVazia() {
        if (cabeca == null){
            return true;
        }
        return false;

    }

    @Override
    public void imprimiLista() {
        if (listaVazia()){
            System.out.println("Lista vazia. Não há elementos para impressão.");
            return;
        }
        No<T> auxiliar = cabeca;
        while (auxiliar != null){
            System.out.print(" => " + auxiliar.getValor());
            auxiliar = auxiliar.getProximo();
        }
        System.out.println();
    }

    public  No<T> getCauda(){
        No<T> aux = cabeca;

        if (aux == null){
            return null;
        }
        while (aux.getProximo() != null){
            aux = aux.getProximo();
        }
        return aux;
    }
}

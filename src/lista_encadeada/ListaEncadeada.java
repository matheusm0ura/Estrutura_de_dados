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
        return null;
    }

    @Override
    public boolean listaVazia() {
        return false;
    }

    @Override
    public void imprimiLista() {

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

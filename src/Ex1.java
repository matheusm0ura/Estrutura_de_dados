import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    static List<Integer> lista = new ArrayList<>();
    public static void main(String[] args) {

        adicionarInicio(1);
        adicionaFim(2);
        adicionaMeio(2, 1);
        removeInicio();
        removeFim();

        lista.forEach(System.out::println);


    }
    static void adicionarInicio(int n){
        lista.add(0, n);
    }

    static void adicionaFim(int n){
        lista.add(lista.size() - 1, n);
    }

    static void adicionaMeio(int n, int pos){
        lista.add(pos, n);
    }

    static void removeInicio(){
        lista.remove(0);
    }
    static void removeFim(){
        lista.remove(lista.size() - 1);
    }
}
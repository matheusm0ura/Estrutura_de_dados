import java.util.ArrayList;
import java.util.List;

public class Teste {
    static int lista[] = new int[10];

    public static void main(String[] args) {
       
        //adicionarInicio(3);
        for (int e: lista) {
            System.out.println(e);
        }

    }
    public static void adicionarInicio(int n){
        lista[0] = n;
    }

}

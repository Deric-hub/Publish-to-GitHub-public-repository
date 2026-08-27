package conflitos.pucrs.br;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(2);
        lista.add(5);
        lista.add(7);
        lista.add(5);

        DemoLists demo = new DemoLists();

        int resultado = demo.nOcorrencias(lista, 5);
        System.out.println("O número 5 aparece " + resultado + " vezes.");

    }

}

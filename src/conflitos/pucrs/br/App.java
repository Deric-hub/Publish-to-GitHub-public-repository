package conflitos.pucrs.br;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        // Lista usada nos testes
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(2);
        lista.add(5);
        lista.add(7);
        lista.add(5);

        // Criando objeto da classe DemoLists
        DemoLists demo = new DemoLists();

        // a. Número de ocorrências
        int resultado = demo.nOcorrencias(lista, 5);

        System.out.println("O número 5 aparece " + resultado + " vezes.");

        // b. Verifica se existem elementos repetidos
        boolean repetido = demo.nroRepeat(lista) > 0;
        System.out.println("A lista possui elementos repetidos? " + repetido);

        // c. Número de elementos repetidos
        int repetidos = demo.nroRepeat(lista);

        System.out.println("Número de elementos repetidos: " + repetidos);

        // d. Lista de elementos repetidos
        ArrayList<Integer> listaRepetidos = listRepeat(lista);
        System.out.println("Elementos repetidos: " + listaRepetidos);
        
        // União de duas listas
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        l2.add(5);

        ArrayList<Integer> uniao = demo.union(l1, l2);

        System.out.println("União: " + uniao);

        // f. Intersecção de duas listas
        ArrayList<Integer> interseccao = intersect(l1, l2);
        System.out.println("Intersecção: " + interseccao);
    }

    private static ArrayList<Integer> listRepeat(ArrayList<Integer> lista) {
        ArrayList<Integer> repetidos = new ArrayList<>();

        for (Integer elemento : lista) {
            if (lista.indexOf(elemento) != lista.lastIndexOf(elemento)
                    && !repetidos.contains(elemento)) {
                repetidos.add(elemento);
            }
        }

        return repetidos;
    }

    private static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> interseccao = new ArrayList<>();

        for (Integer elemento : l1) {
            if (l2.contains(elemento) && !interseccao.contains(elemento)) {
                interseccao.add(elemento);
            }
        }

        return interseccao;
    }
}

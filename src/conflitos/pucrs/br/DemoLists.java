package conflitos.pucrs.br;

import java.util.ArrayList;

public class DemoLists {

    //a. Método que retorna quantas ocorrências de um elemento estão na lista
    //int nOcorrencias(ArrayList<Integer> l, Integer el)
    int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int contador = 0;

        for (Integer elemento : l) {
            if (elemento.equals(el)) {
                contador++;
            }
        }

        return contador;
    }

    //c. Método que retorna o número de elementos repetidos em l
    //int nroRepeat(ArrayList< Integer > l)
    int nroRepeat(ArrayList<Integer> l) {

        int contador = 0;

        for (int i = 0; i < l.size(); i++) {
            if (l.indexOf(l.get(i)) != i) {
                contador++;
            }
        }

        return contador;
    }

    ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {

        ArrayList<Integer> resultado = new ArrayList<>();

        for (Integer elemento : l1) {
            if (!resultado.contains(elemento)) {
                resultado.add(elemento);
            }
        }

        for (Integer elemento : l2) {
            if (!resultado.contains(elemento)) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }
}

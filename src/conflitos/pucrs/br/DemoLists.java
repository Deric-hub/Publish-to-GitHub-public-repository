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

}

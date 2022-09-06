package br.com.letscode.elevador;

import br.com.letscode.elevador.model.Elevador;
import br.com.letscode.elevador.model.Predio;

public class Main {

    public static void main(String[] args) {

        Predio predio = new  Predio(10);
        Elevador elevador = new Elevador(10, predio);

        elevador.entra(5);
        elevador.entra(4);
        elevador.entra(4);

    }
}

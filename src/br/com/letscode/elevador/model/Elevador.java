package br.com.letscode.elevador.model;

public class Elevador {

    private  int andarAtual;
    private  int capacidadeAtual;
    private  int capacidadeTotal;
    private  Predio predio;

    public Elevador(Predio predio) {
        this.predio = predio;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public Elevador(int capacidadeTotal, Predio predio) {
        this.capacidadeTotal = capacidadeTotal;
        this.predio = predio;
    }

    public  void entra(int x){
        if (this.capacidadeAtual + x > this.capacidadeTotal){
            System.out.println("Não é possivel entrar, elevador lotado");
        } else {
        this.capacidadeAtual = this.capacidadeAtual + x;
           if (x == 1){
               System.out.println(x + " pessoa entrou no elevador");
           } else {
               System.out.println(x + " pessoas entraram no elevador");
           }
        }
    }



}

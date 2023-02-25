package Aula03.Sincronismo;

public class ContaBancaria {

    private double saldo = 0;
    //private Object monitor = new Object();

    public synchronized void depositar(double valor){
       // synchronized (this){
            saldo += valor;
       //   System.out.println("Valor Depositado: " + valor);
       // }

    }

    public void sacar(double valor){
        synchronized (this) {
            saldo -= valor;
        }
    }

    public void extrato(){
        System.out.println("Saldo da Conta: " + saldo);
    }
}

package Aula03.Sincronismo;

public class ThreadContaBancaria extends Thread{
    private ContaBancaria conta;

    public ThreadContaBancaria (ContaBancaria conta) {
        this.conta = conta;
    }
    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            conta.depositar(200);
            conta.sacar(200);
        }
    }
}

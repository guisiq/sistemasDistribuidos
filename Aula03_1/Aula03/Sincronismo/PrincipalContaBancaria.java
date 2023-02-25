package Aula03.Sincronismo;

public class PrincipalContaBancaria {

    public static void main(String[] args) throws InterruptedException {
        ContaBancaria c1 = new ContaBancaria();

        ThreadContaBancaria t1 = new ThreadContaBancaria(c1);
        t1.start();

        ThreadContaBancaria t2 = new ThreadContaBancaria(c1);
        t2.start();

        t1.join();
        t2.join();

        c1.extrato();

    }
}

package Aula03.ProdutoConsumidor;

public class Principal {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Consumidor c1 = new Consumidor(buffer);
        c1.start();

        Produtor p1 = new Produtor(buffer);
        p1.start();

        Produtor p2 = new Produtor(buffer);
        p2.start();

        Produtor p3 = new Produtor(buffer);
        p3.start();

    }
}

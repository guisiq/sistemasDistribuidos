public class App {
    public static void main(String[] args) throws Exception {
        var transito = new Transito();
        transito.fluxo();
        var Carro1 = new Carro(0, transito,"Carro1");
        var Carro2 = new Carro(0, transito,"Carro2");
        var Carro3 = new Carro(0, transito,"Carro3");
        var Carro4 = new Carro(0, transito,"Carro4");
        transito.carros.add(Carro1);
        transito.carros.add(Carro2);
        transito.carros.add(Carro3);
        transito.carros.add(Carro4);
        Thread t1 = new Thread(Carro1);
        Thread t2 = new Thread(Carro2);
        t1.start();
        t2.start();
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        var car1 = new Carro("Carro 1", 100.0, 10.0, 1000);
        var car2 = new Carro("Carro 2", 100.0, 10.0,1000);
        var car3 = new Carro2("Carro 21", 100.0, 10.0, 1000);
        var car4 = new Carro2("Carro 22", 100.0, 10.0,1000);
        car1.start();
        car2.start();    
        new Thread(car3).start();
        new Thread(car4).start();
        
    }
}

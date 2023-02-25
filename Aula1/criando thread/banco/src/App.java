public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var conta = new Conta(0.0);
        // new Asseso(conta, 0, 100, 10).start(); 
        // new Asseso(conta, 1, 100, 10).start(); 
        var asseso1 = new Asseso(conta, 0, 100, 10); 
        var asseso2 = new Asseso(conta, 1, 100, 10); 
        
        asseso1.start();
        asseso2.start();
        System.out.println(conta.saldo);
    }

}

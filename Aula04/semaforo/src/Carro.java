public class Carro extends Thread{
    int esquina;
    Transito transito;
    String nome;
    public Carro(int esquina, Transito transito, String nome) {
        this.esquina = esquina;
        this.transito = transito;
        this.nome = nome;
    }   
    public void run() {
        avancar();
    }
    public synchronized void avancar() {
        while (true) {
            if (transito.isVerde) {
                esquina++;
                System.out.println("Carro {"+nome+"\t} esta na esquina :" + esquina);
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}

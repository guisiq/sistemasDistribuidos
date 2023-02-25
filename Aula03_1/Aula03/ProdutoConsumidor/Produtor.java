package Aula03.ProdutoConsumidor;

import java.util.Random;

public class Produtor extends Thread{
    private Buffer buffer;
    private static Random random = new Random();

    public Produtor (Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
       while(true){
            try {
                buffer.produzir(random.nextInt(1,11));
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

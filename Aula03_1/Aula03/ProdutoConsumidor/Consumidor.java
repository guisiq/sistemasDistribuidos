package Aula03.ProdutoConsumidor;

import java.util.Random;

public class Consumidor extends Thread{
    private Buffer buffer;
    private Random random = new Random();

    public Consumidor (Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
            while(true){
            try {
                buffer.consumir();
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package Aula03.ProdutoConsumidor;
import java.util.LinkedList;
import java.util.Queue;
public class Buffer {
    private static final int MAX = 10;
    private Queue<Integer> fila = new LinkedList<Integer>();

    public synchronized void produzir(int n) throws InterruptedException {
        
        while(fila.size() == MAX) {
            wait();
        }
        fila.offer(n);
            notify();
            imprimir();
    }
    public synchronized void consumir() throws InterruptedException {
        if(fila.size() == 0 ) {
            notify();
            wait();
        }
        fila.poll();
        imprimir();
    }
    private void imprimir() {
        System.out.print("=> ");
        for (Integer n : fila) {
            System.out.print(n + " ");
        }
        System.out.println();

    }
}

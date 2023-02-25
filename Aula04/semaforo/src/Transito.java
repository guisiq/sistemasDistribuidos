import java.util.ArrayList;
import java.util.List;

public class Transito {
    List<Carro> carros = new ArrayList<Carro>();
    Boolean isVerde = true;
    public synchronized void fluxo() {
        while (true) {
            isVerde = !isVerde;
            if (isVerde) {
                carros.forEach(x -> x.notifyAll());
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }   
}


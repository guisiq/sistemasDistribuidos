import java.io.IOException;
import java.nio.CharBuffer;

public class Carro2 implements Runnable{
    public Double velocidade;
    public Double aceleracao;
    public int distancia;
    public String nome;
    public Carro2(String nome,Double velocidade,Double aceleracao,int distancia){
        this.nome = nome;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.distancia = distancia;
    }
    public void Imprimir(){
        System.out.println("Carro: " + this.nome + " esta a  " + this.distancia + " km do destino ");
    }

    @Override
    public void run() {
        while(this.distancia > 0){
            this.Imprimir();
            this.distancia -= this.velocidade;
            this.velocidade += aceleracao;
            // try{
            //     Thread.sleep(1000);
            // }catch(InterruptedException e){
            //     e.printStackTrace();
            // }
        }        
    }
    
}
    


// See https://aka.ms/new-console-template for more information
public class ProdutorConsumidor
{
    public static void Main(string[] args)
    {   
        var messa = new fila(100);
        void produtor(){
            for (int i = 1; i < 10; i++)
            {
                // Console.WriteLine("Produtor");
                messa.inserir(i);
                Console.WriteLine("Produtor inseriu: " + i);
            }
        };
        void consumidor() {
            for (int i = 1; i < 10; i++)
            {
                // Console.WriteLine("Consumidor ");
                int valor = messa.remover();
                Console.WriteLine("Consumidor removeu: " + valor);
            }
        };
        var produtorT =  new Thread(produtor);
        var consumidorT =  new Thread(consumidor);
        produtorT.Start();
        consumidorT.Start();
        produtorT.Join();
        consumidorT.Join();

        messa.imprimir();
        Console.WriteLine("Hello, World!");
    }
}
public class fila
{
    private int[] buffer;
    private int inicio;
    private int fim;
    private int tamanho;
    private int quantidade;
    public fila(int tamanho)
    {
        this.tamanho = tamanho;
        buffer = new int[tamanho];
        inicio = 0;
        fim = 0;
        quantidade = 0;
    }
    public void inserir(int valor)
    {
        lock (this)
            {  
            if (quantidade == tamanho)
            {
                Console.WriteLine("Buffer cheio");
            }
            else
            {
                buffer[fim] = valor;
                fim = (fim + 1) % tamanho;
                quantidade++;
            }
        }
    }
    public int  remover()
    {
        lock (this)
        {            
            int valor = 0;
            if (quantidade == 0)
            {
                Console.WriteLine("Buffer vazio");
            }
            else
            {
                valor = buffer[inicio];
                inicio = (inicio + 1) % tamanho;
                quantidade--;
            }
            return valor;
        }
    }
    public void imprimir()
    {

        lock (this)
        {    
            int i = inicio;
            int q = quantidade;
            while (q > 0)
            {
                Console.Write(buffer[i]);
                i = (i + 1) % tamanho;
                q--;
            }
            Console.WriteLine();
        }
    }
}
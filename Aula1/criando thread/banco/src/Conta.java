public class Conta {
    public Double saldo;
    public double saque( double valor) {
        this.saldo -= valor;
        return this.saldo;
    }
    public double deposito( double valor){
        this.saldo += valor;
        return this.saldo;
        
    }
    public Conta(Double saldo) {
        this.saldo = saldo;
    }
    
}

public class Asseso extends Thread{
    Conta conta;
    int operacao = 0;
    int numOperacao = 20;
    int valorOperacao = 100;
    @Override
    public void run() {
        for (int i = 0; i < numOperacao; i++) {
            if (operacao == 1) {
                conta.deposito(valorOperacao);
            }else{
                conta.saque(valorOperacao);
            }
            //printSaldo();
        }
    }
    public void printSaldo(){
        System.out.println("operacao relizada :saldo na conta ="+conta.saldo);
    }
    public Asseso(Conta conta, int operacao, int numOperacao, int valorOperacao) {
        this.conta = conta;
        this.operacao = operacao;
        this.numOperacao = numOperacao;
        this.valorOperacao = valorOperacao;
    }
    public Asseso(Runnable target, Conta conta, int operacao, int numOperacao, int valorOperacao) {
        super(target);
        this.conta = conta;
        this.operacao = operacao;
        this.numOperacao = numOperacao;
        this.valorOperacao = valorOperacao;
    }
    public Asseso(String name, Conta conta, int operacao, int numOperacao, int valorOperacao) {
        super(name);
        this.conta = conta;
        this.operacao = operacao;
        this.numOperacao = numOperacao;
        this.valorOperacao = valorOperacao;
    }
    public Asseso(ThreadGroup group, Runnable target, Conta conta, int operacao, int numOperacao,
            int valorOperacao) {
        super(group, target);
        this.conta = conta;
        this.operacao = operacao;
        this.numOperacao = numOperacao;
        this.valorOperacao = valorOperacao;
    }
    public Asseso(ThreadGroup group, String name, Conta conta, int operacao, int numOperacao, int valorOperacao) {
        super(group, name);
        this.conta = conta;
        this.operacao = operacao;
        this.numOperacao = numOperacao;
        this.valorOperacao = valorOperacao;
    }
    public Asseso(Runnable target, String name, Conta conta, int operacao, int numOperacao, int valorOperacao) {
        super(target, name);
        this.conta = conta;
        this.operacao = operacao;
        this.numOperacao = numOperacao;
        this.valorOperacao = valorOperacao;
    }
    public Asseso(ThreadGroup group, Runnable target, String name, Conta conta, int operacao, int numOperacao,
            int valorOperacao) {
        super(group, target, name);
        this.conta = conta;
        this.operacao = operacao;
        this.numOperacao = numOperacao;
        this.valorOperacao = valorOperacao;
    }
    public Asseso(ThreadGroup group, Runnable target, String name, long stackSize, Conta conta, int operacao,
            int numOperacao, int valorOperacao) {
        super(group, target, name, stackSize);
        this.conta = conta;
        this.operacao = operacao;
        this.numOperacao = numOperacao;
        this.valorOperacao = valorOperacao;
    }
    public Asseso(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals,
            Conta conta, int operacao, int numOperacao, int valorOperacao) {
        super(group, target, name, stackSize, inheritThreadLocals);
        this.conta = conta;
        this.operacao = operacao;
        this.numOperacao = numOperacao;
        this.valorOperacao = valorOperacao;
    }
    
}
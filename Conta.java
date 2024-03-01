class Conta {
    String nome;
    String cpf;
    int nmrConta;
    String telefone;
    Double saldo;

    public void deposito(Double valor){
        this.saldo += valor;
    }

    public void saque(Double valor){
        this.saldo -= valor;
    }

    public void transferencia(Double valor, boolean recebe){
        if(recebe == true){
            this.saldo += valor;
        }else{
            this.saldo -= valor;
        }
    }
}

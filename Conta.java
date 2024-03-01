import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrente[] conta = new ContaCorrente[2];

        //Dados Conta 1
        conta[0] = new ContaCorrente();
        conta[0].nome = "Hugo Machado";
        conta[0].cpf = "487.654.364-45";
        conta[0].nmrConta = 458673;
        conta[0].telefone = "64 99345-7458";
        conta[0].saldo = 500.00;

        conta[1] = new ContaCorrente();
        conta[1].nome = "Rockye Junior";
        conta[1].cpf = "125.753.121-92";
        conta[1].telefone = "64 99341-0158";
        conta[1].nmrConta = 315478;
        conta[1].saldo = 250.00;
        
        int op = 0;
        do{
            System.out.print("\n\n============ Menu ============\n");
            System.out.println("1- Deposito");
            System.out.println("2- Saque");
            System.out.println("3- Transferencia");
            System.out.println("0- Finaliza Sessão");
            System.out.println("==============================");
            System.out.print("Digite uma das opcoes [1 ,2 ou 3]: ");

            op = scan.nextInt();

            if(op == 1){
                System.out.println("Digite a quantia de Deposito: ");
                Double deposito = scan.nextDouble();
                conta[0].deposito(deposito);

                System.out.println(conta[0].nome+", você depositou um total de R$ "+deposito+" em sua conta");
            }
            else if(op == 2){
                System.out.println("Digite a quantia do Saque: ");
                Double saque = scan.nextDouble();
                if(conta[0].saldo >= saque){
                    conta[0].saque(saque);
                    System.out.println(conta[0].nome+", você sacou R$ "+saque+" de sua conta");                    
                }else{
                    System.out.println("Saldo Insuficiente para Realizar o saque");
                }
            }
            else if(op == 3){
                System.out.println("Digite a quantia da transferência: ");
                Double transferencia = scan.nextDouble();
                if(conta[0].saldo >= transferencia){
                    conta[0].transferencia(transferencia, false);
                    conta[1].transferencia(transferencia, true);
                
                System.out.print("\n\nRealizando Transferência para a conta do "+conta[1].nome);
                }else{
                    System.out.println("Saldo Insuficiente para Realizar a transacao");
                }
            }
            else if(op == 0){
                System.out.println("Sessão Finalizada");
            }
            else{
                System.out.println("Opção nao valida! escolha novamente!");
            }
        } while(op != 0);
        
        for(int i=0; i<conta.length; i++){
            System.out.print("\n\n===== CONTA 01 ======\n");
            System.out.println("Nome: "+conta[i].nome);
            System.out.println("CPF: "+conta[i].cpf);
            System.out.println("Telefone: "+conta[i].telefone);
            System.out.println("Número da Conta: "+conta[i].nmrConta);
            System.out.println("Saldo: R$ "+conta[i].saldo);
        }
    }
}

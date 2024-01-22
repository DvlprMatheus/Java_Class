// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe.
public class ContaBancaria {

    // Atributos.
    private double saldo;
    public String getNumeroConta() {
        return "98765-4";
    }
    
    // Métodos Getter e Setter para manipular os atributos.
    public double getSaldo() {
        return saldo;
    }

    public void setDeposito(double deposito){
        saldo = saldo + deposito;
    }

    public void setSaque(double saque){
        saldo = saldo - saque;
    }

    // Função principal que gera a interface ao usuário.
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        Scanner scan = new Scanner(System.in);

        System.out.print("Olá, seja bem-vindo ao banco OMOTOR!\nDigite o número da conta: ");
        String confirm = scan.nextLine();

        // Condição que verifica a conta digitada pelo usuário.
        if(confirm.equals(conta.getNumeroConta())){
            // Tenta esse bloco de código previnindo erros.
            try{
                boolean i = true;

                // Laço de repetição que gera a interface ao usuário.
                while(i){
                    System.out.print("\n1) Saldo\n2) Depóstio\n3) Saque\n4) Sair\nO que deseja fazer: ");
                    int escolha = scan.nextInt();

                    switch (escolha){
                        case 1:
                            System.out.printf("\nO seu saldo é: %.2f\n", conta.getSaldo());
                            break;
                        case 2:
                            System.out.print("\nDigite o valor que deseja depositar: ");
                            conta.setDeposito(scan.nextDouble());
                            System.out.printf("O seu saldo é: %.2f\n", conta.getSaldo());
                            break;
                        case 3:
                            System.out.print("\nDigite o valor que deseja sacar: ");
                            conta.setSaque(scan.nextDouble());
                            System.out.printf("O seu saldo é: %.2f\n", conta.getSaldo());
                            break;
                        case 4:
                            System.out.println("\nAté mais!");
                            i = false;
                            break;
                    }
                } // Cria uma exceção que trata o erro.
            } catch (Exception e){
                System.out.println("Acesso negado!");
            }
        } else {
            System.out.println("\nConta inválida!");
        }
    }
}
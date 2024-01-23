// Importação da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação da classe.
public class Funcionario {

    // Atributos.
    private String nome;
    private String cargo;
    private double salario;

    // Métodos Getter e Setter para manipular os atributos.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAumento(double aumentoSalario) {
        salario = salario + ((aumentoSalario/100) * salario);
    }

    // Função principal que descreve o funcionário e utiliza o método de aumento.
    public static void main(String[] args){
        Funcionario func = new Funcionario();

        Scanner scan = new Scanner(System.in);

        func.setNome("Gabriel Goularte");
        func.setCargo("Youtuber");
        func.setSalario(3670.00);

        try{
            System.out.printf("---------- Descrição do Funcionário ----------\nNome: %s\nCargo: %s\nSalário: %.2f\n----------------------------------------------\n", func.getNome(), func.getCargo(), func.getSalario());

            System.out.print("Qual é a porcentagem do aumento: ");
            func.setAumento(scan.nextInt());

            System.out.println("O salário com aumento: R$" + func.getSalario());
        } catch (Exception e){
            System.out.println("Valor inválido!");
        }
    }
}
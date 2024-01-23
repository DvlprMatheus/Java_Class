// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação de classe.
public class Calendario {

    // Atributos.
    private int dia;
    private int mes;
    private int ano;

    // Métodos Getter e Setter para manipular os atributos.
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValData(int dia, int mes, int ano){
        if(ano < 1900 || ano > 2100) {
            System.out.println("Ano inválido!");
        } else {
            if(mes > 12) {
                System.out.println("Mês inválido!");
            } else {
                switch (mes){
                    case 1, 3, 5, 7, 8, 10, 12:
                        if(dia > 31){
                            System.out.println("Dia inválido!");
                        } else {
                            System.out.printf("A data %d/%d/%d é válida!", dia, mes, ano);
                        }
                        break;
                    case 2:
                        if(dia > 28){
                            System.out.println("Dia inválido!");
                        } else {
                            System.out.printf("A data %d/%d/%d é válida!", dia, mes, ano);
                        }
                        break;
                    case 4, 6, 9, 11:
                        if(dia > 30){
                            System.out.println("Dia inválido!");
                        } else {
                            System.out.printf("A data %d/%d/%d é válida!", dia, mes, ano);
                        }
                        break;
                }
            }
        }
    }

    // Função principal que setta os atributos e chama o método de validação da data.
    public static void main(String[] args){
        Calendario calendar = new Calendario();

        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Digite um dia (Apenas número): ");
            calendar.setDia(scan.nextInt());

            System.out.print("Digite um mês (Apenas número): ");
            calendar.setMes(scan.nextInt());

            System.out.print("Digite um ano (Apenas número): ");
            calendar.setAno(scan.nextInt());

            calendar.setValData(calendar.getDia(), calendar.getMes(), calendar.getAno());

        } catch (Exception e){
            System.out.println("Valor inválido!");
        }
    }
}
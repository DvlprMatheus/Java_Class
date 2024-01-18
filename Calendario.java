// Import da classe Scanner que é responsável pelo input.
import java.util.Scanner;

// Criação de classe.
public class Calendario {

    // Atributo dia.
    int dia = 31;

    // Atributo mês.
    int mes = 12;

    // Atributo ano máximo.
    int ano_max = 2100;

    // Atributo ano mínimo.
    int ano_min = 1500;

    // Método de validação da data digitada pelo usuário.
    static void methValidacao(){
        // Objeto para acessar os atributos.
        Calendario calenObj = new Calendario();

        // Input do ano.
        Scanner diaObj = new Scanner(System.in);
        System.out.print("Digite o dia (Apenas o Número): ");

        // Coleta de dados.
        int conf_dia = diaObj.nextInt();

        // Input do mês.
        Scanner mesObj = new Scanner(System.in);
        System.out.print("Digite o mês (Apenas o Número): ");

        // Coleta de dados.
        int conf_mes = mesObj.nextInt();

        // Input do ano.
        Scanner anoObj = new Scanner(System.in);
        System.out.print("Digite o ano (Apenas o Número): ");

        // Coleta de dados.
        int conf_ano = anoObj.nextInt();

        // Condição da validação do ano.
        if(conf_ano > calenObj.ano_max || conf_ano < calenObj.ano_min){

            // Exibição do erro.
            System.out.println("Data inválida!\nAno máximo: " + calenObj.ano_max + "\nAno mínimo: " + calenObj.ano_min);
        } else {

            // Condição da validação do mês.
            if(conf_mes > calenObj.mes){

                // Exibição do erro.
                System.out.println("Data inválida!\nMês máximo: " + calenObj.mes);
            } else {

                // Switch responsável para validar os dias, com a condição de alteração para ter 31, 30 ou 28 dias de acordo com o mês.
                switch (conf_mes){

                    // Meses 1, 3, 5, 7, 8, 10 e 12.
                    case 1, 3, 5, 7, 8, 10, 12:
                        if(conf_dia > calenObj.dia){
                            System.out.println("Data inválida!\nDia máximo: " + calenObj.dia);
                        } else {
                            System.out.printf("A data: %d / %d / %d é válida!", conf_dia, conf_mes, conf_ano);
                        }
                        break;

                    // Mês 2.
                    case 2:
                        calenObj.dia = 28;

                        if(conf_dia > calenObj.dia){
                            System.out.println("Data inválida!\nDia máximo: " + calenObj.dia);
                        } else {
                            System.out.printf("A data: %d / %d / %d é válida!", conf_dia, conf_mes, conf_ano);
                        }
                        break;

                    // Meses 4, 6, 9, 11.
                    case 4, 6, 9, 11:
                        calenObj.dia = 30;

                        if(conf_dia > calenObj.dia){
                            System.out.println("Data inválida!\nDia máximo: " + calenObj.dia);
                        } else {
                            System.out.printf("A data: %d / %d / %d é válida!", conf_dia, conf_mes, conf_ano);
                        }
                        break;
                    default:

                        // Prevenção de erro.
                        System.out.print("Erro!");
                }
            }
        }
    }

    // Função principal que chama o método.
    public static void main(String[] args){
        methValidacao();
    }
}

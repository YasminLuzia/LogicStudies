/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (06/11/19)
 * 3.Desenvolva um algoritmo que leia o nome e o valor de vendas de janeiro, fevereiro e março de um vendedor. Seu programa deve classificar o vendedor de acordo com sua média de vendas. Veja a categoria do vendedor de acordo com a tabela abaixo.  Seu programa deve imprimir na tela:
 * O vendedor “tal”, vendeu R$ “tanto” e sua categoria é “tal”.   
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double valorJaneiro;
        double valorFevereiro;
        double valorMarco;
        
        double media;
        String desempenho;
        
        System.out.println("Digite o nome do funcionário: ");
        nome=leia.nextLine();
        System.out.println("\fDigite o valor de vendas de Janeiro: ");
        valorJaneiro=leia.nextDouble();
        System.out.println("\fDigite o valor de vendas de Fevereiro: ");
        valorFevereiro=leia.nextDouble();
        System.out.println("\fDigite o valor de vendas de Março: ");
        valorMarco=leia.nextDouble();
        
        media=(valorJaneiro+valorFevereiro+valorMarco)/3;
        if(media<=1000){
            desempenho="Péssimo vendedor";
        }else if(media>1000 && media<=2500){
            desempenho="Vendedor desmotivado";
        }else if(media>2500 && media<=5000){
            desempenho="Vendedor bom";
        }else if(media>5000 && media<=10000){
            desempenho="Ótimo vendedor";
        }else{
            desempenho="Excelente vendedor - Receber prêmio";
        }
        
        System.out.println("\fO vendedor "+nome+", vendeu R$ "+media+" e sua categoria é "+desempenho);
    }
}
/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (29/10/19)
 * 3.Desenvolva um programa que leia um valor em reais, cotação atual do dólar, a cotação atual do euro. Seu programa deve calcular e mostrar a conversão para dólar e a conversão para euro.   
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double valorReais;
        double euroAtual;
        double dolarAtual;
        double conversaoEuro;
        double conversaoDolar;
        
        System.out.println("Digite a quantidade em reais para a conversão: ");
        valorReais=leia.nextDouble();
        System.out.println("Digite o valor do dólar atual: ");
        dolarAtual=leia.nextDouble();
        System.out.println("Digite o valor do euro atual: ");
        euroAtual=leia.nextDouble();
        
        conversaoEuro=euroAtual*valorReais;
        conversaoDolar=dolarAtual*valorReais;
        
        System.out.println("Seu valor de reais em dólares é R$"+conversaoDolar);
        System.out.println("Seu valor de reais em euros é R$"+conversaoEuro);
    }
}
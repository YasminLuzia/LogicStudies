/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (31/10/19 - Feliz Halloween!!!)
 *  3.Faça um programa que receba o preço por litro de um combustível, a quantidade de quilômetros por litro de um determinado carro, e a distância a percorrer desejada. Seu programa deverá exibir quantos litros serão necessários para percorrer esta distância e quanto será gasto.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double precoLitro;
        double quantidadeKmL;
        double distancia;
        double litros;
        double valor;
        
        System.out.println("Digite o preço por litro de combustível: ");
        precoLitro=leia.nextDouble();
        System.out.println("Digite a quantidade de quilômetros por litro do carro: ");
        quantidadeKmL=leia.nextDouble();
        System.out.println("Digite a distância a percorrer desejada: ");
        distancia=leia.nextDouble();
        
        litros=distancia/quantidadeKmL;
        valor=litros*precoLitro;
        
        System.out.println("Serão necessários "+litros+" litros para percorer tal distância.");
        System.out.println("Sera gasto R$"+valor+" para chegar ao destino.");
    }
}
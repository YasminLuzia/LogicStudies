/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (29/10/19)
 * 7.Desenvolva um programa que leia o nome, três notas e seus respectivos pesos. Seu programa deve calcular a média ponderada .
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double peso1;
        double peso2;
        double peso3;
        double media;
        
        System.out.println("Nome: ");
        nome=leia.nextLine();
        System.out.println("Nota 1: ");
        nota1=leia.nextDouble();
        System.out.println("Peso da nota 1: ");
        peso1=leia.nextDouble();
        System.out.println("Nota 2: ");
        nota2=leia.nextDouble();
        System.out.println("Peso da nota 2: ");
        peso2=leia.nextDouble();
        System.out.println("Nota 3: ");
        nota3=leia.nextDouble();
        System.out.println("Peso da nota 3: ");
        peso3=leia.nextDouble();
        
        media=(nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
        
        System.out.println("A média de "+nome+" é "+media);
    }
}
/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (31/10/19 - Feliz Halloween!!!)
 * 2.Faça um algoritmo que receba o peso de uma pessoa em Kg. E calcule: 
 O novo peso dessa pessoa ao engordar 15% 
 O novo peso dessa pessoa ao emagrecer 20%  
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double peso;
        double pesoEngordar;
        double pesoEmagrecer;
        
        System.out.println("Digite o peso em Kg: ");
        peso=leia.nextDouble();
        
        pesoEngordar=peso*1.15;
        pesoEmagrecer=peso*0.8;
        
        System.out.println("\fO peso da pessoa ao engordar é "+pesoEngordar);
        System.out.println("O peso da pessoa ao emagrecer é "+pesoEmagrecer);
    }
}
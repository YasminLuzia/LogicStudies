/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (31/10/19 - Feliz Halloween!!!)
 * 4.Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual. O programa resultará: a idade dessa pessoa em anos,meses, dias, semanas, horas, minutos e segundos.   
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double anoNascimento;
        double anoAtual;
        double anos;
        double meses;
        double semanas;
        double dias;
        double horas;
        double minutos;
        double segundos;
        
        System.out.println("\fDigite seu ano de nascimento: ");
        anoNascimento=leia.nextDouble();
        System.out.println("\fDigite o ano atual: ");
        anoAtual=leia.nextDouble();
        
        anos=anoAtual-anoNascimento;
        meses=anos*12;
        semanas=anos*52;
        dias=anos*365;
        horas=dias*24;
        minutos=horas*60;
        segundos=minutos*60;
        
        System.out.println("\fA idade da pessoa é de "+anos+" anos, "+meses+" meses, "+semanas+" semanas, "+dias+" dias, "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
    }
}
/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (05/11/19)
 * 1.	Faça um algoritmo que leia um valor inteiro e retorne se este valor é PAR POSITIVO, PAR NEGATIVO, IMPAR POSITIVO, IMPAR NEGATIVO ou NULO.    
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        int valor;
        String resposta;
        
        System.out.println("Digite o número: ");
        valor=leia.nextInt();
        
        if(valor%2==0 && valor>0){
            resposta="par e positivo";
        }else if(valor%2==0 && valor<0){
            resposta="par e negativo";
        }else if(valor%2!=0 && valor>0){
            resposta="impar e positivo";
        }else if(valor%2!=0 && valor<0){
            resposta="impar e negativo";
        }else{
            resposta="nulo";
        }
        
        System.out.println("\fO seu número é "+resposta);
    }
}
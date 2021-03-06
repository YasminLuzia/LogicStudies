/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (05/11/19)
 * 2.Faça um programa que dada a idade e o nome de um nadador classifica-o em uma das seguintes categorias: 
 •Menor de 8 ou maiores de 70 anos – não pode ser nadador  
 •Infantil = 8-10 anos   
 •Pré-Adolescente = De 11 até 12 anos   
 •Adolescente = De 13 até 17 anos  
 •Adulto = maiores iguais e 18 anos e menores que 60  
 •Idoso = maiores iguais a 60 e menores que 70  
Pense que um nadador terá idade, e seu programa deve dizer a categoria que o mesmo irá nadar.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        int idade;
        String nome;
        String categoria;
        
        System.out.println("Digite o nome do nadador: ");
        nome=leia.nextLine();
        System.out.println("Digite a idade: ");
        idade=leia.nextInt();
        
        if (idade<=8 || idade>=70){
            categoria="Não pode ser nadador";
        }else if(idade>=8 && idade<=10){
            categoria="Infantil";
        }else if(idade>=11 && idade<=12){
            categoria="Pré-adolescente";
        }else if(idade>=13 && idade<=17){
            categoria="Adolescente";
        }else if(idade>=18 && idade<=60){
            categoria="Adulto";
        }else{
            categoria="Idoso";
        }
        
        System.out.println("\fNome: "+nome+"\nCategoria: "+categoria);
    }
}
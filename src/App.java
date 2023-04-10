import java.util.Scanner;
//Exercicio 13: Tendo como dado de entrada a altura (h) de uma pessoa,
//construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7
class Main {
public static void main(String[] args){
//Declaração de variáveis
String genero;
int altura;
int pesoIdeal;
//Fazer a entrada de dados
Scanner teclado = new Scanner(System.in);
System.out.println("Digite seu genero (H para homem e M para mulher): ");
genero = teclado.nextLine();
System.out.println("Digite sua altura: ");
altura = teclado.nextInt();

  
if (genero.equals("H")){
pesoIdeal = (72.7 * altura) - 58;
System.out.println("Seu peso ideal é: " + pesoIdeal);
}

else {
 pesoIdeal = (62.1 * altura) - 44.7;
System.out.println("Seu peso ideal é: " + pesoIdeal);
}
teclado.close();
  }
}
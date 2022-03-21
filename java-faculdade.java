import java.util.Scanner;
public class Operacoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        	int num1, num2, soma, subtracao, multiplicacao, divisao;
        
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        
        soma = num1 + num2; 
        subtracao = soma - num2;
        multiplicacao = subtracao * num2;
        divisao = multiplicacao / num2; 
        
        System.out.println();
        System.out.println("soma = " + (soma));
        System.out.println("subtração = " + (subtracao));
        System.out.println("multiplicação = " + (multiplicacao));
        System.out.println("divisão = " + (divisao));
    }
}

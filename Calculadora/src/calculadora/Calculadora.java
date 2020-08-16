package calculadora;

import java.util.Scanner;

/**
 * 
 * @author LeandroGodoy
 * @version 1.0 
 */
public class Calculadora {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        double num1, num2, resultado;
        System.out.println("Digiite o primeiro número: ");
        Scanner leia = new Scanner (System.in);
        num1 = leia.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextDouble();
        Operacao resul =  new Operacao();
        resultado = resul.soma(num1, num2);
        System.out.println("A soma é: "+ resultado);
        resultado = resul.subtracao(num1, num2);
        System.out.println("A subtracao é: "+ resultado);
        resultado = resul.divisao(num1, num2);
        System.out.println("A divisão é: "+ resultado);
        resultado = resul.multiplicacao(num1, num2);
        System.out.println("A multipliacao é: "+ resultado);
    }
    
}

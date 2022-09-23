package Aula01;

import java.util.Scanner;

public class SomarComArgumentos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        Integer a = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        Integer b = scanner.nextInt();

        Integer resultado = Somar(a, b);

        System.out.println("Resultado: " + resultado);
    }

    private static Integer Somar(Integer a, Integer b) {
        return a + b;
    }
}

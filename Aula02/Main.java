package Aula02;

public class Main {
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // divisao
        Integer resultadoDivisao = calculadora.dividir(10, 2);
        System.out.println("Resultado da divisão " + resultadoDivisao);
        
        // adicao / somar
        Integer resultadoSoma = calculadora.somar(10, 2);
        System.out.println("Resultado da soma " + resultadoSoma);
    }
}

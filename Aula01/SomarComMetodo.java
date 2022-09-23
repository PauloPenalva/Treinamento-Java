package Aula01;

public class SomarComMetodo {
    
    public static void main(String[] args) {

        Integer a = 2;
        Integer b = 2;

        Integer resultado = Somar(a, b);

        System.out.println("Soma de 2 numeros inteiros = " + resultado);
    }

    private static Integer Somar(Integer a, Integer b) {

        return a + b;
    }
}

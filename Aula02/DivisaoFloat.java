package Aula02;

public class DivisaoFloat {
    
    public static void main(String[] args) {
        dividir();
    }

    private static void dividir() {
        Float a = 3f;
        Float b = 2f;

        Float resultado = processaDivisao(a, b);

        System.out.println("Resultado divisao " + resultado);
    }

    private static Float processaDivisao(Float a, Float b) {
        try {
            return a / b;
        } catch (Exception e) {
            return 0F;
        }
    }
    
}

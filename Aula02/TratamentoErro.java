package Aula02;

public class TratamentoErro {
    
    public static void main(String[] args) {
        dividir();
    }

    private static void dividir() {
        Integer a = 3;
        Integer b = 0;

        Integer resultado = processaDivisao(a, b);

        System.out.println("Resultado divisao " + resultado);
    }

    private static Integer processaDivisao(Integer a, Integer b) {
        try {
            return a / b;
        } catch (Exception e) {
            return 0;
        }
    }
}

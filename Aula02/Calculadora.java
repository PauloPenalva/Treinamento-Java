package Aula02;

public class Calculadora {
    
    public Integer dividir(Integer a, Integer b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Não é possivel dividir por 0.");
            return 0;
        }
    }

    public Integer somar(Integer a, Integer b) {
        return a + b;
    }
}

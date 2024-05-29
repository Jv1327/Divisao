import java.util.Scanner;

public class DivisaoCalculator{
    int n1;
    int n2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o Primeiro número inteiro: ");
            String n1 = scanner.nextLine();

            System.out.println("Digite o Segundo número inteiro: ");
            String n2 = scanner.nextLine();

            if(n1.equals("")|| n2.equals("")) {
                throw new CustomException("Digite Um Número Válido");
            }
            double resultado = dividir(Integer.parseInt(n1), Integer.parseInt(n2));
            System.out.println("O resultado da divisão é: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");

        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira apenas números inteiros.");

        } catch (CustomException e) {
            System.out.println("Erro personalizado: " + e.getMessage());
        }
    }

    public static double dividir(int n1, int n2) throws CustomException {
        if (n2 == 0) {
            throw new ArithmeticException("Divisão por Zero.");
        }

        return (double) n1 / n2; 
    }
    
    static class CustomException extends Exception {

        public CustomException(String message) {
            super(message);
        }
    }
}

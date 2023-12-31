import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // a. Solicitar ao usuário que insira um número inteiro positivo N.
            System.out.println("Digite um número inteiro positivo N:");
            int N = scanner.nextInt();

            // b. Pedir ao usuário que insira N números inteiros distintos no intervalo de 0 a 100.
            int[] numeros = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.println("Digite o " + (i + 1) + "º número (entre 0 e 100):");
                int numero = scanner.nextInt();

                // Verificar se o número está no intervalo permitido
                if (numero < 0 || numero > 100) {
                    throw new IllegalArgumentException("Número fora do intervalo permitido (0 a 100).");
                }

                numeros[i] = numero;
            }

            // d. Calcular a média dos números no array.
            double media = calcularMedia(numeros);

            // e. Tratar exceções
            System.out.println("Média dos números: " + media);

            // f. Lançar exceção personalizada se a média for menor que 60
            if (media < 60) {
                throw new MediaInsuficiente("Média inferior a 60.");
            }

        } catch (InputMismatchException e) {
            // Tratar entrada inválida para N
            System.out.println("Erro: Digite um número inteiro válido para N.");
            main(args); // Reiniciar o programa

        } catch (IllegalArgumentException e) {
            // Tratar entrada inválida para os números individuais
            System.out.println("Erro: " + e.getMessage());
            main(args); // Reiniciar o programa

        } catch (ArrayIndexOutOfBoundsException e) {
            // Tratar acesso a posição inexistente no array
            System.out.println("Erro: Tentativa de acessar uma posição inexistente no array.");
            main(args); // Reiniciar o programa

        } catch (ArithmeticException e) {
            // Tratar divisão por zero
            System.out.println("Erro: Divisão por zero. Assumindo média como 0.");
            main(args); // Reiniciar o programa

        } catch (MediaInsuficiente e) {
            // Tratar a exceção personalizada MediaInsuficiente
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Método para calcular a média dos números no array
    private static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            throw new ArithmeticException("Array vazio. Não é possível calcular a média.");
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        return (double) soma / numeros.length;
    }

    // Exceção personalizada para média inferior a 60
    static class MediaInsuficiente extends Exception {
        public MediaInsuficiente(String message) {
            super(message);
        }
    }
}


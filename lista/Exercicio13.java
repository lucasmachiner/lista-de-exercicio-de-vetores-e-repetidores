package lista;

public class Exercicio13 {
  public static void executar() {
    Prompt.imprimir("Digite o valor de n para a sequência de Fibonacci: ");
    int n = Prompt.lerInteiro();

    int[] fibonacci = fibonacci(n);

    Prompt.imprimir("Os " + n + " primeiros termos da sequência de Fibonacci são:");
    for (int i = 0; i < n; i++) {
      Prompt.imprimir(fibonacci[i] + " ");
    }
  }

  public static int[] fibonacci(int n) {
    int[] fibonacci = new int[n];

    fibonacci[0] = 1;
    fibonacci[1] = 1;

    for (int i = 2; i < n; i++) {
      fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    return fibonacci;
  }
}

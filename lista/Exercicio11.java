package lista;

public class Exercicio11 {
  public static void executar() {
    int[] A = new int[5];
    int[] B = new int[5];

    // Preenchendo o vetor A com os dados inseridos pelo usuário
    Prompt.imprimir("Digite os 5 elementos do vetor A:");
    for (int i = 0; i < A.length; i++) {
      Prompt.imprimir("Elemento " + (i + 1) + ": ");
      A[i] = Prompt.lerInteiro();
    }

    // Preenchendo o vetor B com os dados inseridos pelo usuário
    Prompt.imprimir("\nDigite os 5 elementos do vetor B:");
    for (int i = 0; i < B.length; i++) {
      Prompt.imprimir("Elemento " + (i + 1) + ": ");
      B[i] = Prompt.lerInteiro();
    }

    // Calculando o produto escalar
    int produtoEscalar = 0;
    for (int i = 0; i < 5; i++) {
      produtoEscalar += A[i] * B[i];
    }

    // Exibindo o produto escalar
    Prompt.imprimir("\nProduto escalar entre os vetores A e B: " + produtoEscalar);
  }
}

package lista;

public class Exercicio10 {
  public static void executar() {
    int[] A = new int[5];
    int[] B = new int[5];

    Prompt.imprimir("Digite os 5 elementos do vetor A:");
    for (int i = 0; i < A.length; i++) {
      Prompt.imprimir("Elemento " + (i + 1) + ": ");
      A[i] = Prompt.lerInteiro();
    }

    for (int i = 0; i < A.length; i++) {
      B[i] = A[A.length - 1 - i];
    }

    Prompt.imprimir("\nVetor B (cópia de A invertida): ");
    for (int i = 0; i < B.length; i++) {
      Prompt.imprimir(B[i] + " ");
    }
  }
}

package lista;

public class Exercicio9 {
  public static void executar() {
    int[] A = new int[5];
    int[] B = new int[5];

    Prompt.imprimir("Digite os 5 elementos do vetor A:");
    for (int i = 0; i < A.length; i++) {
      Prompt.imprimir("Elemento " + (i + 1) + ": ");
      A[i] = Prompt.lerInteiro();
    }

    Prompt.imprimir("\nDigite os 5 elementos do vetor B:");
    for (int i = 0; i < B.length; i++) {
      Prompt.imprimir("Elemento " + (i + 1) + ": ");
      B[i] = Prompt.lerInteiro();
    }

    int[] C = new int[A.length + B.length];

    for (int i = 0; i < A.length; i += 2) {
      C[i] = A[i];
    }

    for (int i = 1; i < B.length; i += 2) {
      C[i] = B[i];
    }

    Prompt.imprimir("\nVetor C (de acordo com as regras especificadas): ");
    for (int i = 0; i < C.length; i++) {
      Prompt.imprimir(C[i] + " ");
    }
  }
}

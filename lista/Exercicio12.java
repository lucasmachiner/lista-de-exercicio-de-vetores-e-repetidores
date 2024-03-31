package lista;

public class Exercicio12 {
  public static void executar() {
    int[] vetor = new int[12];

    Prompt.imprimir("Digite os 12 elementos do vetor:");
    for (int i = 0; i < vetor.length; i++) {
      Prompt.imprimir("Elemento " + (i + 1) + ": ");
      vetor[i] = Prompt.lerInteiro();
    }

    int produto = 1;

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > 0 && vetor[i] % 2 == 0) {
        produto *= vetor[i];
      }
    }

    Prompt.imprimir("\nO produto dos elementos pares positivos é: " + produto);
  }
}

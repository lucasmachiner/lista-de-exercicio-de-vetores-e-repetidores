package lista;

public class Exercicio14 {
  public static void executar() {
    int[] vetor = new int[5];

    Prompt.imprimir("Digite os 5 elementos do vetor:");
    for (int i = 0; i < vetor.length; i++) {
      Prompt.imprimir("Elemento " + (i + 1) + ": ");
      vetor[i] = Prompt.lerInteiro();
    }

    int indiceMaior = 0;
    for (int i = 1; i < vetor.length; i++) {
      if (vetor[i] > vetor[indiceMaior]) {
        indiceMaior = i;
      }
    }

    int temp = vetor[indiceMaior];
    vetor[indiceMaior] = vetor[vetor.length - 1];
    vetor[vetor.length - 1] = temp;

    Prompt.imprimir("\nVetor atualizado com o maior elemento na última posição: ");
    for (int i = 0; i < vetor.length; i++) {
      Prompt.imprimir(vetor[i] + " ");
    }
  }
}

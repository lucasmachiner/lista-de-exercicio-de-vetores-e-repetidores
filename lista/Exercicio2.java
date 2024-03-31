package lista;

public class Exercicio2 {
  public static void executar() {
    Prompt.imprimir("Digite o tamanho do vetor: ");
    int tamanho = Prompt.lerInteiro();

    int[] vetor = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
      Prompt.imprimir("Digite o número na posição " + i + ": ");
      vetor[i] = Prompt.lerInteiro();
    }

    for (int i = 0; i < tamanho; i++) {
      if (vetor[i] > 0) {
        Prompt.imprimir("Número na posição " + i + " é positivo.");
      } else if (vetor[i] < 0) {
        Prompt.imprimir("Número na posição " + i + " é negativo.");
      } else {
        Prompt.imprimir("Número na posição " + i + " é zero.");
      }
    }
  }

}

package lista;

public class Exercicio5 {
  public static void executar() {
    int[] vetor = new int[5];

    for (int i = 0; i < 5; i++) {
      Prompt.imprimir("Digite o número na posição " + i + ": ");
      vetor[i] = Prompt.lerInteiro();
    }

    Prompt.imprimir("Digite o número que deseja buscar: ");
    int n = Prompt.lerInteiro();

    int contagem = 0;
    for (int i = 0; i < 5; i++) {
      if (vetor[i] == n) {
        contagem++;
      }
    }

    Prompt.imprimir("O número " + n + " aparece " + contagem + " vez(es) no vetor.");
  }
}

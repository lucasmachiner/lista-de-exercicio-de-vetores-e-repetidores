package lista;

public class Exercicio3 {
  public static void executar() {
    Prompt.imprimir("Digite o tamanho do vetor: ");
    int tamanho = Prompt.lerInteiro();

    int[] vetorOriginal = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
      Prompt.imprimir("Digite o número na posição " + i + ": ");
      vetorOriginal[i] = Prompt.lerInteiro();
    }

    int[] vetorDobro = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
      vetorDobro[i] = vetorOriginal[i] * 2;
    }

    Prompt.imprimir("Valores do segundo vetor (dobro do primeiro vetor):");
    for (int i = 0; i < tamanho; i++) {
      Prompt.imprimir(vetorDobro[i]);
    }
  }
}

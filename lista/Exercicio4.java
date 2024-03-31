package lista;

public class Exercicio4 {
  public static void executar() {
    int[] vetor = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o número na posição " + i + ": ");
      vetor[i] = Prompt.lerInteiro();
    }

    System.out.print("Digite o valor de n: ");
    int n = Prompt.lerInteiro();

    Prompt.imprimir("Índices dos elementos inferiores a " + n + ":");
    for (int i = 0; i < 5; i++) {
      if (vetor[i] < n) {
        Prompt.imprimir(i);
      }
    }
  }
}

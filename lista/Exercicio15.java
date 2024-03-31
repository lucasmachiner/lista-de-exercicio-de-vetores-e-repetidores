package lista;

public class Exercicio15 {
  public static void executar() {
    int[] vetor = new int[5];

    Prompt.imprimir("Digite o primeiro número: ");
    vetor[0] = Prompt.lerInteiro();

    for (int i = 1; i < 5; i++) {
      int numero;
      do {
        Prompt.imprimir("Digite o próximo número (maior que " + vetor[i - 1] + "): ");
        numero = Prompt.lerInteiro();
        if (numero <= vetor[i - 1]) {
          Prompt.imprimir("O número digitado deve ser maior que " + vetor[i - 1] + ".");
        }
      } while (numero <= vetor[i - 1]);
      vetor[i] = numero;
    }

    Prompt.imprimir("\nVetor preenchido:");
    for (int i = 0; i < 5; i++) {
      Prompt.imprimir(vetor[i] + " ");
    }
  }
}

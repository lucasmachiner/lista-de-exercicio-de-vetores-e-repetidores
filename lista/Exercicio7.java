package lista;

import java.util.Arrays;

public class Exercicio7 {
  public static void executar() {
    int[] vetor1 = new int[5];
    int[] vetor2 = new int[5];

    Prompt.imprimir("Digite os elementos do primeiro vetor:");
    for (int i = 0; i < 5; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      vetor1[i] = Prompt.lerInteiro();
    }

    Prompt.imprimir("\nDigite os elementos do segundo vetor:");
    for (int i = 0; i < 5; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      vetor2[i] = Prompt.lerInteiro();
    }

    boolean saoIguais = Arrays.equals(vetor1, vetor2);

    if (saoIguais) {
      Prompt.imprimir("\nOs dois vetores são iguais.");
    } else {
      Prompt.imprimir("\nOs dois vetores são diferentes.");
    }
  }
}

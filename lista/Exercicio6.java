package lista;

public class Exercicio6 {
  public static void executar() {
    double[] notas = new double[5];
    double[] pesos = new double[5];

    Prompt.imprimir("Digite as 5 notas do aluno:");
    for (int i = 0; i < 5; i++) {
      System.out.print("Nota " + (i + 1) + ": ");
      notas[i] = Prompt.lerDecimal();
    }

    Prompt.imprimir("\nDigite os 5 pesos correspondentes:");
    for (int i = 0; i < 5; i++) {
      System.out.print("Peso " + (i + 1) + ": ");
      pesos[i] = Prompt.lerDecimal();
    }

    double somaProdutos = 0;
    double somaPesos = 0;
    for (int i = 0; i < 5; i++) {
      somaProdutos += notas[i] * pesos[i];
      somaPesos += pesos[i];
    }

    double mediaPonderada = somaProdutos / somaPesos;

    Prompt.imprimir("\nA média ponderada do aluno é: " + mediaPonderada);
  }
}

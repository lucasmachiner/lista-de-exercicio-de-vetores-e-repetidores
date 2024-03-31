package lista;

public class Exercicio1 {
  public static void executar() {

    double[] numeros = new double[5];
    double sum = 0;

    for (int i = 0; i < numeros.length; i++) {
      Prompt.imprimir("Informe o numero " + (i + 1));
      numeros[i] = Prompt.lerDecimal();
      sum += numeros[i];
    }

    double media = sum / numeros.length;

    Prompt.imprimir("A média é: " + (media / numeros.length));

    for (int i = 0; i < numeros.length; i++) {

      if (media == numeros[i]) {
        Prompt.imprimir("Esse número é igual que a média " + numeros[i]);
      } else if (media > numeros[i]) {
        Prompt.imprimir("Esse número é maior que a média " + numeros[i]);
      } else {
        Prompt.imprimir("Esse número é menor que a média " + numeros[i]);
      }
    }

  }
}

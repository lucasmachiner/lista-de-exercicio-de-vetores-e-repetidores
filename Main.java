import lista.Exercicio1;
import lista.Prompt;

public class Main {
  public static void main(String[] args) {
    int exercico = 0;

    Prompt.imprimir("Informe o número do exercico que deseja executar");
    Prompt.imprimir("1 - Exercicio 1");
    exercico = Prompt.lerInteiro();

    switch (exercico) {
      case 1:
        Prompt.imprimir("Exercicio 1 sendo executado");
        Prompt.separador();
        Exercicio1.executar();
        break;

      default:
        break;
    }

  }

}
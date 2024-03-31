import lista.Exercicio1;
import lista.Exercicio2;
import lista.Exercicio3;
import lista.Prompt;

public class Main {
  public static void main(String[] args) {
    int exercico = 0;

    Prompt.imprimir("Informe o número do exercico que deseja executar");
    Prompt.imprimir("1 - Exercicio 1");
    Prompt.imprimir("2 - Exercicio 2");
    Prompt.imprimir("3 - Exercicio 3");
    exercico = Prompt.lerInteiro();

    switch (exercico) {
      case 1:
        Prompt.imprimir("Exercicio 1 sendo executado");
        Prompt.separador();
        Exercicio1.executar();
        break;
      case 2:
        Prompt.imprimir("Exercicio 2 sendo executado");
        Prompt.separador();
        Exercicio2.executar();
        break;
      case 3:
        Prompt.imprimir("Exercicio 3 sendo executado");
        Prompt.separador();
        Exercicio3.executar();
        break;

      default:
        break;
    }

  }

}
import lista.Exercicio1;
import lista.Exercicio2;
import lista.Exercicio3;
import lista.Exercicio4;
import lista.Exercicio5;
import lista.Exercicio6;
import lista.Exercicio7;
import lista.Exercicio8;
import lista.Prompt;

public class Main {
  public static void main(String[] args) {
    int exercico = 0;

    Prompt.imprimir("Informe o número do exercico que deseja executar");
    Prompt.imprimir("1 - Exercicio 1");
    Prompt.imprimir("2 - Exercicio 2");
    Prompt.imprimir("3 - Exercicio 3");
    Prompt.imprimir("4 - Exercicio 4");
    Prompt.imprimir("5 - Exercicio 5");
    Prompt.imprimir("6 - Exercicio 6");
    Prompt.imprimir("7 - Exercicio 7");
    Prompt.imprimir("8 - Exercicio 8");
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
      case 4:
        Prompt.imprimir("Exercicio 4 sendo executado");
        Prompt.separador();
        Exercicio4.executar();
        break;
      case 5:
        Prompt.imprimir("Exercicio 5 sendo executado");
        Prompt.separador();
        Exercicio5.executar();
        break;
      case 6:
        Prompt.imprimir("Exercicio 6 sendo executado");
        Prompt.separador();
        Exercicio6.executar();
        break;
      case 7:
        Prompt.imprimir("Exercicio 7 sendo executado");
        Prompt.separador();
        Exercicio7.executar();
        break;
      case 8:
        Prompt.imprimir("Exercicio 8 sendo executado");
        Prompt.separador();
        Exercicio8.executar();
        break;

      default:
        break;
    }

  }

}
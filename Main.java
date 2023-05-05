import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double primeiroNum, segundoNum, resul;
        String operador;

        System.out.print("Informe o primeiro número: ");
        primeiroNum = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        segundoNum = scanner.nextDouble();

        System.out.print("Digite o operador desejado ( + , - , * , / ): ");
        operador = scanner.next();

        switch (operador) {
            case "+":
                resul = primeiroNum + segundoNum;
                System.out.println("Resultado: " + resul);
                break;
            case "-":
                resul = primeiroNum - segundoNum;
                System.out.println("Resultado: " + resul);
                break;
            case "*":
                resul = primeiroNum * segundoNum;
                System.out.println("Resultado: " + resul);
                break;
            case "/":
                if (segundoNum == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    resul = primeiroNum / segundoNum;
                    System.out.println("Resultado: " + resul);
                }
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }
    }
}

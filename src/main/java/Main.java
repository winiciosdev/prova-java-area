import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner l = new Scanner(System.in);



    System.out.println("Digite o raio do circulo");
    double raioCirculo = l.nextDouble();

    double areaCirculo = 3.14159 * (raioCirculo * raioCirculo);
    System.out.printf("Area = %.4f\n", areaCirculo);

  }
}
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double Altura = teclado.nextDouble();

        teclado.close();
        double pesoideal = (72.7 * Altura) - 58;

        System.out.println("Seu peso ideal é:" + pesoideal);
    }

}

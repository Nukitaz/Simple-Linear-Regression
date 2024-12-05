package hands_on;
import java.util.Scanner;

public class TestDatabase {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    double x=0;
    String resultadotext;
    Database calc = new Database();

        System.out.println("Ingresa x: ");
        x = scanner.nextDouble();

    resultadotext = calc.dataBaseMetodo(x);
    System.out.println(resultadotext);

    scanner.close();
    }
}
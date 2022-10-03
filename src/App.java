import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double metro, cent;
        System.out.print("Digite a quantidade de metros: ");
        metro = input.nextDouble();
        cent = metro * 100;
        System.out.print("São " + cent + " centimetros");
        input.close();
    }
}

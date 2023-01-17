import java.util.Locale;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá, " + nome + " " + sobreNome + ", tudo bem?\nVocê tem " + idade + " anos e " + altura + "m de altura.");

        
    }
}

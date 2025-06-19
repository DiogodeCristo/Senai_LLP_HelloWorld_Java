
public class Main {
    public static void main(String[] args) {
        String parametro = (args.length > 0) ? args[0] : "";
        System.out.println("Hello World " + parametro);
    }
}
///////
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    
}
/////////
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Hello World " + nome);
        scanner.close();
    }
}

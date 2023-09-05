package teste;
    import java.util.Scanner;
public class Customer {
        Scanner read = new Scanner(System.in);
    String name;
    public Customer(){
        System.out.println("Digite o nome do arrombado: " );
        name = read.next();
    }
}

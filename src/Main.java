import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Customer c = new Customer();
        Stack<Customer> a = new Stack<>();
        DataIn d = new DataIn();

        new ListActive(d,c,a);

    }
}
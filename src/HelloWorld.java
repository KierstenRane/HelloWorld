import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
                System.out.println("what is your name user?");
                name = scan.nextLine();
        System.out.println("Hello " + name + "!");
    }
}

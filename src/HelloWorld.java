import java.util.Scanner;
public class HelloWorld {

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(add(4, 5));

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }
}

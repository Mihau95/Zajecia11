import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();

        Integer number = Integer.valueOf(numStr);
        int num = number;

        System.out.println(numStr);
    }
}

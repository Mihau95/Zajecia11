import java.util.LinkedList;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe lub wpisz 'stop'");
        String element = scanner.nextLine();


        while (!element.equals("stop")){
            names.add(element);
            element = scanner.nextLine();
        }

        String allNames = names.get(0);
        int size = names.size();
        System.out.println("Liczba elementow: " + size);
        System.out.println("Elementy zapisane: " + names);


    }
}

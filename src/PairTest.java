import java.util.Scanner;

public class PairTest {
    public static void main(String[] args) {
//
//    Pair pair1 = new Pair(5,5);
//    Pair pair2 = new Pair(4.3,6);
//    Pair pair3 = new Pair("abc",12);
//
//    Integer x1 = (int)pair1.getX();
//    Double x2 = (double)pair2.getX();
//
//    System.out.println(x1 + x2);


    Pair pair1 = new Pair(5,6);
    Pair<Double, Double>pair2 = new Pair(4.5,6.4);
    Pair<String, Double>pair3 = new Pair("Aaa", 4.5);

    int x1 = (Integer)pair1.getX();
    double x2 = pair2.getX();

    System.out.println(x1 + x2);
    }
}

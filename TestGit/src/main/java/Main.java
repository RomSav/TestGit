/**
 * Created by free on 19.03.14.
 */
public class Main {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        Test t = new Test();
        t.sum(a, b);
    }
}

class Test {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }
}
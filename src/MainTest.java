
public class MainTest {
    public static void main(String[] args) {

        int age = 10;
        int size = 12;
        Test t=new Test();
        t.printsum(age,size);
        t.printdel(age);

    }


}

class Test{

    public void printsum(int a,int b){
        System.out.println(a+b);
    }
    public  void printdel(int a){
        int b=2;
        System.out.println(a/b);
    }
}
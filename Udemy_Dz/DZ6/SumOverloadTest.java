class SumOverload {
    int a, b, c, d;
    int sum(int a1, int b1, int c1, int d1) {
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        return a + b + c + d;
    }
    int sum(int a2, int b2, int c2) {
        a = a2;
        b = b2;
        c = c2;
        return a + b + c;
    }
    int sum(int a3, int b3) {
        a = a3;
        b = b3;
        return a + b;
    }
    int sum(int a4) {
        a = a4;
        return a;
    }
    int sum() {
        return 0;
    }
}

public class SumOverloadTest {
    public static void main(String[] args) {
        SumOverload s = new SumOverload();
        System.out.println("Summa 0 is " + s.sum());
        System.out.println("Summa 5 is " + s.sum(5));
        System.out.println("Summa 3 + 7 is " + s.sum(3,7));
        System.out.println("Summa 4 + 9 + 2 is " + s.sum(4,9,2));
        System.out.println("Summa 4 + 9 + 2 + 5 is " + s.sum(4,9,2,5));
    }
}
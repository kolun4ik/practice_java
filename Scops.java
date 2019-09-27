// Демонстрация укороченных логических операторов && и ||
// (тоже что и &, |, но без вычисления второго операнда
class Scops{
    public static void main(String[] args){
        int n, d, q;
        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        d = 0;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        // а теперь без укороченного логического оператора
        if(d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
}
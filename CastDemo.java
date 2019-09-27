// Демонстрация приведения типов
class CastDemo{
    public static void main(String[] args){
        double x, y;
        byte b;
        int i;
        char ch;
        x = 10.0;
        y = 3.0;
        // В даннос случае теряется дробная часть
        i = (int) ( x / y); // cast double to int
        System.out.println("Integer outcom of x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257;
        // На этот раз данные теряются, тип byte не может содержать
        // значение 257
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("Ch : " + ch);
    }
}
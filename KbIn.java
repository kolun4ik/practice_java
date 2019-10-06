class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch;
            System.out.println("Press a Key followed by ENTER: ");
            ch = (char) System.in.read(); // получить значение типа char
            System.out.println("Youre Key is: " + ch);
        }
}
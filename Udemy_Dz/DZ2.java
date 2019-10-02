class DZ2 {
    public static void main(String [] args) {
        //Создаем по 4 переменных всех целочисленных данных
        //byte short int long, hex, decimal, binary, octo
        byte twelve_bin = 0b1100; // 0b....
        byte twelve_hex = 0xC; // в шест. сис. исч пишем 0x
        byte twelve_dec = 12;
        byte twelve_oct = 014; // в восм. сист пишем 0 перед числом
        System.out.println(
                twelve_bin + " / " + twelve_oct + " / " + twelve_dec + " / " + twelve_hex
        );

        short sh_bin = 0b101_0001_0100;
        short sh_oct = 02424;
        short sh_dec = 1300;
        short sh_hex = 0x514;
        System.out.println(
                sh_bin + " / " + sh_oct + " / " + sh_dec + " / " + sh_hex
        );

        //Тип данных по умолчанию
        int int_bin = 0b0;
        int int_oct = 00;
        int int_dec = 0;
        int int_hex = 0x0;
        System.out.println(
                int_bin + " / " + int_oct + " / " + int_dec + " / " + int_hex
        );

        // Для long на конце ставим L
        long l_bin = 0b111_0101_1011_1100_1101_0001_0101;
        long l_oct = 0726_746_425;
        long l_dec = 123456789;
        long l_hex = 0x75B_CD15;
        System.out.println(
                l_bin + " / " + l_oct + " / " + l_dec + " / " + l_hex
        );

        //Для float на конце ставим F или f
        float f_1 = 70.0F;
        float f_2 = 50f;
        System.out.println(f_1 + " / " + f_2);

        //Для double на конце ставим D или  d, тип
        // данных по умолчанию, поэтому можем не ставить признак
        double d_1 = 100000000D;
        double d_2 = 99999999999999d;
        System.out.println(d_1 + " / " + d_2);

        boolean b_t = true;
        boolean b_f = false;
        System.out.println(b_t + " / " + b_f);

        char ch_1 = 'A';
        char ch_2 = '\u0051';
        char ch_3 = 35;
        System.out.println(ch_1 + " / "  + ch_2 + " / " + ch_3);

        }
}
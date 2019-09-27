class SideEffects{
    public static void main(String[] args){
        int i;
        i = 0;
        if (false & (++i < 100))
            System.out.println("this wont`t be displayed ");
        System.out.println("if statements executed: i = " + i);
        /*
            В данном случае значение переменной i не инкременируется, поскольку второй операнд укороченного
            логического оператора не вычисляется, а, следовательно, инкремент пропускается
        */
        if (false && (++i < 100))
            System.out.println("this wont`t be displayed ");
        System.out.println("if statements executed: i = " + i);
    }
}
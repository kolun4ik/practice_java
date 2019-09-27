/*
    В программе предпринимается попытка объявить переменную во внутренней области действия
    с таким же именем, как и у переменной, как и переменой определенной во внейшей области
    деятельности.
    *** ЭТА ПРОГРАММА НЕ ПОДЛЕЖИТ КОМПИЛЯЦИИ ***
 */

class NestVar{
    public static void main(String[] args){
        int count;
        for(count = 0; count < 10; count++){
            System.out.println("This is count: " + count);
            int count;
            for(count = 0, count < 2; count++){
                System.out.println("This program is in error!!!")
            }
        }
    }
}
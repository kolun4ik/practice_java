class GalToLitrTable{
    public static void main(String[] args){
        double galons, liters;
        int counter;
        counter = 0;
        for(galons=1; galons<=100; galons++){
            liters = galons * 3.7854; // перобразование в литры
            System.out.println(galons + " gallons is " + liters + " liters.");
            counter++;
            if (counter == 10) {
                System.out.println(); // вывели пустую строку - разделитель
                counter = 0;
            }
        }
    }
}
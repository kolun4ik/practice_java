class InchToMetr{
    public static void main(String[] args){
        double inch, metr;
        int counter;
        counter = 0;
        for(inch=1; inch <=144; inch++){
            metr = inch * 2.54 / 100; // перобразование в метры
            System.out.println(inch + " inches is " + metr + " metrs.");
            counter++;
            if (counter == 12) {
                System.out.println(); // вывели пустую строку - разделитель
                counter = 0;
            }
        }
    }
}
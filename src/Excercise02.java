public class Excercise02 {
    public static void main(String[] args) {

        String product1= "Mleko";
        String product2= "Czekolada";
        String producer1 = "Mlekovita";
        String producer2 = "Wedel";
        double price1 = 2.5;
        double price2 = 2.19;
/*        System.out.println("Produkt1:");
        System.out.print (product1+ " ");
        System.out.println(producer1+" " +price1);
        System.out.println("Produkt2:");
        System.out.print (product2+ " ");
        System.out.println( producer2+" " +price2);*/

        System.out.printf("%s ,%s, %.2f\n", product1, producer1, price1);
        System.out.printf("%s ,%s, %.2f", product2, producer2, price2);

    }
}

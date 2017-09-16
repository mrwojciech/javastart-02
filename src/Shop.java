public class Shop {
    public static void main(String[] args) {

        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = product1;
        Product product4 = product1;
        Product product5 = new Product("Chleb", "Piekarnia Lubin" , 5.2);
        Product product6 = new Product("Mąka", "Stary Mlyn" , 1.2);


        product1.name = "Szampon";
        product1.producer = "J&J";
        product1.price = 2.3;
        product2.name = "Mleko";
        product2.producer = "Mlekovita";
        product2.price = 3.2;

        System.out.printf("%s %s %2.2f \n", product1.name, product1.producer, product1.price);
        System.out.printf("%s %s %2.2f\n", product2.name, product2.producer, product2.price);

        product3.name = "Odzywka";
        product4.price = 100.22;


        System.out.printf("%s %s %2.2f \n", product1.name, product1.producer, product1.price);
        System.out.printf("%s %s %2.2f\n", product2.name, product2.producer, product2.price);

        System.out.printf("%s %s %2.2f \n", product5.name, product5.producer, product5.price);
        System.out.printf("%s %s %2.2f\n", product6.name, product6.producer, product6.price);

    }
}

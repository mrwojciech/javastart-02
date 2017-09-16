public class Calc {
    public static void main(String[] args) {

        double var1 = 12.0;
        double var2 = 5.5;
        double sum = var1 + var2;
        double subtract = var1 - var2;
        double multiplication = var1 * var2;
        double divide = var1 / var2;

        System.out.println(var1 + "+" + var2 + "=" + sum);
        System.out.println(var1 + "-" + var2 + "=" + subtract);
        System.out.println(var1 + "/" + var2 + "=" + multiplication);
        System.out.println(var1 + "*" + var2 + "=" + divide);
        System.out.print("Czy a jest wieksze od 0 ?");//true
        System.out.println(var1>var2);
        System.out.print("Czy suma jest parzysta? ");//false
        System.out.println(sum%2==0);
        System.out.print("A lub B większe od 100? ");//false
        System.out.println((var1>100)||(var2>100));
        System.out.print("A i B większe od 100? ");//false
        System.out.println((var1>100)&&(var2>100));

    }
}

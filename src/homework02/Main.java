package homework02;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
        Monitor monitor3 = new Monitor("Samsung", 21, 2017);
        Monitor monitor4 = new Monitor("LG", 24, 2017, true);


        monitor1.producer = "SONY";
        monitor1.size = 17;
        monitor1.year = 2017;

        monitor2.producer = "DELL";
        monitor2.size = 21;
        monitor2.year = 2015;

        System.out.printf("%s %d %d\n", monitor1.producer, monitor1.size, monitor1.year);
        System.out.printf("%s %d %d\n", monitor2.producer, monitor2.size, monitor2.year);
        System.out.printf("%s %d %d\n", monitor3.producer, monitor3.size, monitor3.year);
        System.out.printf("%s %d %d %b\n", monitor4.producer, monitor4.size, monitor4.year, monitor4.HDMI);


    }
}

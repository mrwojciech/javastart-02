package homework02;

public class Monitor {

    String producer;
    int size;
    int year;
    boolean HDMI;

    public Monitor(String producer, int size, int year) {
        this.producer = producer;
        this.size = size;
        this.year = year;
    }

    public Monitor() {
    }

    public Monitor(String producer, int size, int year, boolean HDMI) {
    this(producer,size, year);
    this.HDMI = HDMI;
    }
}

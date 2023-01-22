package Haldun;

public class TurkiyeVisit extends Country {
    public TurkiyeVisit(String officialLanguage, String capital, long popularity, char currency) {
        super(officialLanguage, capital, popularity, currency);
    }

    public static void viewTurkiye() {
        System.out.println("https://youtu.be/5K3Jdux_DDg" + " You can view Turkiye with relaxing music");
    }

    public static void flyInTurkiye() {
        System.err.println("https://youtu.be/TnbEX53f5-8" + " You can fly with parashut in Turkiye with exciting music");
        System.err.println("https://youtu.be/AqsBjSdw9Zg" + " You can fly with parashut in Turkiye with exciting music");
    }

    public static void baloonInTurkiye() {
        System.out.println("https://youtu.be/-0a5S0BjGcU" + " You can fly with baloon  Turkiye with relaxing music");
        System.out.println("https://youtu.be/78gqUZBeXd4" + " You can fly with baloon  Turkiye with relaxing music");

    }

    public static void divingInTurkiye() {
        System.out.println("https://youtu.be/35nf0rCnZ6o" + "You can dive in extream underwater places");
    }

    public static void main(String[] args) {
        TurkiyeVisit infoTurkiye = new TurkiyeVisit("Turkish", "Ankara", 85000000l, '₺');
        flyInTurkiye();
        baloonInTurkiye();
        divingInTurkiye();
        viewTurkiye();
        System.out.println("You may know about Turkiye" + infoTurkiye);
    }
}
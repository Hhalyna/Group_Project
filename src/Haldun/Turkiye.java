package Haldun;

public class Turkiye {

    String language="Turkish";
    String capitalCity="Ankara";
    String mostPopularCity="Istanbul";

   long popularity= 85000000l;
    char money='₺';

    public Turkiye(String language, String capitalCity, String mostPopularCity, long popularity, char money) {
        this.language = language;
        this.capitalCity = capitalCity;
        this.mostPopularCity = mostPopularCity;
        this.popularity = popularity;
        this.money = money;
    }

    public static void visitTurkiye(){
        System.out.println("https://youtu.be/O-fsiL5i9JY"+" You can visit Turkiye");
          }

    public static void flyInTurkiye(){
        System.out.println("https://youtu.be/AqsBjSdw9Zg"+" You can fly Turkiye");
        System.out.println("https://youtu.be/AqsBjSdw9Zg"+" You can fly Turkiye");

    }
    public static void baloonTurkiye(){

        System.out.println("https://youtu.be/ecWKqG13gA0"+" You can fly with baloon in Pamukkale");
        System.out.println("https://youtu.be/Kj7uFlPEgdM"+" You can fly with baloon in Kapadokya");

    }
    public static void divingInTurkiye(){
        System.out.println("https://youtu.be/35nf0rCnZ6o"+" You can SCUBA diving in Turkiye");
        System.out.println("https://youtu.be/LT21HrPEM1g"+" You can SCUBA diving in Turkiye");
    }

    @Override
    public String toString() {
        return " Turkiye {" +
                "language='" + language + '\'' +
                ", capitalCity='" + capitalCity + '\'' +
                ", mostPopularCity='" + mostPopularCity + '\'' +
                ", popularity=" + popularity +
                ", money=" + money +
                '}';
    }

    public static void main(String[] args) {
        Turkiye infoTr= new Turkiye("Turkish", "Ankara", "Istanbul", 85000000l, '₺');
        System.out.println(infoTr);

        flyInTurkiye();
        divingInTurkiye();
        baloonTurkiye();
    }
}

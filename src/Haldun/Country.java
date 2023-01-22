package Haldun;

public class Country {
    private String officialLanguage;

    private String Capital;

    private long popularity;

    private char currency;

    public Country(String officialLanguage, String capital, long popularity, char currency) {
        setOfficialLanguage(officialLanguage);
        setCapital(capital);
        setPopularity(popularity);
        setCurrency(currency);


    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public long getPopularity() {
        return popularity;
    }

    public void setPopularity(long popularity) {
        if(popularity<0){
            System.out.println("Popularity cannot be negative");
            System.exit(1);
        }

        this.popularity = popularity;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }

    public void speak(){
        System.out.println("Commonly used language is " + officialLanguage);
    }

    @Override
    public String toString() {
        return " Country {" +
                "officialLanguage='" + officialLanguage + '\'' +
                ", Capital='" + Capital + '\'' +
                ", popularity=" + popularity +
                ", currency=" + currency +
                '}';
    }
}

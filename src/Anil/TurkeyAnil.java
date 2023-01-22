package Anil;

public class TurkeyAnil {
    private String nameOfCountry,officialLanguage,capital;
    private long population;
    private char currency;

    public TurkeyAnil(String nameOfCountry, String officialLanguage, String capital, long population, char currency) {
        setNameOfCountry(nameOfCountry);
        setOfficialLanguage(officialLanguage);
        setCapital(capital);
        setPopulation(population);
        setCurrency(currency);
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if(population<0){
            System.out.println("invalid number");
            System.exit(1);
        }
        this.population = population;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }



    @Override
    public String toString() {
        return "TurkeyAnil{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                ", officialLanguage='" + officialLanguage + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", currency=" + currency +
                '}';
    }
}

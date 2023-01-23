package Liubov;

public class Portugal {

    private final String nameOfCountry = "Portugal";
    private final String capitalOfCountry = "Lisbon";
    private static String officialLanguage;
    private int population = 10352042;
    private char currency = '\u20ac';

    static {
        officialLanguage = "Portuguese";
    }
    public Portugal(int population, char currency) {
        setPopulation(population);
        setCurrency(currency);
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public String getCapitalOfCountry() {
        return capitalOfCountry;
    }

    public static String getOfficialLanguage() {
        return officialLanguage;
    }

    public static void setOfficialLanguage(String officialLanguage) {
        Portugal.officialLanguage = officialLanguage;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }





}



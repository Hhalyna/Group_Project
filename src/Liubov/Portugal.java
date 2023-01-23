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




}



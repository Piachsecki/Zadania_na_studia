package Lab5;

public class Fruit {
    private static int countStatic_ = 0;
    private static int idStatic_ = 0;

    public static int getCountStatic_() {
        return countStatic_;
    }

    public static int getIdStatic_() {
        return idStatic_;
    }

    private TasteOfFruit tasteOfFruit;

    private DateOfUsage dateOfUsage;
    private String nameOfFruit;

    private String colorOfTheFruit;
    private String originCountry;

    public Fruit() {
        this.tasteOfFruit    = new TasteOfFruit("WRONG");
        this.dateOfUsage     = new DateOfUsage();
        this.nameOfFruit     = "ERROR";
        this.colorOfTheFruit = "ERROR";
        this.originCountry   = "ERROR";
        countStatic_++;
        idStatic_++;
    }

    public Fruit(TasteOfFruit tasteOfFruit,
                 DateOfUsage dateOfUsage,
                 String nameOfFruit,
                 String colorOfTheFruit,
                 String originCountry) {
        this.tasteOfFruit = tasteOfFruit;
        this.dateOfUsage = dateOfUsage;
        this.nameOfFruit = nameOfFruit;
        this.colorOfTheFruit = colorOfTheFruit;
        this.originCountry = originCountry;
        countStatic_++;
        idStatic_++;

    }

    public Fruit(Fruit fruit) {
        this.nameOfFruit = fruit.nameOfFruit;
        this.originCountry = fruit.originCountry;
        this.colorOfTheFruit = fruit.colorOfTheFruit;
        this.tasteOfFruit = fruit.tasteOfFruit;
        this.dateOfUsage = fruit.dateOfUsage;
        countStatic_++;

    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameOfFruit='" + nameOfFruit + '\'' +
                ", colorOfTheFruit='" + colorOfTheFruit + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", tasteOfFruit=" + tasteOfFruit + '\'' +
                ", dateOfUsage=" + dateOfUsage + " " +
                '}';
    }
}

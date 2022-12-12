package Lab5;

public class TasteOfFruit {
    private String taste;

    public TasteOfFruit(String taste) {
        this.taste = taste;
    }

    public TasteOfFruit() {
        this.taste = "bitter";
    }

    @Override
    public String toString() {
        return "TasteOfFruit{" +
                "taste='" + taste + '\'' +
                '}';
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}

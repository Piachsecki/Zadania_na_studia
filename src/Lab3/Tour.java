package Lab3;

import java.util.*;

public class Tour {
    public static List<String> collectionA = new LinkedList<>();
    public static Set<String> collectionB = new HashSet<>();
    public static Map<String, String> collectionC = new HashMap<>();
    private String country;

    @Override
    public String toString() {
        return "Tour{" +
                "country='" + country + '\'' +
                ", capitol='" + capitol + '\'' +
                '}';
    }

    private String capitol;

    public static void printCollectionAorB(Collection<String> collection) {
        System.out.println(collection);
    }

    public static void printCollectionC(Map<String, String> collection) {
        System.out.println(collection);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return Objects.equals(country, tour.country) && Objects.equals(capitol, tour.capitol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, capitol);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapitol() {
        return capitol;
    }

    public void setCapitol(String capitol) {
        this.capitol = capitol;
    }

    public static boolean checkA(String capitolToCheck){
        return collectionA.contains(capitolToCheck);
    }
    public static boolean checkB(String capitolToCheck){
        return collectionB.contains(capitolToCheck);

    }
    public static boolean checkC(String countryToCheck){
        return collectionC.containsKey(countryToCheck);
    }

}

package S1List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Country Fr = new Country("France");
        Country All = new Country("Allemagne");
        Country Bel = new Country("Belgique");
        Country Por = new Country("Portugal");

        ArrayList<Country> countries = new ArrayList<>();

        countries.add(Fr);
        countries.add(All);
        countries.add(Bel);
        countries.add(Por);

        displayList(countries);

        countries.clear();
        displayList(countries);

        countries.add(Fr);
        countries.add(All);
        countries.add(Bel);
        countries.add(Por);

        Fr.setName("FrOnce");

        displayList(countries);

        Collections.sort(countries, new CountryNameComparator());
        System.out.println("Sorted by alphabetical order:");
        displayList(countries);

        Collections.sort(countries, new CountryNameLengthComparator());
        System.out.println("Ascending sorting by number of letters");
        displayList(countries);

        // Le code suivant ne fonctionne pas
        // Laisse des pays avec > 5 lettres car la suppression dynamique d'index pose pbm
//        for (int i = 0; i < countries.size(); i++) {
//            if (countries.get(i).getName().length() > 5) {
//                System.out.println(i + ";" + countries.get(i).getName());
//                countries.remove(i);
//            }
//        }

        System.out.println("Iterator time");
        Iterator<Country> iter = countries.iterator();
        while (iter.hasNext()) {
            Country c = iter.next(); // transform the iterator to its associated object in the array List()
            if (c.getName().length() > 6) {
//            if (c.getName().charAt(0) == 'F') {
                System.out.println(c.getName());
                iter.remove(); // function remove de l'itérateur associé à mon arrayList
            }
            //iter.next();
        }
        displayList(countries);
    }

    public static void displayList(ArrayList<Country> list) {

        if (list.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            System.out.println("This collection contains " + list.size() + " countries!");
            for (Country var: list) {
                System.out.println(" - " +var.getName());
            }
        }
        System.out.println("--------");
    }

}

package S1List;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Country> {

    @Override
    public int compare(Country a, Country b){
        return a.getName().compareTo(b.getName());
    }

}

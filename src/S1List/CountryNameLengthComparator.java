package S1List;

import java.util.Comparator;

public class CountryNameLengthComparator implements Comparator<Country> {

    @Override
    public int compare(Country a, Country b){
        return Integer.compare(a.getName().length(), b.getName().length());
    }

}

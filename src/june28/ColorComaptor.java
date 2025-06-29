package june28;

import java.util.Comparator;

public class ColorComaptor implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getColor().compareToIgnoreCase(o2.getColor());
    }


}

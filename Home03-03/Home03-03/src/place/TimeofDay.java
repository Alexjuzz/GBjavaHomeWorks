package place;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TimeofDay implements Randomable{
    private final List<String> timeofDays;

    public TimeofDay(){
        timeofDays = new ArrayList<>();
        timeofDays.add("morning");
        timeofDays.add("daytime");
        timeofDays.add("afternoon");
    }
    @Override
    public String random() {
        return  timeofDays.get(new Random().nextInt(timeofDays.size()));

    }

}

package items.Fishrod;

import java.util.ArrayList;
import java.util.List;

public class ListFishRods {
    static List<Fishrod> fishrodList;
    ListFishRods(){
        fishrodList = new ArrayList<>();
        fishrodList.add(new Telescopic("Телескопическая",20.2,10,"Обычная"));
        fishrodList.add(new Spinning("Спининг-2023",10.2,50,"Плетеная"));
        fishrodList.add(new Telescopic("Телескопическая",15.0,20,"Флюрокорбон"));
        fishrodList.add(new FlyWheel("Маховая",23,12,"Резинка от трусов"));
        fishrodList.add(new Spinning("Спининг",25.2,69,"Плетеновая"));
    }
}

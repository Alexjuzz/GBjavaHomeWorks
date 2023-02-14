import java.util.Date;

public class Race {
    public void race(Car car1, Car car2, double distance) {

        double CarU1 = car1.acceleration;
        double CarU2 = car2.acceleration;
        long distanceCar1 = 0;
        long distanceCar2 = 0;
        Date date1 = new Date();
        while (distance > distanceCar1 | distance > distanceCar2) {
            Date date2 = new Date();
            long sek = (date2.getTime() - date1.getTime());
            distanceCar1 = (long) (CarU1 * sek/10);
            distanceCar2 = (long )(CarU2 * sek/10);
            System.out.printf("Дистанция пройденая первым авто %s : %.2f    <- 1\n",car1.getModel(), (float)distanceCar1 );
            System.out.printf("Дистанция пройденая вторым авто %s : %.2f  <- 2\n",car2.getModel(),(float)distanceCar2 );
            if (distanceCar1 >= distance) {
                System.out.println("win1");
                return;
            }
            if (distanceCar2 >= distance) {
                System.out.println("win2");
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

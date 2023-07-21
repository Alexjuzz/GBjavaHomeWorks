import java.util.ArrayList;

public class vJobovatel implements Comparable<vJobovatel> {
    static private ArrayList<vJobovatel> listWorkers = new ArrayList<>(); // статичный лист работкинов. при создании работника он добавляется сюда.

    public vJobovatel(String name, boolean choosePayment, double HourOrSalary) // true - FixedSalary , False - TimePayment.
    {
        this.name = name;
        if (choosePayment) payment = new Fixpayment(HourOrSalary); // при создании обьекта работника выбирем фиксированная зп или нет
        else payment = new TimePyment(HourOrSalary);
        listWorkers.add(this);
    }

    private final String name;
    private Payment payment;
    public void setPayment(Payment payment) {  // метод замены типа ЗП
        this.payment = payment;
    }
    public Payment getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Имя " + name + " Зараплата " + payment.getSalary() + "\n";
    }

    public static ArrayList<vJobovatel> getListWorkers() {
        return listWorkers;
    }


    @Override
    public int compareTo(vJobovatel o) {   //
        if (o.payment.getSalary() == this.payment.getSalary()) {
            return 0;
        } else if (o.payment.getSalary() < this.payment.getSalary()) {
            return -1;
        } else return 1;
    }

}

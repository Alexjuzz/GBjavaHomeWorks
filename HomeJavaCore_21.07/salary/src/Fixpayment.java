class Fixpayment extends Payment{
    public Fixpayment(double salary){
        this.salary = salary;
    }
    @Override
    protected double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Фиксированная ЗП";
    }
}

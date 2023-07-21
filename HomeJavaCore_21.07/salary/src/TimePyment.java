 class TimePyment extends Payment{
    public TimePyment(double time){
        this.timeWorked = time;
    }

    protected  double timeWorked = 0;
    protected double kooficent = 20.8;
    protected double kooficentTime = 8;

    @Override
    protected double getSalary() {
        return kooficent*kooficentTime*timeWorked;
    }

     @Override
     public String toString() {
         return "Почасовая оплата";
     }
 }

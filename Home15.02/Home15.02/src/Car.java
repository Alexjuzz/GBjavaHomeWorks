

    public class Car {
        double acceleration;
        String model;
        String color;
        int maxSpeed;
        int hp;
        double price;
        int year;
        private boolean engineStart = false;

        public double getAcceleration() {
            return acceleration;
        }

        public void setAcceleration(double acceleration) {
            this.acceleration = acceleration;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public boolean isEngineStart() {
            return engineStart;
        }

        public void setEngineStart(boolean engineStart) {
            this.engineStart = engineStart;
        }

        public String getLocation() {
            return location;
        }

        String location = "Home";

        public Car(String model, String color, int maxSpeed, int hp, double price,double acceleration, int year) {
           this.setModel(model);
            this.setColor(color);
            this.setMaxSpeed(maxSpeed);
            this.setHp(hp);
            this.setPrice(price);
            this.setAcceleration(acceleration);
            this.setYear(year);
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public void engineon() {
            this.engineStart = true;
        }

        public void engineff() {
            this.engineStart = false;
        }

        public String getInfo() {
            return "Авто  -  " +
                    "model='" + this.getModel() + '\'' +
                    ", color='" + this.getColor() + '\'' +
                    ", maxSpeed=" + this.getMaxSpeed() +
                    ", hp=" + this.getHp() +
                    '.';
        }

        public void setLocation(String location) {
            if (this.engineStart) {
                System.out.println(this.location + " текущая локация");
                System.out.println("Отправляемся -> " + location);
                this.location = location;
            } else {
                System.out.println("Двигатель заглушен и мы не можем ехать" );

            }

        }

        @Override
        public boolean equals(Object o) {
            if ((Car) o == this) {
                if (this.model.equals(((Car) o).model) && this.hp == ((Car) o).hp) {
                    return true;
                }
            }
            return false;
        }


    }

/*

    Доделать задания, которые не успели на семинаре.
Переписать прошлое домашнее задание с использованием принципа инкапсуляции
 */


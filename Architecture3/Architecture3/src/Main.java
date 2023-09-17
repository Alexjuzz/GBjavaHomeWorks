public class Main {
    /**
     * Принцип единственной ответственности
     *     * «Одно поручение. Всего одно.» - класс кар создает только автомобили и не более и реализует,
     *     только нужные ему методы.И не связан с CleaningCar классом, а на оборот класс CleaningCar расширяет класс Car.
     *
     * Принцип открытости-закрытости в Car
     *
     * Программные сущности (классы, модули, функции)
     * должны быть открыты для расширения, но не для модификации.
     *
     *
     * Принцип разделения интерфейса в методе iCleaning.
     *
     * Создаy узкоспециализированнq интерфейс,
     * предназначенные для конкретного авто. Авто  не
     * должны зависеть от интерфейсов, которые они не используют.
     *
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
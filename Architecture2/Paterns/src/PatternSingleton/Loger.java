package PatternSingleton;

public class Loger {
    public static void main(String[] args) {
        System.out.println(SingleLogger.getSingleLogger().toString()); // Показываю что объект один и тот же.
        System.out.println(SingleLogger.getSingleLogger().toString());


        SingleLogger.getSingleLogger().addLogInfo("New log"); // Добавляю в файл текс.
        SingleLogger.getSingleLogger().addLogInfo("Second log");
        SingleLogger.getSingleLogger().addLogInfo("End");
        SingleLogger.getSingleLogger().showLogFile(); // Отображаю что получилось в файле.
    }
}

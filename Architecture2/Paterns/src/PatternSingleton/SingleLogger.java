package PatternSingleton;

/**
 * Паттерн синглтон - Одиночка.
 * Цель:
 * - Гарантировать, что у класса будет только один экземпляр и к нему будет предоставлена одна
 * глобальная точка входа
 *
 * Используется для создания единственного экземпляра.
 *
 * Пример использования:
 * - необходим только один экземпляр конкретного класса, который будет доступен для всех клиентов;
 * - единственный экземпляр должен наследоваться путем пораждения подклассов, при этом, клиенты имеют
 * возможность работать с классом-наследником без модификации своего кода.
 */
public class SingleLogger {
    private static SingleLogger singleLogger;
    private static String logfile = "This is log file. \n";

    /**
     * Метод получения обьекта если он пустой то создать обьект.
     *
     */
    public static  SingleLogger getSingleLogger(){
        if(singleLogger == null){
            singleLogger = new SingleLogger();
        }
        return singleLogger;
    }

    /**
     * Дефолтный приватный конструктор
     */
    private SingleLogger(){}

    /**
     * Метод добавления информации в файл.
     * @param textToLogfile - текст который необходимо добавить в файл.
     */
    public void addLogInfo(String textToLogfile){
        logfile += textToLogfile + "\n";
    }

    /**
     * Показать содержимое файла
     */
    public void showLogFile(){
        System.out.println(logfile);
    }
}

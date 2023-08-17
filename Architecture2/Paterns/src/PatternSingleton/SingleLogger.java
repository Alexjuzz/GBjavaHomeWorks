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
    public static  SingleLogger getSingleLogger(){
        if(singleLogger == null){
            singleLogger = new SingleLogger();
        }
        return singleLogger;
    }
    private SingleLogger(){

    }
    public void addLogInfo(String textToLogfile){
        logfile += textToLogfile + "\n";
    }
    public void showLogFile(){
        System.out.println(logfile);
    }
}

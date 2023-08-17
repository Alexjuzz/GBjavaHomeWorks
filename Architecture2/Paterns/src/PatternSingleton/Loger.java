package PatternSingleton;

public class Loger {
    public static void main(String[] args) {
        System.out.println(SingleLogger.getSingleLogger().toString());
        System.out.println(SingleLogger.getSingleLogger().toString());
        System.out.println(SingleLogger.getSingleLogger().toString());
        System.out.println(SingleLogger.getSingleLogger().toString());

        SingleLogger.getSingleLogger().addLogInfo("New log");
        SingleLogger.getSingleLogger().addLogInfo("Second log");
        SingleLogger.getSingleLogger().addLogInfo("End");
        SingleLogger.getSingleLogger().showLogFile();
    }
}

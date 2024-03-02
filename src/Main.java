public class Main {
    public static void main(String[] args) {
        String msg = "Int from ErRor";

        SmartLogger smartLogger = new SmartLogger();
        smartLogger.log(msg);

        SimpleLogger simpleLogger = new SimpleLogger();
        simpleLogger.log(msg);

        SimpleLogger simpleLogger1 = new SimpleLogger();
        simpleLogger1.log("Hello Djava");
    }
}
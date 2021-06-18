package сreational.singleton;

public class Singleton {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Log.getLog().setLogInfo("Действие " + (i+1));
        }
        System.out.println(Log.getLog().getLogInfo());
    }
}

class Log{
    private static Log log;
    private static String logInfo = "Старт \n\n";

    private Log(){};

    public static Log getLog(){
        if(log==null){
            log = new Log();
        }
        return log;
    }

    public void setLogInfo(String s){
        logInfo+= s + " \n";
    }

    public String getLogInfo(){
        return logInfo;
    }

}

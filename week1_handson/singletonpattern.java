
public class singletonpattern {
    static  class Logger{
    private static Logger instance;
    private Logger(){
        System.out.println("Logger initialized");
    }
    private static Logger getInstance(){
        if(instance ==null){
            instance=new Logger();
        }
        return instance;
    }
    public void Log(String message){
        System.out.println("MESSAGE:"+message);
    }
}
    public static void main(String[] args){
        Logger logge1 = Logger.getInstance();
        Logger logger2=Logger.getInstance();
        logge1.Log("First log message");
        logger2.Log("Second log message");
        
        if(logge1==logger2){
            System.out.println("Both logger1 and logger2 are same instance");
        }else{
            System.out.println("Singleton failed");
        }

    }
}

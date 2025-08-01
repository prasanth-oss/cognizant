import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogging {
    private static final Logger logger = LoggerFactory.getLogger(HelloLogging.class);
    public static void main(String[] args) {
        logger.info("App is started...");
        logger.warn("This is just a bug");
        logger.error("please wait for a moment something went wrong");
    }
}

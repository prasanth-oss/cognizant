import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mylogger {
    private static final Logger logger = LoggerFactory.getLogger(Mylogger.class);

    public static void main(String[] args) {
        logger.info("App is now running...");
        logger.warn("This is just a warning.");
        logger.error("Oops! Something went wrong.");
    }
}

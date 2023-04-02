import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileWriter implements Logged {
    @Override
    public Logger getLog() {
        Logger logger = Logger.getAnonymousLogger();

        FileHandler fileHandler = null;
        SimpleFormatter format = new SimpleFormatter();

        try {
            fileHandler = new FileHandler("log.txt", true);
            fileHandler.setFormatter(format);
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.addHandler(fileHandler);

        return logger;
    }
    public void writeFile(String information){
        Logger log = getLog();

        try (java.io.FileWriter fileWriter = new java.io.FileWriter("fileOut.txt", true)){
            fileWriter.write(information);
            log.info("Файл fileOut.txt записан.");
        } catch (Exception e){
            log.warning(e.getMessage());
            e.printStackTrace();
        }
        log.getHandlers()[0].close();
    }
}

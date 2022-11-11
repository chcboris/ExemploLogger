// https://www.developer.com/java/java-logging-api/
//https://www.devmedia.com.br/artigo-java-magazine-05-logging-no-j2se-1-4/8244
//https://www.delftstack.com/pt/howto/java/java-log/
//https://www.devmedia.com.br/introducao-ao-log4j/28602	
import java.util.logging.Logger;

public class Main {

  private static Logger LOGGER = Logger.getLogger("InfoLogging");

  public static void main(String[] args) {
    LOGGER.info("Logging an INFO-level message");
    
  }
}
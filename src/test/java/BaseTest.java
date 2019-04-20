import java.util.logging.Logger;

public class BaseTest {

	private final Logger logger = Logger.getLogger(getClass().getSimpleName());

	protected Logger getLogger() {
		return logger;
	}
}

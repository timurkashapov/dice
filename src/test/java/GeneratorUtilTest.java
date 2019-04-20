import com.shako.dice.GeneratorUtil;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GeneratorUtilTest extends BaseTest {

	@Test
	void generateInteger() {
		getLogger().log(Level.INFO, "Тестирование генерации целочисленного числа");
		int rand = GeneratorUtil.generateInteger();
		assertTrue( 1 <= rand && rand <= 10);
	}
}
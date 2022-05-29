package spring.github.actions.springactions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringactionsApplicationTests {

	@Test
	void firstTestCase() {
		System.out.println("Executing first test case...");
		assertTrue(true);
	}

	@Test
	void secondTestCase() {
		System.out.println("Executing second test case...");
		assertTrue(true);
	}

}

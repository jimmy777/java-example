package pattern.factory;

import org.junit.Test;

import com.x.pattern.factory.AbstractFactory;
import com.x.pattern.factory.Factory1;
import com.x.pattern.factory.Flyable;

public class FactoryTest {
	@Test
	public void testFactory() {
		AbstractFactory factory = new Factory1();
		Flyable flyable = factory.createFlyable();
		flyable.fly(1589);
	}
}

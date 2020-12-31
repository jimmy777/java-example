package pattern.factory;

import org.junit.Test;

import com.x.pattern.factory.Broom;
import com.x.pattern.factory.Plane;
import com.x.pattern.factory.SimpleFactory;

public class SimpleFactoryTest {
	@Test
	public void testSimpleFactory() {
		// �򵥹���ģʽ����
		SimpleFactory simpleFactory = new SimpleFactory();
		Broom broom = (Broom)simpleFactory.create(Broom.class);
		broom.run();
		
		Plane plane = (Plane)simpleFactory.create(Plane.class);
		plane.run();
	}
}

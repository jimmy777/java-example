package pattern.factory;

import org.junit.Test;

import com.x.pattern.factory.BroomFactory;
import com.x.pattern.factory.Moveable;
import com.x.pattern.factory.VehicleFactory;

public class VehicleFactoryTest {
	@Test
	public void testVehicheFactory() {
		// 工厂方法模式测试
		VehicleFactory factory = new BroomFactory();
		Moveable moveable = factory.create();
		moveable.run();
	}
}

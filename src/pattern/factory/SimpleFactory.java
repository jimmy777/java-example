package pattern.factory;

/*
 * �򵥹���ģʽ(Simple Factory Pattern)
 */
public class SimpleFactory {
	// �������󷽷�
	public Object create(Class<?> clazz) {
		if(clazz.getName().equals(Plane.class.getName())) {
			return createPlane();
		} else if(clazz.getName().equals(Broom.class.getName())) {
			return createBroom();
		}
		return null;
	}
	
	// �����������ķ���
	private Object createBroom() {
		return new Broom();
	}

	// �����������ķ���
	private Object createPlane() {
		return new Plane();
	}
}

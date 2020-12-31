package pattern.factory;

/*
 * ����һ�������ʵ�ֹ����ࡣ������һ�����������Ʒ�ĳ��䡣
 */
public class BroomFactory extends VehicleFactory {

	@Override
	public Moveable create() {
		return new Broom();
	}
}

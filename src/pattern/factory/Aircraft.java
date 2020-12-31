package pattern.factory;

public class Aircraft implements Flyable {

	@Override
	public void fly(int height) {
		System.out.println("����һ�ܿ��˷ɻ���Ŀǰ���и߶�Ϊ��" + height + "ǧ�ס�");
	}
}

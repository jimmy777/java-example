package thread;

public class StringThreadDemo implements Runnable{
	
	StringBuffer stringBuffer = new StringBuffer();
	StringBuilder stringBuilder = new StringBuilder();
	MyString sb = new MyString();

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			sb.append(1);
			stringBuffer.append("1");
			stringBuilder.append("1");
			System.out.println(sb.getNum() + "-" + stringBuffer.length() + "-" + stringBuilder.length());
		}
	}
	
	public static void main(String[] args) {
		StringThreadDemo r = new StringThreadDemo();
		new Thread(r, "�߳�1").start();
		new Thread(r, "�߳�2").start();
		new Thread(r, "�߳�3").start();
		new Thread(r, "�߳�4").start();
	}
}


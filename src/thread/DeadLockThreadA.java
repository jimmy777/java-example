package thread;

/*
 * A��B��������������С�
 */
public class DeadLockThreadA extends Thread {
	private Object lockA;
	private Object lockB;
	
	public DeadLockThreadA(Object lockA, Object lockB) {
		this.lockA = lockA;
		this.lockB = lockB;
	}

	@Override
	public void run() {
		System.out.println("�߳� A ��ʼִ����");
	
		synchronized (lockA) {
			System.out.println("LockA �Ѿ����߳� A ��ס");
			
			try {
				Thread.sleep(100); // ȷ����ס
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (lockB) {
				System.out.println("LockB �Ѿ����߳� A ��ס");
			}
		}
	
	}
	
	
}

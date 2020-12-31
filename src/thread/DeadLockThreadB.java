package thread;

/*
 * A��B��������������С�
 */
public class DeadLockThreadB extends Thread {
	private Object lockA;
	private Object lockB;
	
	public DeadLockThreadB(Object lockA, Object lockB) {
		this.lockA = lockA;
		this.lockB = lockB;
	}

	@Override
	public void run() {
		System.out.println("�߳� B ��ʼִ����");
	
		synchronized (lockB) {
			System.out.println("LockB �Ѿ��߳� B ����ס");
			
			try {
				Thread.sleep(100); // ȷ����ס
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (lockA) {
				System.out.println("LockA �Ѿ����߳� B ��ס");
			}
		}
	
	}
	
	
}

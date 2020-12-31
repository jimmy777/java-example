package thread;

public class PriorityThreadDemo extends Thread{

	public PriorityThreadDemo(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + " �����˵� " + i + " �Ρ�");
			try { // ���������ף���д�ķ������ܳ�������ķ�����
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread ��ʼ");
		PriorityThreadDemo t1 = new PriorityThreadDemo("A thread");
		PriorityThreadDemo t2 = new PriorityThreadDemo("B thread");
		
		// �������ȼ�������һ��������ִ���ꡣ
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("main thread ����");
	}
}

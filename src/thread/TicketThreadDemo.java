package thread;

public class TicketThreadDemo implements Runnable {

	// ����������Ҫ private ����
	private int  tickets = 50;
	
	@Override
	public void run() {
		// ��1
		while(getTickets() > 0 ) {
			// ��2. ͬ������飬��ס�����
			synchronized (this) {
				if (tickets >0) {
					System.out.println("�� "+tickets+" �ŵ�Ʊ�ѱ� "+ Thread.currentThread().getName() +" �߳��۳�" );
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					tickets--;
				}
			}
		}
	}
	
	// 1. ͬ����������ס����
	private synchronized int getTickets() {
		return tickets;
	}



	public static void main(String[] args) {
		TicketThreadDemo r = new TicketThreadDemo();
		new Thread(r, "��Ʊ����1").start();
		new Thread(r, "��Ʊ����2").start();
		new Thread(r, "��Ʊ����3").start();
		new Thread(r, "��Ʊ����4").start();
	}

}

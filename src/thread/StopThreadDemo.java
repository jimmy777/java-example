package thread;

import java.util.Random;
import java.util.Scanner;

public class StopThreadDemo implements Runnable {
	private boolean timeToQuit = false;

	public void stopRunning() {
		timeToQuit = true;
	}
	
	@Override
	public void run() {
		while (! timeToQuit) {
			Random random = new Random();
			int num = random.nextInt(10) + 1;
			System.out.println("�н��ţ� " + num);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		StopThreadDemo t = new StopThreadDemo();
		Thread tt = new Thread(t);
		tt.start();
		
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		if (line.equals("x")) {
			t.stopRunning();
		}
	}
	
}

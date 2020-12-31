package thread;

public class CalculatePrimesDemo extends Thread {
	public static final int MAX_PRIMES = 1000;
	public static final int TEN_SECONDS = 100;

	public volatile boolean finished = false;

	@Override
	public void run() {
		int[] primes = new int[MAX_PRIMES];
		int count = 0;

		for (int i = 2; count < MAX_PRIMES; i++) {
			if (finished) {
				break;
			}

			boolean prime = true;

			for (int j = 0; j < count; i++) {
				if (i % primes[j] == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				primes[count++] = i;
				System.out.println("Found prime: " + i);
			}
		}
	}

	public static void main(String[] args) {
		CalculatePrimesDemo calculatePrimesDemo = new CalculatePrimesDemo();
		calculatePrimesDemo.start();
		try {
			Thread.sleep(TEN_SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		calculatePrimesDemo.finished = true;
	}

}

package com.x.base.thread;

public class WorkerThreadDemo extends Thread {
	
	int max = Integer.MAX_VALUE;
	int[] ourArray;
	
	
	
	public WorkerThreadDemo(int[] ourArray) {
		this.ourArray = ourArray;
	}

	@Override
	public void run() {
		for(int i=0;i<ourArray.length;i++) {
			max = Math.max(max, ourArray[i]);
		}
	}
	
	public int getMax() {
		return max;
	}


	public static void main(String[] args) {
		
		
	}

}

package rmi.client;

import java.rmi.Naming;
import rmi.intf.RMITest1I;

public class DisplayPerfectTime {
	public static void main(String[] args) {
		try {
			// ���Ҫ����һ̨������RMIע�����Ļ����ϲ���helloʵ��
            // RMITest1I t = (RMITest1I)Naming.lookup("//IP:1099/RealTime");
			RMITest1I t=(RMITest1I)Naming.lookup("//localhost:1099/RealTime");
			
			for (int i=0;i<10;i++) {
				System.out.println("PerfectTime: " + t.getPerfectTime());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

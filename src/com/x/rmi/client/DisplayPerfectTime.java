package com.x.rmi.client;

import java.rmi.Naming;
import com.x.rmi.intf.RMITest1I;

public class DisplayPerfectTime {
	public static void main(String[] args) {
		try {
			// 如果要从另一台启动了RMI注册服务的机器上查找hello实例
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

package com.x.rmi.impl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import com.x.rmi.intf.RMITest1I;

/*
 * 分为以下四个步骤:
	1. 创建远程接口及声明远程方法（RMITest1I.java）
	2. 实现远程接口及远程方法（继承 UnicastRemoteObject）(RMITest1.java)
	3. 启动RMI注册服务，并注册远程对象（RMITest1.java）
	4. 客户端查找远程对象，并调用远程方法（getPerfectTime）
	5. 执行程序：启动服务RMITest1；运行客户端DisplayPerfectTime进行调用
 */

// 扩展了 UnicastRemoteObject类，并实现远程接口
public class RMITest1 extends UnicastRemoteObject implements RMITest1I {

	private static final long serialVersionUID = 1L;

	public RMITest1() throws RemoteException {
		super();
	}

	@Override
	public long getPerfectTime() throws RemoteException {
		return System.currentTimeMillis();
	}

	public static void main(String[] args) {
		
		try {
			// 启动RMI注册服务，指定端口为1099　（1099为默认端口）
            // 也可以通过命令 ＄java_home/bin/rmiregistry 1099启动
            // 这里用这种方式避免了再打开一个DOS窗口
            // 而且用命令rmiregistry启动注册服务还必须事先用RMIC生成一个stub类为它所
			LocateRegistry.createRegistry(1099);
			
			// 创建远程对象的一个或多个实例
            // 可以用不同名字注册不同的实例
			RMITest1 impl = new RMITest1();
			
			// 如果要把hello实例注册到另一台启动了RMI注册服务的机器上
            // Naming.rebind("//192.168.1.105:1099/Hello",hello);
			Naming.rebind("//localhost:1099/RealTime", impl);
			
			System.out.println("** RMI Server ready.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

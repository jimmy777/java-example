package rmi.impl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import rmi.intf.RMITest1I;

/*
 * ��Ϊ�����ĸ�����:
	1. ����Զ�̽ӿڼ�����Զ�̷�����RMITest1I.java��
	2. ʵ��Զ�̽ӿڼ�Զ�̷������̳� UnicastRemoteObject��(RMITest1.java)
	3. ����RMIע����񣬲�ע��Զ�̶���RMITest1.java��
	4. �ͻ��˲���Զ�̶��󣬲�����Զ�̷�����getPerfectTime��
	5. ִ�г�����������RMITest1�����пͻ���DisplayPerfectTime���е���
 */

// ��չ�� UnicastRemoteObject�࣬��ʵ��Զ�̽ӿ�
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
			// ����RMIע�����ָ���˿�Ϊ1099����1099ΪĬ�϶˿ڣ�
            // Ҳ����ͨ������ ��java_home/bin/rmiregistry 1099����
            // ���������ַ�ʽ�������ٴ�һ��DOS����
            // ����������rmiregistry����ע����񻹱���������RMIC����һ��stub��Ϊ����
			LocateRegistry.createRegistry(1099);
			
			// ����Զ�̶����һ������ʵ��
            // �����ò�ͬ����ע�᲻ͬ��ʵ��
			RMITest1 impl = new RMITest1();
			
			// ���Ҫ��helloʵ��ע�ᵽ��һ̨������RMIע�����Ļ�����
            // Naming.rebind("//192.168.1.105:1099/Hello",hello);
			Naming.rebind("//localhost:1099/RealTime", impl);
			
			System.out.println("** RMI Server ready.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

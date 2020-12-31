package rmi.intf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMITest1I extends Remote {
	
	// Զ�̽ӿڷ��������׳� java.rmi.RemoteException
	long getPerfectTime() throws RemoteException;
}

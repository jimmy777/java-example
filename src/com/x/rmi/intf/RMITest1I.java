package com.x.rmi.intf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMITest1I extends Remote {
	
	// 远程接口方法必须抛出 java.rmi.RemoteException
	long getPerfectTime() throws RemoteException;
}

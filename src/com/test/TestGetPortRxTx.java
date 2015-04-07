package com.test;

import gnu.io.CommPortIdentifier;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class TestGetPortRxTx {

	/**
	 * @param args
	 */
	public List<String> getAvailablePorts() {

		   List<String> list = new ArrayList<String>();

		   Enumeration portList = CommPortIdentifier.getPortIdentifiers();

		   while (portList.hasMoreElements()) {
		       CommPortIdentifier portId = (CommPortIdentifier) portList.nextElement();
		       if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
		           list.add(portId.getName());
		       }
		   }

		   return list;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGetPortRxTx ob = new TestGetPortRxTx();
		List<String> result = ob.getAvailablePorts();
		for (String port : result){
			System.out.printf(port);
		}
	}

}

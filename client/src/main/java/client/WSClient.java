package client;

import org.example.contract.calculate.CalculatePortType;
import org.example.contract.calculate.CalculateService;

public class WSClient {

	public WSClient() {
	}

	// used by OSGi-hosted client
	public WSClient(CalculatePortType portType) {
		makeCalls(portType);
	}

	// used by standalone Java client
	public static void main(String[] args) {
		CalculateService service = new CalculateService();
		CalculatePortType port = service.getCalculatePort();
		makeCalls(port);
	}

	private static void makeCalls(CalculatePortType port) {
		doubleIt(port, 10);
		doubleIt(port, 0);
		doubleIt(port, -10);
		add(port, 7, 4);
		add(port, 7, 7);
		substract(port, 7, 4);
		substract(port, 4, 7);
		multiply(port, 3, 4);
	}

	public static void doubleIt(CalculatePortType port, int numToDouble) {
		int resp = port.doubleIt(numToDouble);
		System.out.println("The number " + numToDouble + " doubled is " + resp);
	}

	public static void add(CalculatePortType port, int factor1, int factor2) {
		int resp = port.add(factor1, factor2);
		System.out.println("The sum of " + factor1 + " and " + factor2 + " is " + resp);
	}

	public static void substract(CalculatePortType port, int factor1, int factor2) {
		int resp = port.substract(factor1, factor2);
		System.out.println("The difference of " + factor1 + " and " + factor2 + " is " + resp);
	}

	public static void multiply(CalculatePortType port, int factor1, int factor2) {
		int resp = port.multiply(factor1, factor2);
		System.out.println("The product of " + factor1 + " and " + factor2 + " is " + resp);
	}
}
package service;

import javax.jws.WebService;
import org.example.contract.calculate.CalculatePortType;

@WebService(targetNamespace = "http://www.example.org/contract/Calculate", portName = "CalculatePort", serviceName = "CalculateService", endpointInterface = "org.example.contract.calculate.CalculatePortType")
public class CalculatePortTypeImpl implements CalculatePortType {

	public int doubleIt(int numberToDouble) {
		return numberToDouble * 2;
	}
	
	public int add(int factor1, int factor2) {
		return factor1 + factor2;
	}

}
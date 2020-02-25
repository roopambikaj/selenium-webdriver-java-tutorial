package javaProject;

public class trafficProtocol implements BasicInterfaceTest, CentralTrafficPool{

	
	public static void main(String[] args){
		BasicInterfaceTest test = new trafficProtocol();
		trafficProtocol tp = new trafficProtocol();
		CentralTrafficPool ct = new trafficProtocol();
		
		
		test.redStop();
		test.greenGo();
		test.yellowReady();
		tp.rule();
		tp.greenGo();
		ct.centralGreenGo();
		ct.centralYellowReady();
		
		
		
		
	}
	
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo");
		
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop");
	}

	@Override
	public void yellowReady() {
		// TODO Auto-generated method stub
		System.out.println("yellowReady");
	}

	public void rule() {
		System.out.println("rule");
	}

	@Override
	public void centralGreenGo() {
		// TODO Auto-generated method stub
		System.out.println("centralGreenGo");
		
	}

	@Override
	public void centralRedStop() {
		// TODO Auto-generated method stub
		System.out.println("centralRedStop");
	}

	@Override
	public void centralYellowReady() {
		// TODO Auto-generated method stub
		System.out.println("centralYellowReady");
	}

}

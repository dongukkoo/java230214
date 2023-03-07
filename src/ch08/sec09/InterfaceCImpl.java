package ch08.sec09;

public abstract class InterfaceCImpl implements InterfaceC {

	public void methodA() {
		System.out.println("InterfaceImpl methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceImpl methodB()");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceImpl methodC()");
	}

}
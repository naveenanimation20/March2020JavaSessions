package OOP_Interface;

public class WHO implements UNHC {

	public  final void pandemic() {
		System.out.println("WHO -- pandemic");
	}

	public void vaccination() {
		System.out.println("WHO -- vaccination");

	}

	@Override
	public void ebola() {
		System.out.println("WHO -- ebola");

	}

	@Override
	public void polio() {
		System.out.println("WHO -- polio");

	}

}

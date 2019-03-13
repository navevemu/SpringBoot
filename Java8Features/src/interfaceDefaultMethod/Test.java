package interfaceDefaultMethod;

public class Test implements DefaultMethodInterface {

	public static void main(String[] args) {
		
		DefaultMethodInterface d=new Test();
		d.show();
		d.display();

	}

	@Override
	public void display() {
		System.out.println("Display Method");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		//DefaultMethodInterface.super.show();
	}
}

package interfaceDefaultMethod;

public interface DefaultMethodInterface {
	
	public void display();
	default void show(){
		System.out.println("Show Method");
	}

}

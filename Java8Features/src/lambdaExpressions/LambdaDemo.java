package lambdaExpressions;

interface Test{
	
	void show(int i);
	
}

class A implements Test{

	@Override
	public void show(int i) {
		System.out.println("A-show"+i);
		
	}
	
}

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		A a=new A();
		a.show(6);
		Test t=new Test() {

			@Override
			public void show(int i) {
				System.out.println("Anonaminus inner class"+i);				
			}
			
		};
		t.show(5);
		Test t1=i->System.out.println("lambda show method" +i);
		t1.show(1);
	}

}

package LambdaExpression;

@FunctionalInterface
interface A 
{
	void show();
	
}

//class B implements A
//{
//	
//	public void show(){
//		System.out.println("Lambda Expression-1");
//	}
//}

//class Demo2{
//	public void walk() {
//		A obj=new B();
//		obj.show();
//	}
//}

public class Demo {

	public static void main(String[] args) {
		
//		A obj=new B();
//		obj.show();
		
	
		
		
//		A obj=new A() {
//			public void show()
//			{
//			System.out.println("Lambda Expression-2");
//		    }
//		};
//		obj.show();
		
//		Demo2 d=new Demo2();
//		d.walk();
//		
		
		A obj=()->System.out.println("Lambda Expression-3");
		obj.show();

	}

}

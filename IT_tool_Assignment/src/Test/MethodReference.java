package Test;

interface sayHello{
	void say();
}
public class MethodReference {
	public  void hi() {
		System.out.println("hi darling");
	}
	MethodReference(){
		System.out.println("hi hi re kya bat constructor");
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	sayHello sayhello = MethodReference::new;
		sayhello.say();
		}
}

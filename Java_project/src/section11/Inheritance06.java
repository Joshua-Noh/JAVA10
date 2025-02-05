package section11;

class Parent1{
	public void display() {
		System.out.println("부모 클래스의 display() 메서드 입니다.");
	}
}

class Child1 extends Parent1 {
	// 오버라이딩된 display() 메서드
	public void display() {
		System.out.println("자식 클래스의 display() 메서드 입니다.");
	}
	
	// 오버로딩된 display() 메서드
	public void display(String str) {
		System.out.println(str);
	}
}
public class Inheritance06 {

	public static void main(String[] args) {
		Child1 ch = new Child1();
		ch.display();
		ch.display("오버로딩된 display() 메서드 입니다.");
	}

}

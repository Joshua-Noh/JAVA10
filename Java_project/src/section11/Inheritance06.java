package section11;

class Parent1{
	public void display() {
		System.out.println("�θ� Ŭ������ display() �޼��� �Դϴ�.");
	}
}

class Child1 extends Parent1 {
	// �������̵��� display() �޼���
	public void display() {
		System.out.println("�ڽ� Ŭ������ display() �޼��� �Դϴ�.");
	}
	
	// �����ε��� display() �޼���
	public void display(String str) {
		System.out.println(str);
	}
}
public class Inheritance06 {

	public static void main(String[] args) {
		Child1 ch = new Child1();
		ch.display();
		ch.display("�����ε��� display() �޼��� �Դϴ�.");
	}

}

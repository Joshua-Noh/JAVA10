package section11;

class Animal1 {}
class Pig1 extends Animal1 {}

public class EX11_16 {

	public static void main(String[] args) {
		Pig1 p1 = new Pig1();
		Pig1 p2 = new Pig1();
		Animal1 a = p1;
		
		if(a instanceof Pig1) {
			System.out.println("��ü ���� a�� Pig Ÿ������ ������ ��ü �Դϴ�.");
		}
		
		if(a == p1) {
			System.out.println("a�� p1�� ���� ��ü�� �����ϰ� �ֽ��ϴ�.");
		}
		
		if(a == p2) {
			System.out.println("a�� p2�� ���� ��ü�� �����ϰ� ���� �ʽ��ϴ�.");
		}

	}

}

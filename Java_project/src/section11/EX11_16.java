package section11;

class Animal1 {}
class Pig1 extends Animal1 {}

public class EX11_16 {

	public static void main(String[] args) {
		Pig1 p1 = new Pig1();
		Pig1 p2 = new Pig1();
		Animal1 a = p1;
		
		if(a instanceof Pig1) {
			System.out.println("객체 변수 a는 Pig 타입으로 생성된 객체 입니다.");
		}
		
		if(a == p1) {
			System.out.println("a와 p1은 같은 객체를 참조하고 있습니다.");
		}
		
		if(a == p2) {
			System.out.println("a와 p2는 같은 객체를 참조하고 있지 않습니다.");
		}

	}

}

package section11;

class Animal2{
	void cry(){}
}

class Pig2 extends Animal2{
	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
}

class Cow2 extends Animal2{
	@Override
	void cry() {
		System.out.println("음메");
	}
}

class Farm2{
	void sound(Animal2 animal2) {
		animal2.cry();	// <-- 매개변수 참조 객체의 오버라이딩된 메서드를 호출
	}
}

public class EX11_17 {
	public static void main(String[] args) {
		Farm2 f = new Farm2();
		Pig2 p = new Pig2();
		Cow2 c = new Cow2();
		f.sound(p);
		f.sound(c);
	}
}

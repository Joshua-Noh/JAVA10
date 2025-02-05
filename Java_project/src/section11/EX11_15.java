package section11;

// instanceof 연산자의 특징
// instanceof 기준으로 왼쪽 객체가 생성될때 오른쪽 타입으로 생성되었는지 확인하는 연산자.
// 맞으면 true, 아니면 false 를 반환하면 만약 null 을 가르키고 있다면 false 를 반환한다.
class Animal{}
class Pig extends Animal{}
class Cow extends Animal{}

class Farm{
	void sound(Animal animal) {
		if(animal instanceof Pig) { // animal 변수에 담긴 객체 타입이 Pig 이면
			System.out.println("꿀꿀");
		} else { // animal 변수에 담긴 객체의 타입이 Pig가 아니면
			System.out.println("음메");
		}
	}
}

public class EX11_15 {

	public static void main(String[] args) {
			Farm f = new Farm();
			Pig p = new Pig();
			Cow c = new Cow();
			f.sound(p);
			f.sound(c);
	}

}

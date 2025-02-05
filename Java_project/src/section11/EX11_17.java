package section11;

class Animal2{
	void cry(){}
}

class Pig2 extends Animal2{
	@Override
	void cry() {
		System.out.println("�ܲ�");
	}
}

class Cow2 extends Animal2{
	@Override
	void cry() {
		System.out.println("����");
	}
}

class Farm2{
	void sound(Animal2 animal2) {
		animal2.cry();	// <-- �Ű����� ���� ��ü�� �������̵��� �޼��带 ȣ��
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

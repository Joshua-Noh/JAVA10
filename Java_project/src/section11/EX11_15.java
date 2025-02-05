package section11;

// instanceof �������� Ư¡
// instanceof �������� ���� ��ü�� �����ɶ� ������ Ÿ������ �����Ǿ����� Ȯ���ϴ� ������.
// ������ true, �ƴϸ� false �� ��ȯ�ϸ� ���� null �� ����Ű�� �ִٸ� false �� ��ȯ�Ѵ�.
class Animal{}
class Pig extends Animal{}
class Cow extends Animal{}

class Farm{
	void sound(Animal animal) {
		if(animal instanceof Pig) { // animal ������ ��� ��ü Ÿ���� Pig �̸�
			System.out.println("�ܲ�");
		} else { // animal ������ ��� ��ü�� Ÿ���� Pig�� �ƴϸ�
			System.out.println("����");
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

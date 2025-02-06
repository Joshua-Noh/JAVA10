package section11;

class Speaker {
	String name;
	
	Speaker(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}
class RedSpeaker extends Speaker{
	RedSpeaker(){
		super("���� ����Ŀ");
	}
}
class BlueSpeaker extends Speaker{
	
	BlueSpeaker(){
		super("�Ķ� ����Ŀ");
	}
}

class Person{
	Speaker speaker;
	
	Person(Speaker speaker){
		this.speaker = speaker;
	}
	
	void turnOn() {
		System.out.println(speaker.getName() +"�� �������ϴ�.");
	}
	
}

public class PRACTICE_11_03 {
	public static void main(String[] args) {
		Speaker s1 = new RedSpeaker();
		Person p1 = new Person(s1);
		p1.turnOn();
		
		Speaker s2 = new BlueSpeaker();
		Person p2 = new Person(s2);
		p2.turnOn();
		
	}

}

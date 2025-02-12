package section16.game;

//군대 관리 시뮬레이션 (List + Set 활용)
// List, Set을 사용해 유닛을 추가하고 군대의 전투력을 관리하는 게임.
import java.util.*;

class Unit {
 private String name;
 private int power;

 public Unit(String name, int power) {
     this.name = name;
     this.power = power;
 }

 public String getName() {
     return name;
 }

 public int getPower() {
     return power;
 }

 public String toString() {
     return name + "(Power: " + power + ")";
 }
}

class Army {
 private List<Unit> units;

 public Army() {
     units = ???; // List 컬렉션 활용하여 정의할 것.
 }

 public void addUnit(Unit unit) {
     units.add(unit);
 }

 public void showArmy() {
     System.out.println("군대 구성:");
     for (Unit unit : units) {
         System.out.println("- " + unit);
     }
 }

 public int totalPower() {
     int total = 0;
     for (Unit unit : units) {
         total += unit.getPower();
     }
     return total;
 }
}

public class ArmySimulationGame {

	public static void main(String[] args) {
		Army army = new Army();
        Scanner scanner = new Scanner(System.in);

        Set<???> unitNames = ???; // 중복된 유닛 방지 Set 컬렉션 활용하여 정의할 것.

        while (true) {
            System.out.println("1. 유닛 추가  2. 군대 보기  3. 총 전투력 보기  4. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    System.out.print("유닛 이름: ");
                    String name = scanner.nextLine();
                    if (unitNames.contains(name)) {
                        System.out.println("이미 존재하는 유닛입니다!");
                        break;
                    }
                    System.out.print("유닛 전투력: ");
                    int power = scanner.nextInt();
                    army.addUnit(new Unit(name, power));
                    unitNames.add(name);
                    System.out.println("유닛 추가 완료!");
                    break;
                case 2:
                    army.showArmy();
                    break;
                case 3:
                    System.out.println("총 전투력: " + army.totalPower());
                    break;
                case 4:
                    System.out.println("게임 종료!");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }

	}

}

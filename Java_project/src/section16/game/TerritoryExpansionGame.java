package section16.game;

//영토 확장 게임 (Map + List + Iterator 활용)
// Map, List, Iterator를 활용해 영토를 점령하고 자원을 관리하는 게임.
import java.util.*;

class Territory {
    private String name;
    private int resources;

    public Territory(String name, int resources) {
        this.name = name;
        this.resources = resources;
    }

    public String getName() {
        return name;
    }

    public int getResources() {
        return resources;
    }

    public void addResources(int amount) {
        resources += amount;
    }

    public String toString() {
        return name + "(자원: " + resources + ")";
    }
}

public class TerritoryExpansionGame {

	public static void main(String[] args) {
		Map<???> territories = new ???();
        List<???> ownedTerritories = new ???();
        Scanner scanner = new Scanner(System.in);

        // 초기 영토 설정
        territories.put("북부", new Territory("북부", 100));
        territories.put("남부", new Territory("남부", 150));
        territories.put("동부", new Territory("동부", 200));
        territories.put("서부", new Territory("서부", 50));

        System.out.println("영토 확장 게임 시작!");

        while (true) {
            System.out.println("1. 영토 보기  2. 영토 점령  3. 보유 영토 보기  4. 자원 확인  5. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("모든 영토:");
                    for (Territory territory : territories.values()) {
                        System.out.println("- " + territory);
                    }
                    break;
                case 2:
                    System.out.print("점령할 영토 이름: ");
                    String name = scanner.nextLine();
                    System.out.println("name: "+ name);
                    Territory selectedTerritory = ???.get(name);
                    if (selectedTerritory != null) {
                        if (ownedTerritories.contains(name)) {
                            System.out.println("이미 점령한 영토입니다!");
                        } else {
                            ownedTerritories.add(name);
                            System.out.println(name + " 영토 점령 성공!");
                        }
                    } else {
                        System.out.println("존재하지 않는 영토입니다.");
                    }
                    break;
                case 3:
                    System.out.println("보유 중인 영토:");
                    for (String territoryName : ownedTerritories) {
                        System.out.println("- " + territories.get(territoryName));
                    }
                    break;
                case 4:
                    int totalResources = 0;
                    Iterator<String> iterator = ownedTerritories.iterator();
                    while (???) {
                        String territoryName = iterator.next();
                        totalResources += territories.get(territoryName).getResources();
                    }
                    System.out.println("총 자원: " + totalResources);
                    break;
                case 5:
                    System.out.println("게임 종료!");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }

	}

}

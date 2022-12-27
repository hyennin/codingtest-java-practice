import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Map : 키와 값으로 구성된 Entry 객체를 저장
        // 키는 중복 저장X, 값은 중복 저장 가능
        Map<String, Integer> people = new HashMap<String, Integer>();

        // Map에 데이터 넣기
        people.put("김길동", 85);
        people.put("홍길동", 95);
        people.put("최길동", 80);

        System.out.println("총 Entity : " + people.size());

        Set<Map.Entry<String, Integer>> set = people.entrySet(); // Map을 하나의 집합(set)으로 바꿔줌 => ("김길동", 85), ("홍길동", 95), ("최길동", 80)
        Iterator<Map.Entry<String, Integer>> it = set.iterator(); // 반복자 : 포인터 같은 개념(첫 번째 주소 저장)

        while (it.hasNext()) { // 가져올 다음 객체가 있으면 true 없으면 false 반환
            Map.Entry<String, Integer> e = it.next(); // 해당 데이터 가져옴
            System.out.println("\t" + e.getKey() + " : " + e.getValue());
        }

        Collection values = people.values(); // 값을 가져옴
        Collection keys = people.keySet(); // 키를 가져옴
        // 위에 while문에서 작업이 끝나 마지막 entity를 가리키고 있으므로 여기서 다시 첫 번째로 돌림(이 코드에서는 필요X, 그냥 참고)
        it = values.iterator();
        Iterator<Map.Entry<String, Integer>> it2 = keys.iterator();
        // max 라이브러리 사용하여 최고점수 반환
        System.out.println("최고점수 : " + Collections.max(values) + ", 이름 : " + Collections.max(keys));
    }
}

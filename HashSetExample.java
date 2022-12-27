import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("추가할 회원의 이름을 입력하세요 : ");
            String name = scan.next();

            set.add(name);
        }

        System.out.println(set);
    }
}

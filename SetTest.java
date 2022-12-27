import java.util.*;
public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham"); // 중복 저장이 안되므로 얘는 저장X

        System.out.println(set); // add한 순서대로 들어가지 않음

        if (set.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음");
        }
    }
}
import java.lang.reflect.Member;
import java.util.Arrays;

class Student implements Comparable {
    private String name;
    private double gpa;
    public Student(String n, double g) {
        name = n;
        gpa = g;
    }

    public Student(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

//    *************** 문자열 & 숫자 비교하는 법 ***************
//    // 문자열 비교할 때
//    public int compareTo(Member m1) {
//        return (this.name.compareTo(m1.name));
//    } // m1의 name이 크면 양수, 같으면 0, 작으면 음수를 리턴

    // Student의 이름을 비교할 경우
    @Override
    public int compareTo(Object obj) {
        Student other = (Student) obj;
        return (this.name.compareTo(other.name));
    } // other의 name이 크면 양수, 같으면 0, 작으면 음수를 리턴

//    // 숫자 비교 - 오름차순
//    public int compareTo(Member m1) {
//        return (this.id - m1.id);
//    }
//
//    // 숫자 비교 - 내림차순
//    public int compareTo(Member m1) {
//        return (m1.id - this.id);
//    }

    // Student의 학점을 비교할 경우
//    @Override
//    public int compareTo(Object obj) {
//        Student other = (Student) obj;
//
//        if (gpa < other.gpa) {
//            return -1;
//        }
//        else if (gpa > other.gpa) {
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 4.2);
        students[1] = new Student("이길동", 2.8);
        students[2] = new Student("김길동", 3.75);

        Arrays.sort(students);

        System.out.println("*****이름 기준으로 오름차순*****");
        for (Student s : students) {
            System.out.println("이름 : " + s.getName() + "\n학점 : " + s.getGpa());
            System.out.println();
        }
    }
}

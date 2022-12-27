import java.util.*;

class MapStudent {
    int studentId;
    String studentName;

    public MapStudent(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentId + ", " + studentName;
    }

    @Override
    public boolean equals(Object o) {
        MapStudent other = (MapStudent) o;
        return studentId == other.studentId && Objects.equals(studentName, other.studentName);
    }

    @Override
    public int hashCode() {
        return studentId + studentName.hashCode();
    }
}

public class MapStudentTest {
    public static void main(String[] args) {
        Map<MapStudent, Integer> student = new HashMap<MapStudent, Integer>();

        // Map에 데이터 넣기
        student.put(new MapStudent(1, "홍길동"), 95);
        student.put(new MapStudent(1, "홍길동"), 90);
        student.put(new MapStudent(2, "홍길동"), 80);

        System.out.println("총 Entity 수 : " + student.size());
        System.out.println(student);
    }
}

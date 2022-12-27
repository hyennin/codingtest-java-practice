import java.security.cert.TrustAnchor;
import java.util.HashSet;
import java.util.Objects;

class Member {
    private int memberId;   // 회원 아이디
    private String memberName; // 회원 이름

    public Member(int memberId, String memberName) { // 생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + " 입니다";
    }

    // HashSet은 동등 객체를 중복 저장X
    // 다른 객체라도 hashCode()의 리턴값이 같고 equals()의 리턴값이 true이면 같은 객체로 판단하고 중복 저장X
    // id와 name을 기준으로 중복 객체인지 검사
    @Override
    public boolean equals(Object o) {
        Member other = (Member) o;
        return memberId == other.memberId && Objects.equals(memberName, other.memberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberName);
    }

//    // id를 기준으로 중복 객체인지 검사
//    public boolean equals(Object obj) {
//        if (memberId == ((Member)obj).memberId) return true;
//        else return false;
//    }
//
//    public int hashCode() {
//        return ((Integer)memberId).hashCode();
//    }
}

public class MemberTest {
    public static void main(String[] args) {
        HashSet<Member> members = new HashSet<Member>();

        members.add(new Member(1, "홍길동"));
        members.add(new Member(2, "홍길동"));
        members.add(new Member(3, "홍길동"));
        members.add(new Member(1, "홍길동"));

        System.out.println(members);
    }
}
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            int age = scanner.nextInt();
            String name = scanner.next();
            members[i] = new Member(age, name);
        }

        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                return Integer.compare(m1.getAge(), m2.getAge());
            }
        });

        for (Member member : members) {
            System.out.println(member.getAge() + " " + member.getName());
        }
    }
}

class Member {
    private int age;
    private String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

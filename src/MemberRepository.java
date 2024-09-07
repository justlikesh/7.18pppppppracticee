import java.util.HashMap;
import java.util.Map;

import static java.lang.Boolean.FALSE;
//import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;

public class MemberRepository implements Repository {

    static Integer id = 0;

    static Map<Integer, Member> memberDatabase;

    public MemberRepository() {
        memberDatabase = new HashMap<Integer, Member>();
    }

    @Override
    public void create(String name, Integer age, String email) {
        id = id + 1;
        System.out.println("객체 생성 시작");
        memberDatabase.put(id, new Member(id, name, age, email));
//        System.out.println(memberDatabase.get(id));

        System.out.println("객체 생성 종료");
        System.out.println("      ");
    }

    @Override
    public void read(Integer id) {
        System.out.println("객체 읽기 시작");


        System.out.println(memberDatabase.get(id));
        System.out.println("객체 읽기 종료");


    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    public void 니가_가진_멤버_다_보여줘() {
//        Map.Entry<Integer, Member> entrys = memberDatabase.entrySet();
//        Integer
        Integer size = memberDatabase.size();
        for (int i = 1; i <= size; i++) {
            System.out.println(memberDatabase.get(i));
        }
//        System.out.println(entry.Value());
//        System.out.println(memberDatabase);
    }
}




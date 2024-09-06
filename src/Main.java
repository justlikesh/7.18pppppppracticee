//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MemberRepository memberRepository = new MemberRepository();


        memberRepository.create("승호",29,"lpsac@naver.com");
//        memberRepository.read(2);
        memberRepository.니가_가진_멤버_다_보여줘();
    }
}
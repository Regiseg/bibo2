package javanotes.chapter1;

public class Team {
    private Member member;

    public Team(Member member) {
        this.member = member;
    }

    public static void main(String[] args) {
        Member member = new Member("Aurieel","light",10,1);
        Team myTeam = new Team(member);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
    }
}

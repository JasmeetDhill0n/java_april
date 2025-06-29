package encapsulation;

public class MainTeam {
    public static void main(String[] args) {
        Team team = new Team("jasmeet", "jaskaur@gmail.com", "Pass123", 10000.89);


        team.setPlayerPassword("jas123");
        System.out.println("Password updated successfully!");



        System.out.println("fetch username - "+team.getPlayerUserName());

        System.out.println("fetch email- -"+team.getPlayerEmail());

        System.out.println(team);


    }
}


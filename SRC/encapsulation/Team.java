package encapsulation;

public class Team {
   private String playerUserName;
  private  String playerEmail;
   private String playerPassword;
    private double salary;

    public Team(String playerUserName, String playerEmail, String playerPassword, double salary) {
        this.playerUserName = playerUserName;
        this.playerEmail = playerEmail;
        this.playerPassword = playerPassword;
        this.salary = salary;
    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }

    public String getPlayerUserName() {
        return playerUserName;
    }


    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerName(String playerName) {
        this.playerEmail = playerName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "playerUserName='" + playerUserName + '\'' +
                ", playerEmail='" + playerEmail + '\'' +
                ", playerPassword='" + playerPassword + '\'' +
                ", salary=" + salary +
                '}';
    }
}


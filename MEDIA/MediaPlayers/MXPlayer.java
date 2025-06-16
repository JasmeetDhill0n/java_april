package MediaPlayers;

class MXPlayer implements VideoMediaPlayer {
    public void play() { System.out.println("Playing from MXPlayer."); }
    public void pause() { System.out.println("MXPlayer paused."); }
    public void stop() { System.out.println("MXPlayer stopped."); }
    public void rewind() { System.out.println("Rewinding MXPlayer."); }
    public void forward() { System.out.println("Forwarding MXPlayer."); }
    public void speed() { System.out.println("Speed changed on MXPlayer."); }
}


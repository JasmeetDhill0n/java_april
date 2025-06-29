package MediaPlayers;

class Youtube implements AudioMediaPlayer,VideoMediaPlayer {
    public void play() { System.out.println("Playing from Youtube Music."); }
    public void pause() { System.out.println("Youtube Music paused."); }
    public void stop() { System.out.println("Youtube Music stopped."); }
    public void rewind() { System.out.println("Rewinding Youtube Music."); }
    public void forward() { System.out.println("Forwarding Youtube Music."); }
    public void speed() { System.out.println("Speed changed on Youtube Music."); }
}

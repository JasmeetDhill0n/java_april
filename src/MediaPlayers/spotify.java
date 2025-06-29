package MediaPlayers;

class Spotify implements AudioMediaPlayer {
    public void play() { System.out.println("Playing from Spotify."); }
    public void pause() { System.out.println("Spotify paused."); }
    public void stop() { System.out.println("Spotify stopped."); }
    public void rewind() { System.out.println("Spotify rewind not available."); }
    public void forward() { System.out.println("Spotify forward not available."); }
    public void speed() { System.out.println("Spotify speed adjusted."); }
}
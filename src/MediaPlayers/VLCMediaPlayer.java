package MediaPlayers;

class VLCMediaPlayer implements VideoMediaPlayer {

    public void play() { System.out.println("Playing from VLC Media Player."); }
    public void pause() { System.out.println("VLC paused."); }
    public void stop() { System.out.println("VLC stopped."); }
    public void rewind() { System.out.println("VLC rewinding..."); }
    public void forward() { System.out.println("VLC forwarding..."); }
    public void speed() { System.out.println("VLC speed adjusted."); }
}
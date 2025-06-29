package MediaPlayers;
class Netflix implements VideoMediaPlayer {
        public void play() { System.out.println("Playing from Netflix."); }
        public void pause() { System.out.println("Netflix paused."); }
        public void stop() { System.out.println("Netflix stopped."); }
        public void rewind() { System.out.println("Rewinding Netflix."); }
        public void forward() { System.out.println("Forwarding Netflix."); }
        public void speed() { System.out.println("Speed adjusted on Netflix."); }
    }
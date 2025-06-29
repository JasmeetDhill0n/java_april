package MediaPlayers;

    class Udemy implements VideoMediaPlayer {
        public void play() { System.out.println("Playing from Udemy."); }
        public void pause() { System.out.println("Udemy paused."); }
        public void stop() { System.out.println("Udemy stopped."); }
        public void rewind() { System.out.println("Udemy rewind..."); }
        public void forward() { System.out.println("Udemy forward..."); }
        public void speed() { System.out.println("Udemy speed set."); }
    }


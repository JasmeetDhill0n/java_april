package MediaPlayers;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Choose a media platform:");
            System.out.println("1. Spotify\n2. YoutubeMusic\n3. Netflix\n4. MXPlayer\n5. VLC\n6. Youtube\n7. Udemy");

            System.out.println("option - ");
            int choice = sc.nextInt();



            switch (choice) {
                case 1: Media media1 = new Spotify();
                media1.pause();
                media1.play();
                break;

                case 2: Media media2 = new Youtube();
                media2.speed();
                media2.stop();
                break;

                case 3: Media media3 = new Netflix();
                media3.play();
                break;

                case 4: Media media4 = new MXPlayer();
                media4.speed();
                break;

                case 5:Media media5= new VLCMediaPlayer();
                media5.stop();
                break;

                case 6: Media media6 = new Youtube();
                media6.rewind();
                break;

                case 7: Media media7 = new Udemy();
                break;
                default:
                    System.out.println("Invalid option."); return;
            }


            sc.close();
        }
    }


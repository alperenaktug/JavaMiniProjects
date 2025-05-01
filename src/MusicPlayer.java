import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {

        String filePath = "src\\Tavrına Hayran - Semicenk Ft. Reynmen.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.start();

            String response = "";

            while (!response.equals("Q")){
                System.out.println("** Welcome to Music player **");
                System.out.println("-----------------------------");
                System.out.println();
                System.out.println("P = play");
                System.out.println("S = stop");
                System.out.println("R = reset");
                System.out.println("Q = quick");
                System.out.print("Enter your choice :");
                System.out.println();
                System.out.println();
                System.out.println("-----------------------------");

                response = scanner.next().toUpperCase();

                switch (response){

                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();

                    default -> System.out.println("Invalid choice !!");

                }
            }


        } catch (FileNotFoundException e){
            System.out.println("Could not file located");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");

        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resources ");
        }

        catch (IOException e) {
            System.out.println("Something went wrong");

        }finally {
            System.out.println("Byee !! ");
        }
    }
}

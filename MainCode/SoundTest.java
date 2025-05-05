import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;

public class SoundTest {
    public static void main(String[] args) {
        try {
            // Create a simple test sound (a beep)
            AudioFormat format = new AudioFormat(44100, 16, 1, true, false);
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);
            
            // Generate a simple beep sound
            byte[] buffer = new byte[44100 * 2]; // 1 second of audio
            for (int i = 0; i < buffer.length; i++) {
                buffer[i] = (byte) (Math.sin(i / 20.0) * 127);
            }
            
            clip.open(format, buffer, 0, buffer.length);
            
            System.out.println("Press Enter to play the test sound...");
            new Scanner(System.in).nextLine();
            
            // Play the sound
            clip.setFramePosition(0);
            clip.start();
            
            // Wait for the sound to finish
            Thread.sleep(1000);
            
            System.out.println("Sound played successfully!");
            
        } catch (Exception e) {
            System.err.println("Error playing sound: " + e.getMessage());
            e.printStackTrace();
        }
    }
} 
import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;

public class ChessSoundTest {
    public static void main(String[] args) {
        try {
            // Create different test sounds
            AudioFormat format = new AudioFormat(44100, 16, 1, true, false);
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            
            // Create three different sounds
            Clip moveSound = (Clip) AudioSystem.getLine(info);
            Clip captureSound = (Clip) AudioSystem.getLine(info);
            Clip backgroundSound = (Clip) AudioSystem.getLine(info);
            
            // Generate different sounds
            byte[] moveBuffer = generateSound(440, 0.5); // A4 note, 0.5 seconds
            byte[] captureBuffer = generateSound(880, 0.3); // A5 note, 0.3 seconds
            byte[] backgroundBuffer = generateSound(220, 2.0); // A3 note, 2 seconds
            
            // Open the clips
            moveSound.open(format, moveBuffer, 0, moveBuffer.length);
            captureSound.open(format, captureBuffer, 0, captureBuffer.length);
            backgroundSound.open(format, backgroundBuffer, 0, backgroundBuffer.length);
            
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("\nChoose a sound to test:");
                System.out.println("1. Move sound");
                System.out.println("2. Capture sound");
                System.out.println("3. Background sound");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1-4): ");
                
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("Playing move sound...");
                        moveSound.setFramePosition(0);
                        moveSound.start();
                        Thread.sleep(500);
                        break;
                    case 2:
                        System.out.println("Playing capture sound...");
                        captureSound.setFramePosition(0);
                        captureSound.start();
                        Thread.sleep(300);
                        break;
                    case 3:
                        System.out.println("Playing background sound...");
                        backgroundSound.setFramePosition(0);
                        backgroundSound.start();
                        Thread.sleep(2000);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
            
        } catch (Exception e) {
            System.err.println("Error playing sound: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static byte[] generateSound(double frequency, double duration) {
        int sampleRate = 44100;
        int numSamples = (int) (sampleRate * duration);
        byte[] buffer = new byte[numSamples * 2];
        
        for (int i = 0; i < numSamples; i++) {
            double value = Math.sin(2 * Math.PI * frequency * i / sampleRate);
            short sample = (short) (value * 32767);
            buffer[i * 2] = (byte) (sample & 0xFF);
            buffer[i * 2 + 1] = (byte) ((sample >> 8) & 0xFF);
        }
        
        return buffer;
    }
} 
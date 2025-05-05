import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundManager {
    private Clip moveSound;
    private Clip captureSound;

    public SoundManager() {
        try {
            // Create audio format for generated sounds
            AudioFormat format = new AudioFormat(44100, 16, 1, true, false);
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            
            // Create and initialize move and capture sounds
            moveSound = (Clip) AudioSystem.getLine(info);
            captureSound = (Clip) AudioSystem.getLine(info);
            
            // Generate move and capture sounds
            byte[] moveBuffer = generateSound(440, 0.5); // A4 note, 0.5 seconds
            byte[] captureBuffer = generateSound(880, 0.3); // A5 note, 0.3 seconds
            
            // Open clips with generated sounds
            moveSound.open(format, moveBuffer, 0, moveBuffer.length);
            captureSound.open(format, captureBuffer, 0, captureBuffer.length);
            
        } catch (Exception e) {
            System.err.println("Error initializing sounds: " + e.getMessage());
        }
    }
    
    private byte[] generateSound(double frequency, double duration) {
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

    public void playMoveSound() {
        if (moveSound != null) {
            moveSound.setFramePosition(0);
            moveSound.start();
        }
    }

    public void playCaptureSound() {
        if (captureSound != null) {
            captureSound.setFramePosition(0);
            captureSound.start();
        }
    }
} 
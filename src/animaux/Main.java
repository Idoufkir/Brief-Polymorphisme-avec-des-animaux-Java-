package animaux;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Sauvage sauvage = new Sauvage(1, "Cuckoo", "Bird", "C:\\Users\\admin\\OneDrive\\Bureau\\animaux\\sounds\\Cuckoo-Bird.WAV");
		
		sauvage.toString();
		sauvage.ReadSound("C:\\Users\\admin\\OneDrive\\Bureau\\animaux\\sounds\\Cuckoo-Bird.WAV");
		
		
	}
	
}

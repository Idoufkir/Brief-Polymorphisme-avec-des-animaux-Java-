package animaux;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sauvage extends Animal {

	private String sound;
	
	public Sauvage(int id, String name, String categorie, String sound) {
		super(id, name, categorie);
		this.sound = sound;
	}
	
	public String getSound() {
    	return sound;
    }
    
    public void setSound(String sound) {
    	this.sound = sound;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n sound :" + sound;
    }
    
	public void ReadSound(String sound)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(sound));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(sound + " is start ! ");
		System.out.println(sound + " sound is start ! ");
		System.out.println("Play Sound : " + clip.isActive());
		while (clip.isActive()) {
			//System.out.println("hola "+effectSource);
		}
		clip.close();
		System.out.println(sound + " sound is end ! ");
	}

	
   
    
}

package application;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.util.Duration;

public class Sound {
	static Clip clip;
	static Clip Bgclip;
	static Clip Welclip;
	static boolean check = true;
	static boolean cc = true;
	public void playBgSound() {
		String soundFile = "/application/Test/bg.wav";
        URL url = getClass().getResource(soundFile);
       
        AudioInputStream audioStream;
		try {
			audioStream = AudioSystem.getAudioInputStream(url);
			Bgclip = AudioSystem.getClip();
	        Bgclip.open(audioStream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
		FloatControl volume = (FloatControl) Bgclip.getControl(FloatControl.Type.MASTER_GAIN);
		float dB = (float) (Math.log(0.1) / Math.log(10.0) * 20.0);
		volume.setValue(dB);
		
			Bgclip.start();
		
        
        Bgclip.loop(Bgclip.LOOP_CONTINUOUSLY);
	}
	public void playWelcomeSound() {
		String soundFile = "/application/Test/welcome.wav";
        URL url = getClass().getResource(soundFile);
       
        AudioInputStream audioStream;
		try {
			audioStream = AudioSystem.getAudioInputStream(url);
			Welclip = AudioSystem.getClip();
	        Welclip.open(audioStream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
		FloatControl volume = (FloatControl) Welclip.getControl(FloatControl.Type.MASTER_GAIN);
		float dB = (float) (Math.log(0.2) / Math.log(10.0) * 20.0);
		volume.setValue(dB);
			Welclip.start();
		
	}
	 public void playClickSound() {
	        String soundFile = "/application/Test/click.wav";
	        URL url = getClass().getResource(soundFile);
	       
	        AudioInputStream audioStream;
			try {
				audioStream = AudioSystem.getAudioInputStream(url);
				clip = AudioSystem.getClip();
		        clip.open(audioStream);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        
			FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			float dB = (float) (Math.log(0.3) / Math.log(10.0) * 20.0);
			volume.setValue(dB);
			if(check) {
				clip.start();
			}else {
				clip.stop();
			}
	        
	        
	    }
	 public void playCorrectSound() {
	        String soundFile = "/application/Test/correct.wav";
	        URL url = getClass().getResource(soundFile);
	       
	        AudioInputStream audioStream;
			try {
				audioStream = AudioSystem.getAudioInputStream(url);
				clip = AudioSystem.getClip();
		        clip.open(audioStream);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        
			FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			float dB = (float) (Math.log(0.2) / Math.log(10.0) * 20.0);
			volume.setValue(dB);
			if(check) {
				clip.start();
			}else {
				clip.stop();
			}
	        
	    }
	 public void playWrongSound() {
	        String soundFile = "/application/Test/wrong.wav";
	        URL url = getClass().getResource(soundFile);
	       
	        AudioInputStream audioStream;
			try {
				audioStream = AudioSystem.getAudioInputStream(url);
				clip = AudioSystem.getClip();
		        clip.open(audioStream);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        
			FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			float dB = (float) (Math.log(0.2) / Math.log(10.0) * 20.0);
			volume.setValue(dB);
			if(check) {
				clip.start();
			}else {
				clip.stop();
			}
	        
	    }
}

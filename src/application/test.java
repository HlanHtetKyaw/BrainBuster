package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;
import java.io.*;

public class test extends Application {

    private Slider volumeSlider;
    Clip clip;
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click me!");
        button.setOnAction(e -> {
			try {
				playClickSound();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

        volumeSlider = new Slider(0, 1, 1); // Volume slider ranges from 0 to 1
        volumeSlider.setShowTickLabels(true);
        volumeSlider.setShowTickMarks(true);
        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                updateVolume(newValue.doubleValue());
            }
        });
        StackPane root = new StackPane();
        StackPane.setAlignment(volumeSlider, Pos.BOTTOM_CENTER);
        root.getChildren().addAll(button, volumeSlider);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Button Click Sound Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void updateVolume(double percent) {
        if (clip != null) {
            FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            float dB = (float) (Math.log(percent) / Math.log(10.0) * 20.0);
            volume.setValue(dB);
        }
    }
    private void playClickSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        String soundFile = "/application/Test/cc.wav";
        URL url = getClass().getResource(soundFile);
       
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
        clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        clip.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

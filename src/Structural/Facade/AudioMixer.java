package Structural.Facade;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile videFile){
        System.out.println("AudioMixer: fixing audio");
        return new File("tmp");
    }

}

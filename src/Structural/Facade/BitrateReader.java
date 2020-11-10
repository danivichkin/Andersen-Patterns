package Structural.Facade;

public class BitrateReader {
    public static VideoFile read(VideoFile videFile, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return videFile;
    }

    public static VideoFile convert(VideoFile videFile, Codec codec){
        System.out.println("BitrateReader: writing file...");
        return videFile;
    }

}

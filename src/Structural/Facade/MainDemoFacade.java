package Structural.Facade;

import java.io.File;

public class MainDemoFacade {
    VideoConvectFacade converter = new VideoConvectFacade();
    File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
}

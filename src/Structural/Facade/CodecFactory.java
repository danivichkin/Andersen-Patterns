package Structural.Facade;

public class CodecFactory {

    public static Codec extract(VideoFile videFile){
        String type = videFile.getName();
        if(type.equals("mp4")){
            System.out.println("CodecFactory: extracting mpeg audio");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodeFactory: extracting ogg");
            return new OggCompressionCodec();
        }
    }
}

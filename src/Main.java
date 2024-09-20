import strategy.*;

public class Main {
    public static void main(String[] args) {
        var imageStore = new ImageStorage();
        imageStore.store("testFile1.txt", new JpegCompressor(), new HighContrastFilter());
        imageStore.store("testFile2.txt", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
package strategy;

public class PngCompressor implements Compressor {
    @Override
    public void compressor(String fileName) {
        System.out.println("Compressing using Png");
    }
}

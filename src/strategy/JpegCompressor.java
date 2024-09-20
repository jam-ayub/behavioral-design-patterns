package strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compressor(String fileName) {
        System.out.println("Compressing using Jpeg");
    }
}

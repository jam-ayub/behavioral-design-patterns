package strategy;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compressor(fileName);
        filter.apply(fileName);
    }
}

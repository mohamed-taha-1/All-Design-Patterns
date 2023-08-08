package designPatterns.behavioural.strategy.example2;

//Context class
public class ImageCompressor {
	private CompressionStrategy compressionStrategy;

	public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
		this.compressionStrategy = compressionStrategy;
	}

	public void compressImage(String inputFile, String outputFile) {
		compressionStrategy.compress(inputFile, outputFile);
	}
}
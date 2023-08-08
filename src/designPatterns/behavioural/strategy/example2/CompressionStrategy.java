package designPatterns.behavioural.strategy.example2;

//CompressionStrategy interface
@FunctionalInterface
public interface CompressionStrategy {
	void compress(String inputFile, String outputFile);
}

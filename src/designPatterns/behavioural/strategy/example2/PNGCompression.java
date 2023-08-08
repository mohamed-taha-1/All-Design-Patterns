package designPatterns.behavioural.strategy.example2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//PNG compression algorithm
public class PNGCompression implements CompressionStrategy {

	@Override
	public void compress(String inputFile, String outputFile) {
		// Implement PNG compression logic
		try {
			File input = new File(inputFile);
			BufferedImage image = ImageIO.read(input);

			// Specify the compression type for PNG (loss-less compression)
			javax.imageio.ImageWriteParam param = ImageIO.getImageWritersByFormatName("png").next()
					.getDefaultWriteParam();

			// Specify the compression level (0.0 to 1.0)
			float compressionLevel = 0.5f;
			param.setCompressionMode(javax.imageio.ImageWriteParam.MODE_EXPLICIT);
			param.setCompressionQuality(compressionLevel);

			// Create an output file with the specified compression level
			File output = new File(outputFile);
			ImageIO.write(image, "png", output);

			System.out.println("Image compression completed: " + outputFile);
		} catch (IOException e) {
			System.err.println("Error during image compression: " + e.getMessage());
		}
	}

}
package designPatterns.behavioural.strategy.example2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//JPEG compression algorithm
public class JPEGCompression implements CompressionStrategy {
	@Override
	public void compress(String inputFile, String outputFile) {
		// Implement JPEG compression logic
		
		 try {
	            File input = new File(inputFile);
	            BufferedImage image = ImageIO.read(input);

	            // Specify the compression quality (0.0 to 1.0)
	            float compressionQuality = 0.5f;

	            // Create an output file with the specified compression quality
	            // Create the output file name with the specified compression quality
	            String outputFilePath = "./" + "taha-JPG-Comprosser" + ".jpg"; // Save to the local package (current directory)
	            File output = new File(outputFilePath);
	            ImageIO.write(image, "jpg", output);

	            System.out.println("Image compression completed: " + outputFile);
	        } catch (IOException e) {
	            System.err.println("Error during image compression: " + e.getMessage());
	        }
	}
}

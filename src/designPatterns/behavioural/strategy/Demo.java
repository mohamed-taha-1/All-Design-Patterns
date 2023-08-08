package designPatterns.behavioural.strategy;

import java.util.Arrays;

import designPatterns.behavioural.strategy.example1.BubbleSort;
import designPatterns.behavioural.strategy.example1.MergeSort;
import designPatterns.behavioural.strategy.example1.SortContext;
import designPatterns.behavioural.strategy.example2.ImageCompressor;
import designPatterns.behavioural.strategy.example2.JPEGCompression;
import designPatterns.behavioural.strategy.example2.PNGCompression;

public class Demo {

	public static void main(String[] args) {
		/*
		 * <T> use to define group of similar algorithms ; that are changing or
		 * expanding ; Like group of sorting algorithms or group of filtering algorithms
		 *
		 * <T> In this pattern you don not need to describe the logic inside the client
		 * classes; because you encapsulated behavioural and strategy that can be used
		 * across your Application.
		 * 
		 * <T> so, is used to define a family of algorithms, encapsulate each one of
		 * them, and make them interchangeable.
		 * 
		 * <T> The main idea is to separate the behaviour or algorithm from the main
		 * class, allowing it to vary independently. This promotes the
		 * "Open/Closed Principle" of SOLID design, which states that a class should be
		 * open for extension but closed for modification.
		 * 
		 * 
		 * 
		 * 
		 **/

		SortContext sortContext = new SortContext();

		int[] array = { 5, 2, 9, 1, 5, 6 };

		// Use BubbleSort
		sortContext.setSortingStrategy(new BubbleSort());
		sortContext.sortArray(array);

		System.out.println("buuble sort:\t" + Arrays.toString(array));
		// Use MergeSort
		sortContext.setSortingStrategy(new MergeSort());
		sortContext.sortArray(array);
		System.out.println("merge sort:\t" + Arrays.toString(array));

		System.out.println("\n\n***********");

		// Example-2
		ImageCompressor imageCompressor = new ImageCompressor();

		String inputFile = "D:\\Pictures\\download (1).jpg";
		String outputFile = "taha.jpg"; // name for our target output after compression completed

		// Use JPEGCompression
		imageCompressor.setCompressionStrategy(new JPEGCompression());
		imageCompressor.compressImage(inputFile, outputFile);

		// Use PNGCompression
		imageCompressor.setCompressionStrategy(new PNGCompression());
		imageCompressor.compressImage(inputFile, outputFile);
	}

}

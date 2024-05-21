
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;

public class ProductDataBase {
	
	private HashMap<String, Item> productDatabase;
	private final String fileName = "ProductDatabase.txt";
	
	public ProductDataBase() throws IOException {
		productDatabase = new HashMap<String, Item>();
		fillInTheProductDatabase();
	}
	
	public HashMap<String, Item> getProductDataBase(){
		return productDatabase;
	}
	
	private boolean fillInTheProductDatabase() throws IOException {
		File file = new File(fileName);
		if(!file.exists())
			return false;
		else {
			FileReader fReader = new FileReader(fileName, Charset.forName("utf-8"));
			BufferedReader bReader = new BufferedReader(fReader);
			String line;
			Item tempItem;
			ArrayList<ImageIcon> tempImages;
			while((line = bReader.readLine()) != null) {
				String key = line;
				tempImages = new ArrayList<>();
				tempItem = new Item(key, bReader.readLine(), bReader.readLine(), bReader.readLine());
				tempItem.setIcon(new ImageIcon(bReader.readLine()));
				tempImages.add(new ImageIcon(bReader.readLine()));
				tempImages.add(new ImageIcon(bReader.readLine()));
				tempImages.add(new ImageIcon(bReader.readLine()));
				tempImages.add(new ImageIcon(bReader.readLine()));
				tempItem.setAllImages(tempImages);
				tempItem.setQuantity(Integer.valueOf(bReader.readLine()));
				productDatabase.put(key, tempItem);	
				
			}
			bReader.close();
			return true;
		}
	}
}

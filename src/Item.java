
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Item extends Product {
	private ImageIcon icon;
	private ArrayList<ImageIcon> allImages;
	private int quantity;
	private int howMany;
	public int getHowMany() {
		return howMany;
	}

	public void setHowMany(int howMany) {
		this.howMany = howMany;
	}

	public Item(String id, String description, String price, String manufacturer) {
		super(id, description, price, manufacturer);
		this.howMany = 0;
	}

	public Item(String id, String description, String price, String manufacturer, ImageIcon icon, ArrayList<ImageIcon> allImages, int quantity) {
		super(id, description, price, manufacturer);
		this.icon = icon;
		this.allImages = allImages;
		this.quantity = quantity;
		this.howMany = 0;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public ArrayList<ImageIcon> getAllImages() {
		return allImages;
	}

	public void setAllImages(ArrayList<ImageIcon> allImages) {
		this.allImages = allImages;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

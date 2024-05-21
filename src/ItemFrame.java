
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ItemFrame extends JFrame {
	protected ItemsPanel itemsPanel;
	public ItemFrame(Item item, ItemsPanel itemsPanel) {
		this.setTitle("Item informations");
		this.itemsPanel = itemsPanel;
		this.add(new ItemPanel(item, this));
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

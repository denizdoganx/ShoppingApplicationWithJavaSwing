import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


import javax.swing.JButton;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class ItemsPanel extends JPanel implements ActionListener {

	protected ControlPanel controlPanel;
	private ProductDataBase allProducts;
	private HashMap<String, Item> databaseForProducts;
	@SuppressWarnings("unused")
	private Iterator<String> idIterator;
	@SuppressWarnings("unused")
	private Iterator<Item> itemIterator;
	private String[] idArray;
	private Item[] itemArray;
	private JButton buttonOfItem1;
	private JButton buttonOfItem2;
	private JButton buttonOfItem3;
	private JButton buttonOfItem4;
	private JButton buttonOfItem5;
	private JButton buttonOfItem6;
	private JButton buttonOfItem7;
	private JButton buttonOfItem8;
	private JButton buttonOfItem9;
	private JButton buttonOfItem10;

	private final int spaceX = 32;
	private final int spaceY = 40;
	private final int buttonWidth = 244;
	private final int buttonHeight = 180;


	public ItemsPanel(ProductDataBase allProducts, ControlPanel controlPanel) {
		
		this.controlPanel = controlPanel;
		this.allProducts = allProducts;
		this.setBounds(75, 200, 1350, 500);
		this.setBackground(Color.white);
		this.setLayout(null);
		initialize();
	}
	

	private void initialize() {
		databaseForProducts = allProducts.getProductDataBase();
		idArray = new String[30];
		itemArray = new Item[30];
		fillInTheArrays();
		fillInTheScreen();
	}
	
	private void fillInTheArrays() {
		Set<String> idSet = databaseForProducts.keySet();
		Iterator<String> idIterator = idSet.iterator();
		
		Collection<Item> collectionOfItems = databaseForProducts.values();
		Iterator<Item> itemIterator = collectionOfItems.iterator(); 
		int index = 0;
		while(idIterator.hasNext()) {
			idArray[index] = idIterator.next();
			itemArray[index] = itemIterator.next();
			index++;
		}
	}
	
	private void fillInTheScreen() {
		setPropertiesOfButton1();
		setPropertiesOfButton2();
		setPropertiesOfButton3();
		setPropertiesOfButton4();
		setPropertiesOfButton5();
		setPropertiesOfButton6();
		setPropertiesOfButton7();
		setPropertiesOfButton8();
		setPropertiesOfButton9();
		setPropertiesOfButton10();
		
		//buttonOfItem1.setIconTextGap(25);
		//Border border = BorderFactory.createLineBorder(Color.white, 3);
		//buttonOfItem1.setBorder(border);
		
		this.add(buttonOfItem1);
		this.add(buttonOfItem2);
		this.add(buttonOfItem3);
		this.add(buttonOfItem4);
		this.add(buttonOfItem5);
		this.add(buttonOfItem6);
		this.add(buttonOfItem7);
		this.add(buttonOfItem8);
		this.add(buttonOfItem9);
		this.add(buttonOfItem10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonOfItem1) {
			new ItemFrame(itemArray[0], this);
		}
		else if(e.getSource() == buttonOfItem2) {
			new ItemFrame(itemArray[1], this);
		}
		else if(e.getSource() == buttonOfItem3) {
			new ItemFrame(itemArray[2], this);
		}
		else if(e.getSource() == buttonOfItem4) {
			new ItemFrame(itemArray[3], this);
		}
		else if(e.getSource() == buttonOfItem5) {
			new ItemFrame(itemArray[4], this);
		}
		else if(e.getSource() == buttonOfItem6) {
			new ItemFrame(itemArray[5], this);
		}
		else if(e.getSource() == buttonOfItem7) {
			new ItemFrame(itemArray[6], this);
		}
		else if(e.getSource() == buttonOfItem8) {
			new ItemFrame(itemArray[7], this);
		}
		else if(e.getSource() == buttonOfItem9) {
			new ItemFrame(itemArray[8], this);
		}
		else if(e.getSource() == buttonOfItem10) {
			new ItemFrame(itemArray[9], this);
		}
	}
	
	private void setPropertiesOfButton1() {
		
		buttonOfItem1 = new JButton(itemArray[0].getDescription(), itemArray[0].getIcon());
		buttonOfItem1.addActionListener(this);
		//buttonOfItem1.setBorder(null);
		buttonOfItem1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem1.setFocusable(false);
		buttonOfItem1.setBackground(Color.white);
		buttonOfItem1.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem1.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem1.setBounds(0, 0, buttonWidth, buttonHeight);
	}
	
	private void setPropertiesOfButton2() {
		buttonOfItem2 = new JButton(itemArray[1].getDescription(), itemArray[1].getIcon());
		buttonOfItem2.addActionListener(this);
		//buttonOfItem2.setBorder(null);
		buttonOfItem2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem2.setFocusable(false);
		buttonOfItem2.setBackground(Color.white);
		buttonOfItem2.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem2.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem2.setBounds(buttonWidth + spaceX, 0, buttonWidth, buttonHeight);
	}
	
	private void setPropertiesOfButton3() {
		buttonOfItem3 = new JButton(itemArray[2].getDescription(), itemArray[2].getIcon());
		buttonOfItem3.addActionListener(this);
		//buttonOfItem3.setBorder(null);
		buttonOfItem3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem3.setFocusable(false);
		buttonOfItem3.setBackground(Color.white);
		buttonOfItem3.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem3.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem3.setBounds((buttonWidth + spaceX) * 2, 0, buttonWidth, buttonHeight);
	}
	
	private void setPropertiesOfButton4() {
		buttonOfItem4 = new JButton(itemArray[3].getDescription(), itemArray[3].getIcon());
		buttonOfItem4.addActionListener(this);
		//buttonOfItem4.setBorder(null);
		buttonOfItem4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem4.setFocusable(false);
		buttonOfItem4.setBackground(Color.white);
		buttonOfItem4.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem4.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem4.setBounds((buttonWidth + spaceX) * 3, 0, buttonWidth, buttonHeight);
	}
	
	private void setPropertiesOfButton5() {
		buttonOfItem5 = new JButton(itemArray[4].getDescription(), itemArray[4].getIcon());
		buttonOfItem5.addActionListener(this);
		//buttonOfItem5.setBorder(null);
		buttonOfItem5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem5.setFocusable(false);
		buttonOfItem5.setBackground(Color.white);
		buttonOfItem5.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem5.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem5.setBounds((buttonWidth + spaceX) * 4, 0, buttonWidth, buttonHeight);
	}
	
	private void setPropertiesOfButton6() {
		buttonOfItem6 = new JButton(itemArray[5].getDescription(), itemArray[5].getIcon());
		buttonOfItem6.addActionListener(this);
		//buttonOfItem6.setBorder(null);
		buttonOfItem6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem6.setFocusable(false);
		buttonOfItem6.setBackground(Color.white);
		buttonOfItem6.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem6.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem6.setBounds(0, buttonHeight + spaceY, buttonWidth, buttonHeight);
	}
	
	private void setPropertiesOfButton7() {
		buttonOfItem7 = new JButton(itemArray[6].getDescription(), itemArray[6].getIcon());
		buttonOfItem7.addActionListener(this);
		//buttonOfItem7.setBorder(null);
		buttonOfItem7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem7.setFocusable(false);
		buttonOfItem7.setBackground(Color.white);
		buttonOfItem7.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem7.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem7.setBounds(buttonWidth + spaceX, buttonHeight + spaceY, buttonWidth, buttonHeight);
	}
	
	private void setPropertiesOfButton8() {
		buttonOfItem8 = new JButton(itemArray[7].getDescription(), itemArray[7].getIcon());
		buttonOfItem8.addActionListener(this);
		//buttonOfItem8.setBorder(null);
		buttonOfItem8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem8.setFocusable(false);
		buttonOfItem8.setBackground(Color.white);
		buttonOfItem8.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem8.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem8.setBounds((buttonWidth + spaceX) * 2, buttonHeight + spaceY, buttonWidth, buttonHeight);
	}
	
	private void setPropertiesOfButton9() {
		buttonOfItem9 = new JButton(itemArray[8].getDescription(), itemArray[8].getIcon());
		buttonOfItem9.addActionListener(this);
		//buttonOfItem9.setBorder(null);
		buttonOfItem9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem9.setFocusable(false);
		buttonOfItem9.setBackground(Color.white);
		buttonOfItem9.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem9.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem9.setBounds((buttonWidth + spaceX) * 3, buttonHeight + spaceY, buttonWidth, buttonHeight);
	}
	
	private void setPropertiesOfButton10() {
		buttonOfItem10 = new JButton(itemArray[9].getDescription(), itemArray[9].getIcon());
		buttonOfItem10.addActionListener(this);
		//buttonOfItem10.setBorder(null);
		buttonOfItem10.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonOfItem10.setFocusable(false);
		buttonOfItem10.setBackground(Color.white);
		buttonOfItem10.setHorizontalTextPosition(JButton.CENTER);
		buttonOfItem10.setVerticalTextPosition(JButton.BOTTOM);
		buttonOfItem10.setBounds((buttonWidth + spaceX) * 4, buttonHeight + spaceY, buttonWidth, buttonHeight);
	}

}

package cafe;

public abstract class MenuComponent {
	
	protected int numOfSubmenus = 0;
	protected int numOfItems = 0;
	protected int numOfAllItems = 0;
	protected int numOfAllSubmenus = 0;
	
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	
	public void setNumbersOfItemsAndSubmenus(){
		throw new UnsupportedOperationException();
	}
	
	public int getNumberOfItems(){
		throw new UnsupportedOperationException();
	}
	
	public int getNumberOfSubmenus(){
		throw new UnsupportedOperationException();
	}

	public int getNumberOfAllItems() {
		throw new UnsupportedOperationException();
	}

	public int getNumberOfAllSubmenus() {
		throw new UnsupportedOperationException();
	}

}
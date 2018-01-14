package cafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WaitressTest {
	
	private Waitress waitress;
	private Menu cafeMenu;
	private Menu pancakeMenu;
	
	@Before
	public void before(){
		cafeMenu = new CafeMenu();
		pancakeMenu = new PancakeMenu();
		waitress = new Waitress(pancakeMenu, cafeMenu);
	}
	
	@Test
	public void waitressKnowsHowManyItemsAreInBothMenus() {
		waitress.updateKnowledge();
		assertEquals(3, waitress.getNumberOfPancakeMenuItems());
		assertEquals(3, waitress.getNumberOfCafeMenuItems());
	}
	
	@Test
	public void waitressKnowsAboutAddedItemsToTheCafeMenu(){
		cafeMenu.addItem("Apple tart", "Traditional tart", true, 1.90);
		cafeMenu.addItem("Berry tart", "Traditional tart", true, 1.80);
		waitress.updateKnowledge();
		assertEquals(5, waitress.getNumberOfCafeMenuItems());
	}
	
	@Test
	public void waitressKnowsAboutAddedItemToThePancakeMenu(){
		pancakeMenu.addItem("Pancakes XL", "Big pancakes", true, 2.00);
		waitress.updateKnowledge();
		assertEquals(4, waitress.getNumberOfPancakeMenuItems());
	}
}

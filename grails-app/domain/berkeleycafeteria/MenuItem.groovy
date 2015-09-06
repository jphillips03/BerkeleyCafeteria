package berkeleycafeteria

/**
 * The MenuItem class defines an item in a Store that can be added to a CafeteriaOrder.
 * 
 * @author JPhillips
 * @version 9/6/15
 */
class MenuItem {

    //---Relational Definitions---------------------------------------------------
	
	static belongsTo = [store:Store]
	static hasMany = [cafeteriaOrderMenuItems:CafeteriaOrderMenuItem]
	
	//---Field Definitions--------------------------------------------------------
	
	/* The name of the image file to display with the MenuItem when displaying the menu. */
	String image
	/* The display name for this MenuItem. */
	String name
	/* The price of this MenuItem. */
	double price
	
	/* Any constraints when saving the database object are defined below. */
    static constraints = {
    }
	
	//---Public Methods-----------------------------------------------------------
	
	/**
	 * Adds this MenuItem to the given CafeteriaOrder with the given quantity.
	 * 
	 * @param order - The CafeteriaOrder to tie this MenuItem to.
	 * @param quantity - The number of MenuItems to add to the CafeteriaOrder.
	 */
	public void addToCafeteriaOrder(CafeteriaOrder order, int quantity) {
		CafeteriaOrderMenuItem.link(order, this, quantity)
	}
	
	/**
	 * Removes this MenuItem from the given CafeteriaOrder.
	 * 
	 * @param order - The CafeteriaOrder to remove from the MenuItem from.
	 */
	public void removeFromCafeteriaOrder(CafeteriaOrder order) {
		CafeteriaOrderMenuItem.unlink(order, this)
	}
}

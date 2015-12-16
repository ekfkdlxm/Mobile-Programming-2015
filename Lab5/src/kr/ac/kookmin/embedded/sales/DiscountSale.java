package kr.ac.kookmin.embedded.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		
		super();
		discount=0;
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		
		super(theName,thePrice);
		discount=theDiscount;
	}
	
	public DiscountSale(DiscountSale originalObject) {
		
		super(originalObject.getName(),originalObject.getPrice());
		discount=originalObject.getDiscount();
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		
		return getPrice()-getPrice()*getDiscount()*0.01;
	}
	
	public double getDiscount() {
	
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		
		discount=newDiscount;
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		
		if(this==otherObject)
			return true;
		else
			return false;
	}
	
	
	public DiscountSale clone() {
		
		return new DiscountSale();
	}

	
}
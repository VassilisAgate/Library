package Core;

import Exception.AvailabilityException;

public interface Borrowable {
	public void borrowItem() throws AvailabilityException ;
	public void returnItem();
	public int getId();
	public boolean isAvailable();

}

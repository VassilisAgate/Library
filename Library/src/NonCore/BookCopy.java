package NonCore;

import Core.Borrowable;
import Exception.AvailabilityException;

public class BookCopy implements Borrowable {

	private int id;
	private boolean available;
	private Book book;

	public BookCopy(int id) {
		this.id = id;
		this.available = true;
	}

	public void borrowItem() throws AvailabilityException {
		if (available == true) {
			available = false;
		}
		else {
			throw new AvailabilityException("Problem: the book copy cannot be borrowed");
		}
	}

	public void returnItem() {
		if (available == false)
			available = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "BookCopy [id=" + id + ", available=" + available + "]";
	}

}

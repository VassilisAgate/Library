package NonCore;

public class BookCopy {
	
	private int id;
	private boolean available;

	public BookCopy(int id) {
		this.id = id;
		this.available = true;
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

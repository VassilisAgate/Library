package Core;

public interface Borrowable {
	public void borrowItem();
	public void returnItem();
	public int getId();
	public boolean isAvailable();

}

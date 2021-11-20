package Core;

import java.util.ArrayList;
import java.util.List;

import Exception.AvailabilityException;

public class Member {

	private int id;
	private String name;
	static final int MAX_ON_LOAN = 6;
	private List<Borrowable> onLoan;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
		onLoan = new ArrayList<Borrowable>();
	}

	public void borrows(Borrowable b) throws AvailabilityException{

		if (onLoan.size() < MAX_ON_LOAN) {
			b.borrowItem();
			onLoan.add(b);

		}
	}

	public void returns(Borrowable b) throws AvailabilityException{

		b.returnItem();
		onLoan.remove(b);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMaxOnLoan() {
		return MAX_ON_LOAN;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", MAX_ON_LOAN=" + MAX_ON_LOAN + "]";
	}

}

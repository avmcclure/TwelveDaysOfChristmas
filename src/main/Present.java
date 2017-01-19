package main;

public class Present {
	private PresentEnumerable presentDay;
	private int numberOfPresents;
	
	public Present(PresentEnumerable presentType, int numberOfPresents) {
		this.presentDay = presentType;
		this.numberOfPresents = numberOfPresents;
	}

	public PresentEnumerable getPresentDay() {
		return presentDay;
	}

	public int getNumberOfPresents() {
		return numberOfPresents;
	}
	
	public String getPresentType() {
	    return presentDay.getPresent();
	}
}

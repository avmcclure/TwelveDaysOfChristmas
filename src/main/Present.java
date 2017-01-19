package main;

public class Present {
	private PresentEnumerable presentType;
	private int numberOfPresents;
	
	public Present(PresentEnumerable presentType, int numberOfPresents) {
		this.presentType = presentType;
		this.numberOfPresents = numberOfPresents;
	}

	public PresentEnumerable getPresentType() {
		return presentType;
	}

	public int getNumberOfPresents() {
		return numberOfPresents;
	}
}

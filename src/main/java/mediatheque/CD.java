package mediatheque;

public class CD extends Item {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	private int numberOfTracks;

	public CD(int numberOfTracks, String title) {
		super(title);
		this.numberOfTracks = numberOfTracks;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	@Override
	public String toString() {
		return "CD{" + super.toString() + ",numberOfTracks=" + numberOfTracks + '}';
	}
	
}

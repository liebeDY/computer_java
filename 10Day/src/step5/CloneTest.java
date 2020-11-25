package step5;

public class CloneTest implements Cloneable{

	public int x;
	public int y;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

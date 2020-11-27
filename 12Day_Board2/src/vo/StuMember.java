package vo;

public class StuMember extends Member {

	private String Stuid;
	
	public StuMember(String id, String contents, String Stuid) {
		super(id, contents);
		this.Stuid = Stuid;
	}

	public String getStuid() {
		return Stuid;
	}

	public void setStuid(String stuid) {
		Stuid = stuid;
	}

	@Override
	public String toString() {
		return "StuMember [Stuid=" + Stuid + ", getId()=" + getId() + ", getContents()=" + getContents() + "]";
	}
}

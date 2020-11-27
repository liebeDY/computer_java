package vo;

public class EmpMember extends Member {

	private String dept;

	public EmpMember(String id, String contents) {
		super(id, contents);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmpMember [dept=" + dept + ", getId()=" + getId() + ", getContents()=" + getContents() + "]";
	}
}

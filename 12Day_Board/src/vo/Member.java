package vo;

import java.io.Serializable;

public class Member implements Serializable {
	
	private String Id;
	private String Contents;
	
	public Member(String id, String contents) {
		super();
		Id = id;
		Contents = contents;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getContents() {
		return Contents;
	}

	public void setContents(String contents) {
		Contents = contents;
	}

	@Override
	public String toString() {
		return "Member [Id=" + Id + ", Contents=" + Contents + "]";
	}
	
	
}

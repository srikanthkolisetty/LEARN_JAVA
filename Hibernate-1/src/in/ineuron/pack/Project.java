package in.ineuron.pack;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Project {

	public Project()
	{
		
	}
	@EmbeddedId
	private Id ids;
	
	private String pname;
	
	private String prjname;

	public Id getIds() {
		return ids;
	}

	public void setIds(Id ids) {
		this.ids = ids;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPrjname() {
		return prjname;
	}

	public void setPrjname(String prjname) {
		this.prjname = prjname;
	}
	
}

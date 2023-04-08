package in.ineuron.pack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lob {
	
	@Id
	private int id;
	
	@javax.persistence.Lob
	private byte[] img;
	
	@javax.persistence.Lob
	private char[] text;
	
	public Lob()
	{
		System.out.println("zero arg constructor");
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public char[] getText() {
		return text;
	}

	public void setText(char[] text) {
		this.text = text;
	}
	
}

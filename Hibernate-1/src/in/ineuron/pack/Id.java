package in.ineuron.pack;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

@Embeddable
public class Id implements Serializable{
	
	public Id()
	{
		
	}
	@GenericGenerator(name="gen2",strategy="in.ineuron.test.CustomGenerator")
	@GeneratedValue(generator="gen2")
	private int pid;

	@GeneratedValue(generator="gen2")
	private int prjid;
}

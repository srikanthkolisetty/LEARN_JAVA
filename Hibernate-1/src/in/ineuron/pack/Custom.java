package in.ineuron.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Custom {

@Id
@GenericGenerator(name="gen1",strategy="in.ineuron.test.CustomGenerator")
@GeneratedValue(generator="gen1")
 private String id;
 private String name;
 private String course;
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getId() {
	return id;
}
public void setId(String id) {
	
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
}

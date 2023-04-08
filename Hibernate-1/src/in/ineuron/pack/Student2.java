package in.ineuron.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="studentj")
@DynamicInsert
@DynamicUpdate
public class Student2 {
	
	public Student2()
	{
		System.out.println("zero arg constructor");
	}
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="name",length=5)
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private String course;
	private Integer age;
	public String toString()
	{
		return id+" hi"+" "+name+" "+age+"  "+course;
	}
}

package in.ineuron.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="studentj")
@DynamicInsert
@DynamicUpdate
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name="hql",query="From Student")
@NamedNativeQuery(name="hello",query="select * from studentj")
@NamedStoredProcedureQuery(name="stode", procedureName = "fetch2")
public class Student {
	
	public Student()
	{
		System.out.println("zero arg constructor");
	}
	@Id
	@Column(name="id")
//	@GenericGenerator(name="gen", strategy = "")
	//@GeneratedValue()
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
		return id+"hi srikanth "+" "+name+" "+age+"  "+course;
	}
}


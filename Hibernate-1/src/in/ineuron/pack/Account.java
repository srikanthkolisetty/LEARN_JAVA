package in.ineuron.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
@FilterDef(name="Acc_Filter",parameters= {@ParamDef(name="accType1",type="string"),
		@ParamDef(name="accType2",type="string")
})
@Filter(name="Acc_Filter",condition = "active not in (:accType1,:accType2)")
@Entity
@Table(name="Accounts")
//@SQLDelete(sql = "update Accounts set active='closed' where AccNo=?")
//@Where(clause = "active='blocked'")
public class Account {

	@Id
	@Column(name="Accno")
	private Integer accNo;
	private String branch;
	private Integer balance;
	private String active;
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String toString()
	{
	return accNo+" "+branch+" "+balance+" "+active;
	}
}

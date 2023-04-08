package in.ineuron.pack;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="cou")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Versionn {

	public Versionn() {

	}
	
	@Id
	private int id;
	@Version
	private int count;
	@CreationTimestamp
	private LocalDate cre;
	@UpdateTimestamp
	private LocalDateTime upd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public LocalDate getCre() {
		return cre;
	}

	public void setCre(LocalDate cre) {
		this.cre = cre;
	}

	public LocalDateTime getUpd() {
		return upd;
	}

	public void setUpd(LocalDateTime upd) {
		this.upd = upd;
	}
}

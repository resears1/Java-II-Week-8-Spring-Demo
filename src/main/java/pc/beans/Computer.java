package pc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int buildYear;
	private String power;
	@Autowired
	private Components components;
	
	public Computer() {
		super();
		this.power = "average";
	}
	
	public Computer(String name) {
		super();
		this.name = name;
	}
	
	public Computer(String name, int buildYear, String power) {
		super();
		this.name = name;
		this.buildYear = buildYear;
		this.power = power;
	}
	
	public Computer(int id, String name, int buildYear, String power) {
		super();
		this.id = id;
		this.name = name;
		this.buildYear = buildYear;
		this.power = power;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public Components getComponents() {
		return components;
	}

	public void setComponents(Components components) {
		this.components = components;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", buildYear=" + buildYear + ", power=" + power
				+ ", components=" + components + "]";
	}
}

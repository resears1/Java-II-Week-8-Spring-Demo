package pc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Components {
	private String cpu;
	private String gpu;
	private int psu;
	private int ramSize;
	
	public Components() {
		super();
	}

	public Components(String cpu, String gpu, int psu, int ramSize) {
		super();
		this.cpu = cpu;
		this.gpu = gpu;
		this.psu = psu;
		this.ramSize = ramSize;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public int getPsu() {
		return psu;
	}

	public void setPsu(int psu) {
		this.psu = psu;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	@Override
	public String toString() {
		return "Components [cpu=" + cpu + ", gpu=" + gpu + ", psu=" + psu + ", ramSize=" + ramSize + "]";
	}
	
}

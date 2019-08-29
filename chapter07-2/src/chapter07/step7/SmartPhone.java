package chapter07.step7;

public class SmartPhone extends Phone {
	private String osType;
	private String osVersion;
	private int memoryCapacity;
	private boolean camera;
	private boolean bluetooth;
	
	public SmartPhone(String productionCompany, String dataType, long price, 
			String osType, String osVersion, int memoryCapacity, boolean camera, boolean bluetooth) {
		super(productionCompany, dataType, price);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memoryCapacity= memoryCapacity;
		this.camera= camera;
		this.bluetooth= bluetooth;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public int getMemoryCapacity() {
		return memoryCapacity;
	}

	public void setMemoryCapacity(int memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	@Override
	public String toString() {
		return "SmartPhone [osType=" + osType + ", osVersion=" + osVersion + ", memoryCapacity=" + memoryCapacity
				+ ", camera=" + camera + ", bluetooth=" + bluetooth + "]";
	}
	
}

package chapter10.view_control_test;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty image;
	
	public Phone(String smartPhone, String image) {
		super();
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.image = new SimpleStringProperty(smartPhone);
	}

	public String getSmartPhone() {
		return this.smartPhone.get();
	}

	public void setSmartPhone(String smartPhone) {
		this.smartPhone.set(smartPhone);
	}

	public String getImage() {
		return this.image.get();
	}

	public void setImage(String image) {
		this.image.set(image);
	}
	
	
}

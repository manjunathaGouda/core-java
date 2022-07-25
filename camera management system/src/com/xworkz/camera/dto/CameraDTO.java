package com.xworkz.camera.dto;

public class CameraDTO {
	
	public CameraDTO() {
		System.out.println("the constructor () is created");
	}
	
	
	/*public CameraDTO(int id, String brandName, String color, String type, String model, int price, String processor,
			String pixel, String quality, String accessoryShoe) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.color = color;
		this.type = type;
		this.model = model;
		this.price = price;
		this.processor = processor;
		this.pixel = pixel;
		this.quality = quality;
		AccessoryShoe = accessoryShoe;
	}    */



	private int id;
	private String brandName;
	private String color;
	private String type;
	private String model;
	private int price;
	private String processor;
	private String pixel;
	private String quality;
	private String AccessoryShoe;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getPixel() {
		return pixel;
	}

	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getAccessoryShoe() {
		return AccessoryShoe;
	}

	public void setAccessoryShoe(String accessoryShoe) {
		AccessoryShoe = accessoryShoe;
	}


	@Override
	public String toString() {
		return "CameraDTO [id=" + id + ", brandName=" + brandName + ", color=" + color + ", type=" + type + ", model="
				+ model + ", price=" + price + ", processor=" + processor + ", pixel=" + pixel + ", quality=" + quality
				+ ", AccessoryShoe=" + AccessoryShoe + "]";
	}
	

}

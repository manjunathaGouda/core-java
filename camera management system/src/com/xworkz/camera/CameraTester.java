package com.xworkz.camera;

import java.util.Scanner;

import com.xworkz.camera.dto.CameraDTO;

public class CameraTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CameraDTO dto = new CameraDTO();
		
		System.out.println("Enter the id");
		int id = sc.nextInt();
		
		System.out.println("Enter the brandName");
		String brandName = sc.next();
		
		System.out.println("Enter the color");
		String color = sc.next();
		
		System.out.println("Enter the type");
		String type = sc.next();
		
		System.out.println("Enter the model");
		String model = sc.next();
		
		System.out.println("Enter the price");
		int price = sc.nextInt();
		
		System.out.println("Enter the processor");
		String processor = sc.next();
		
		System.out.println("Enter the pixel");
		String pixel = sc.next();
		
		System.out.println("Enter the Quality");
		String Quality = sc.next();
		
		System.out.println("Enter the AccessoryShoe");
		String AccessoryShoe = sc.next();
		
		dto.setId(id);
		dto.setBrandName(brandName);
		dto.setColor(color);
		dto.setType(type);
		dto.setModel(model);
		dto.setPrice(price);
		dto.setProcessor(processor);
		dto.setPixel(pixel);
		dto.setQuality(Quality);
		dto.setAccessoryShoe(AccessoryShoe);
		
	//	CameraDTO dto = CameraDTO(1,"canon","black","qqq","zzz",7894,"qwer","xcvb","xcvfg","tttt");
		
	//	System.out.println(id+" "+brandName+"  "+color+"  "+type+"  "+model+"  "+price+"  "+proccessor+"  "+pixel+"  "+quality+"  "+accessoryShoe);
		
		System.out.println(dto);
		
		Camera c = new Camera();
		c.picThePhoto();
		c.transitionDuration();
		c.idleRotationSpeed();
		c.zoomStopsAnimation();
		c.idleRotationWaitTime();
	}

}

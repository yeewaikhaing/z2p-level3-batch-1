package day12.collection;

import java.util.ArrayList;
import java.util.List;

class Phone{
	 String brand;
	 int price;
	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	 
	 
}
public class ArrayList_Testing_3 {

	public static void main(String[] args) {
		List<Phone> list = new ArrayList<>();
		
		list.add(new Phone("iPhone",1500000));
		list.add(new Phone("Samsung",2300000));
		list.add(new Phone("Vivo",3000000));
		
		Phone ph = new Phone("Oppo", 500000);
		list.add(ph);
		
		list.forEach(phone -> System.out.println("Brand: " + phone.brand + ",Price: " + phone.price));
		System.out.println("________________");
		list.forEach(phone ->{
			if(phone.price > 500000)
				System.out.println(phone.brand + "," + phone.price);
		});
		
		Phone obj = list.get(0);
		System.out.println("Brand: " + obj.brand + ", Price: " + obj.price);
	}
}

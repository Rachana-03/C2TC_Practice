/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamPractice;

import java.util.ArrayList;
import java.util.List;

class Product
{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}


public class JavaStreamExample {
    public static void main(String[] args) {
		List<Product> pl=new ArrayList<Product>();
		pl.add(new Product(1,"SamsungMoibile",15000f));
		pl.add(new Product(2,"NokiaMoibile",10000f));
		pl.add(new Product(3,"BlackBerryMoibile",13000f));
		pl.add(new Product(4,"Iphone",50000f));
		pl.add(new Product(5,"VivoMoibile",35000f));
		pl.add(new Product(6,"OppoMoibile",18000f));
		
		List<Float> ppl=new ArrayList<Float>();
		for(Product product:pl)
		{
			if(product.price<30000)
			{
				ppl.add(product.price);
			}
		}
		
		System.out.println(ppl);
	}
}

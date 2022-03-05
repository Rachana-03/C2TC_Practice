package streamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Products
{
	int id;
	String name;
	float price;
	public Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExampleUpdated {
    public static void main(String[] args) {
		List<Products> pl=new ArrayList<Products>();
		pl.add(new Products(1,"SamsungMoibile",15000f));
		pl.add(new Products(2,"NokiaMoibile",10000f));
		pl.add(new Products(3,"BlackBerryMoibile",13000f));
		pl.add(new Products(4,"Iphone",50000f));
		pl.add(new Products(5,"VivoMoibile",35000f));
		pl.add(new Products(6,"OppoMoibile",18000f));
		
		List<Float> ppl=pl.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(ppl);
	}
}

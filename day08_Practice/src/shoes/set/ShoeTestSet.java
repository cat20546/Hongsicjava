package shoes.set;

import java.util.HashSet;
import java.util.Set;

import shoes.list.Shoe;


public class ShoeTestSet {

	public static void main(String[] args) {
		
		Set<Shoe> shoes = new HashSet<Shoe>();
		
		Shoe vans;
		vans = new Shoe("SH001","올드스쿨",260,39000,"운동화",30);
		
		Shoe nike;
		nike = new Shoe("SH002","에어맥스",255,49800,"운동화",50);
		
		Shoe hawkins;
		hawkins = new Shoe("SH003","페니로퍼",270,94000,"로퍼",20);
		
		Shoe adidas;
		adidas = new Shoe("SH004","밀라노",245,73000,"샌들",40);
		
	
	
		shoes.add(vans);
		shoes.add(nike);
		shoes.add(hawkins);
		shoes.add(adidas);
		

		System.out.println("=== foreach 로 출력 ===");
		for (Shoe Shoe : shoes) {
			System.out.println(Shoe);
		}
	
	}
	
	
	}


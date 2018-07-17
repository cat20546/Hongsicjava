package shoes.list;

import java.util.ArrayList;

public class ShoeTestList {

	public static void main(String[] args) {
	
		ArrayList<Shoe> shoes;
		shoes = new ArrayList<Shoe>();
	
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
		for (Shoe shoe : shoes) {
			System.out.println(shoe);
		}

		System.out.println("=================4번===============");
		
		for(int idx = 0; idx < shoes.size(); idx++){
			Shoe findShoe = new Shoe("SH003");
			if(shoes.get(idx).equals(findShoe)){
				System.out.println(shoes.get(idx)); 
			} 
			
		}
	
	}

}

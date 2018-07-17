package shoes.map;

import java.util.HashMap;
import java.util.Set;

import shoes.list.Shoe;

public class ShoeTestMap {

	public static void main(String[] args) {

	
		HashMap<String,Shoe> shoes = new HashMap<>();
		
		
		
		Shoe vans;
		vans = new Shoe("SH001", "올드스쿨", 260, 39000, "운동화", 30);

		Shoe nike;
		nike = new Shoe("SH002", "에어맥스", 255, 49800, "운동화", 50);

		Shoe hawkins;
		hawkins = new Shoe("SH003", "페니로퍼", 270, 94000, "로퍼", 20);

		Shoe adidas;
		adidas = new Shoe("SH004", "밀라노", 245, 73000, "샌들", 40);

		shoes.put("SH001", vans);
		shoes.put("SH002", nike);
		shoes.put("SH003", hawkins);
		shoes.put("SH004", adidas);

		Set keySet = shoes.keySet();
		for (Object key : keySet) {
			System.out.printf("%s%n", shoes.get(key).toString());
		}
		System.out.println("=================4번================");
		/* Shoe shoe = new Shoe("SH003"); */

		Shoe want2Find = new Shoe("SH003");
		Set<String> keys = shoes.keySet();
		for (String key : keys) {
			Shoe found = shoes.get(key);
			if(shoes.get(key).equals(want2Find)){
				System.out.println(shoes.get(key));
			}
		}
		
		
	/*	for(int idx = 0; idx < shoes.size(); idx++){
			if(shoes.get(idx).equals(keys)){
				System.out.println(shoes.get(idx));
			}
		}
		
		*/
	}
}

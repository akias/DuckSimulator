//次版本的问题是 如果一旦hit，连续输入hit的数三次，便可以成功kill
public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;
	
	String checkYourself(String Stringguess){
		int guess = Integer.parseInt(Stringguess);
		String result = "miss";
		for(int cell : locationCells){
			if(guess == cell){
				result = "hit";
				numOfHits ++;
				break;
			}
		}
			if (numOfHits == locationCells.length){
				result = "kill";
			}
			System.out.println(result);
			
	return result;
	}
	
	void setLocationCells(int[] loc){
		
		locationCells = loc;
	}

}

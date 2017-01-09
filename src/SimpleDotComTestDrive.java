import java.util.ArrayList;

public class SimpleDotComTestDrive {
	public static void main (String[] args){
		int numOfGuesses = 0;//记录玩家猜测次数
		GameHelper helper = new GameHelper();//取得玩家的输入
		
		DotCom dot = new DotCom();
		int randomNum = (int)(Math.random() * 10);//随机生成第一格的位置
		
		ArrayList<String> locations = new ArrayList<String>();
		String a = String.valueOf(randomNum);
		locations.add(a);
		String b = String.valueOf(randomNum+1);
		locations.add(b);
		String c = String.valueOf(randomNum+2);
		locations.add(c);
		dot.setLocationCells(locations);//把产生的数组传入dot的setLocation方法
		boolean isAlive = true;
		
		while(isAlive == true){
			String guess = helper.getUserInput("enter a number that you gusee");
			//System.out.println(guess);
			String result = dot.checkYourself(guess);
			//System.out.println(result);
			numOfGuesses++;
			
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took "+numOfGuesses+" guesses");
			}
		}
	}
}

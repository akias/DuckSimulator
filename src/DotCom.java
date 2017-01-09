import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	
	public void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
		//for(String i : locationCells){
		//	System.out.println(i);
		//}
	}
	//调用这个方法之后，在主类里面判断最后接受到的是否为“kill”，如果不是，则循环调用
	public String checkYourself(String userInput){
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		//判断userInput中是否存在于locationCells中，若不存在返回－1；
		if(index >=0){
			locationCells.remove(index);
			//如果这个数存在于locationCells中，则去掉locationCells中的这个数
			if(locationCells.isEmpty()){
				result = "kill";
				System.out.println(result);
			}else {
				result = "hit";
				System.out.println(result);
			}
		}else{
			System.out.println(result);
		}
		return result;
	}
}

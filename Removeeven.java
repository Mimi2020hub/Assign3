import java.util.ArrayList;


public class Removeeven {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hello");
		list1.add("world");
		list1.add("!!");
		removeEvenLength(list1);
		System.out.println(list1);
		
	}

	public static ArrayList<String> removeEvenLength(ArrayList<String> list) {
	    if (list.size()==0){
	        return list;
	    }
	    else {
	        for(int i=list.size()-1; i>=0;i--) {
	            if(list.get(i).length() % 2 == 0){
	                list.remove(i);
	            }
	        }
	        return list;
	    }
		
	}
}

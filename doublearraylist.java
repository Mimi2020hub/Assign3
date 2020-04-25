import java.util.ArrayList;


public class doublearraylist {
	
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String> ();
		list1.add("hello");
		list1.add("world");
		
		doubleList(list1);
		System.out.println(list1);
	}
	
	public static ArrayList<String> doubleList(ArrayList<String> list) {
		if (list.size()==0) {
			return list;
		}
	    for (int i = 0; i <list.size();i+=2) {
	        list.add(i,list.get(i));
	    }
	  
		return list;
	}
}

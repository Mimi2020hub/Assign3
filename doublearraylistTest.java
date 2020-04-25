import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class doublearraylistTest {

	@Test
	public void test() {
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("they");
		list1.add("are");
		list1.add("going");
		list1.add("home");
		
		ArrayList<String> list2= new ArrayList<String>();
		
		list2=doublearraylist.doubleList(list1);
		
		ArrayList<String> list3= new ArrayList<String>();
		list3.add("they");
		list3.add("they");
		list3.add("are");
		list3.add("are");
		list3.add("going");
		list3.add("going");
		list3.add("home");
		list3.add("home");
		
		assertEquals(list3,list2);
	}

}

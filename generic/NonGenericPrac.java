package Collection.generic;

import java.util.ArrayList;

public class NonGenericPrac {

	public static void main(String[] args) {
		ArrayList arrayList =new ArrayList();
		arrayList.add(10);
		arrayList.add("shivam");
		arrayList.add(10);
		int c = 0 ;
		for(Object a : arrayList)
		{
			try
			{
				Integer b = (Integer)a;
				c = c + b;
				
			}
			catch (Exception e)
			{
				
			}
		}System.out.println(c);
		

	}

}

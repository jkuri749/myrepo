package linkedarraylist;

public class ArrayListApp{
	/*
	 * After you complete your tasks this class should run without any errors!
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<String>list=new MyArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A1");
		list.add("B1");
		//System.out.println(list.remove(0));
		list.print();
		System.out.println(list.getIndex("B1"));
		//System.out.println(list.remove(2));
		list.print();
	}

	
}

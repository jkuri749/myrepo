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

	public static void myarray(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<Integer>intList=new MyArrayList<>();
		intList.add(1);
		intList.add(2);
		

		//System.out.println(list.remove(0));
		intList.print();
		System.out.println(intList.getIndex(1));
		//System.out.println(list.remove(2));
		intList.print();
	}
}

package linkedarraylist;


public class MyArrayList<T> implements myList<T>{

	private ArrayNode<T> first;
	private ArrayNode<T> last;
	int size;
	
	public MyArrayList() {
		first=null;
		last=null;
		size = 0;
	}
	@Override
	public void add(T item) {
		ArrayNode<T> newNode = new ArrayNode<T>(item);
		ArrayNode<T> curr;
		int index = newNode.getIndex();
		
		 if(first == null) {
	            first = newNode;
	            last = newNode;
	            ++size;
	            newNode.setIndex(index);
		 } 
	     if(first != null){
	            curr = first;

	            while(curr.getNextitem() != null){
	               curr = curr.getNextitem();
	            }
	            curr.setNextitem(newNode);
	            newNode.setIndex(index);
	        }
	     else {
	    	 last.setNextitem(newNode);
	    	 last=newNode;
	    	 newNode.setIndex(index);
	    	 ++size;
	     }
		
	}

	@Override
	public int getIndex(T item) {
		ArrayNode<T> curr=new ArrayNode<T>(item);
		int dist=curr.getIndex();

		while(curr!=null){
					dist+=curr.getIndex();
					curr=curr.getNextitem();				
					return dist;
			}
			curr=curr.getNextitem();	
		return dist;
	}

	@Override
	public void print() {
		ArrayNode<T> curr=first;
		while(curr!=null) {
			System.out.println(curr.getItem());
			curr=curr.getNextitem();
		}
		
	}
	//Add necessary codes here.
	//You can add any necessary constructors or helping methods you want.
}

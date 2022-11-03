package linkedarraylist;
/*
 * Do not make any changes in this class
 */
public class ArrayNode<T> {
	private int index;
	private T item;
	private ArrayNode<T> nextitem;

	public ArrayNode(T item){
		index=0;
		this.item=item;
		setNextitem(null);
	}

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}

	public ArrayNode<T> getNextitem() {
		return nextitem;
	}

	public void setNextitem(ArrayNode<T> nextitem) {
		this.nextitem = nextitem;
	}
}

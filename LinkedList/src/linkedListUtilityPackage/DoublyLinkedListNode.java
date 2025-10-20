package linkedListUtilityPackage;

public class DoublyLinkedListNode<T> {
	public T value;
	public DoublyLinkedListNode<T> prev;
	public DoublyLinkedListNode<T> next;
	
	public DoublyLinkedListNode(T value) {
		this.value = value;
	}
	
	public DoublyLinkedListNode(T value, DoublyLinkedListNode<T> prev, DoublyLinkedListNode<T> next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}

	@Override
	public String toString() {
		if (prev != null && prev.next != this) {
			return "Wrong prev";
		}
		
		if (next != null && next.prev != this) {
			return "Wrong next";
		}
		
		return value + " <=> " + next;
	}
	
	

}

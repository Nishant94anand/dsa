package linkedListUtilityPackage;

public class SinglyLinkedListNode<T> {
	public T value;
	public SinglyLinkedListNode<T> next;
	
	public SinglyLinkedListNode(T value) {
		super();
		this.value = value;
	}
	
	public SinglyLinkedListNode(T value, SinglyLinkedListNode<T> next) {
		this.value = value;
		this.next = next;		
	}

	@Override
	public String toString() {
		return value + " -> " +next;
	}
}

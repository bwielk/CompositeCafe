package cafe;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	
	private Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator){
		stack.push(iterator);
	}

	public Object next() {
		if(hasNext()){
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent comp = (MenuComponent) iterator.next();
			if(comp instanceof Menu){
				stack.push(comp.createIterator());
			}
			return comp;
		}else{
				return null;
			}
	}
	
	public boolean hasNext() {
		if(stack.empty()){
			return false;
		}else{
			Iterator iterator = (Iterator) stack.peek();
			if(iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
	}
	
	public void remove(){
		throw new UnsupportedOperationException();
	}
}
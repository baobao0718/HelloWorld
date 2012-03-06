package iteratorPattern;

import java.util.Vector;

public class BookShelf implements Aggregate {
	public Vector<Book> books;
	
	public BookShelf(int maxsize){
		this.books=new Vector<Book>(maxsize);
	}
	
	public Book getBookAt(int index){
		return this.books.elementAt(index);
		
	}
	public boolean appendBook(String name){
		this.books.add(new Book(name));
		return true;
	}
	public int getLength(){
		return this.books.size(); 
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		
		return new BookShelfIterator(this);
	}

}

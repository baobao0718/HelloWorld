package iteratorPattern;

public class BookShelfIterator implements Iterator {
	private BookShelf bookshelf;
	private int index;
	public BookShelfIterator(BookShelf bs){
		this.bookshelf=bs;
		this.index=0;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index<bookshelf.getLength())
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return bookshelf.getBookAt(index++);
	}

}

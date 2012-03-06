package iteratorPattern;
import java.util.Iterator;
public class Main {
	public static void main(String[] args){
		BookShelf bookShelf=new BookShelf(4);
		bookShelf.appendBook("BBC");
		bookShelf.appendBook("NBA");
		bookShelf.appendBook("WBA");
		
		Iterator<Book> it=bookShelf.books.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
//		Iterator iterator=bookShelf.iterator();
//		while(iterator.hasNext()){
//			Book book=(Book)iterator.next();
//			System.out.println(""+book.getName());
//		}
	}
}

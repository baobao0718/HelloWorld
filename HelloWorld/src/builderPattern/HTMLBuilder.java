package builderPattern;

import java.io.*;

public class HTMLBuilder extends Builder {
	private String filename;
	private Writer writer;
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		filename=title+".html";
		try {
			writer=new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((PrintWriter)writer).println("<html><head><title>"+title+"</title></head><body>");
		((PrintWriter)writer).println("<h1>"+title+"</h1>");
	}
	@Override
	public void makeString(String string) {
		// TODO Auto-generated method stub
		((PrintWriter)writer).println("<p>"+string+"</p>");
	}
	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		((PrintWriter)writer).println("<u1>");
		for(int i=0; i<items.length; i++)
			((PrintWriter)writer).println("<li>"+items[i]+"</li>");
		((PrintWriter)writer).println("</u1>");
	}
	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		((PrintWriter)writer).println("</body></html>");
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filename;
	}
	

}

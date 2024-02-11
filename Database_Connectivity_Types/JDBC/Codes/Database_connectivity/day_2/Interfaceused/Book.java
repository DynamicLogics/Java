package Interfaceused;

public class Book
{
	
	private String bookName;
	private String bookAuthor;
	private int  price;
	private int  pageCount;
	private static int bookid;
	
	
	
	public Book() 
	{
		super();
	}
	
	
	public Book(String bookName, String bookAuthor, int price, int pageCount)
	{
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
		this.pageCount = pageCount;
	}

	
	

	public static void setBookPK_1(int bookid)
	{
		bookid++;
	}


	public String getBookName()
	{
		return bookName;
	}
	
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}
	
	public String getBookAuthor() 
	{
		return bookAuthor;
	}
	
	public void setBookAuthor(String bookAuthor)
	{
		this.bookAuthor = bookAuthor;
	}
	
	public int getPrice() 
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getPageCount() 
	{
		return pageCount;
	}
	
	public void setPageCount(int pageCount)
	{
		this.pageCount = pageCount;
	}
	
	

}

package Servlet.project;

public class Book {
	private int bookid;
	private String bookname;
	private String author;
	private double price;
	private String pub;
	private String category;
	
	public Book(int bookid, String bookname, String author, double price, String pub, String category) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.pub = pub;
		this.category = category;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}

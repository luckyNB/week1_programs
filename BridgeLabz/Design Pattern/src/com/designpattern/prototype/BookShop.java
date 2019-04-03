package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
private String shopName;
List<Book> books=new ArrayList<>();
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
@Override
public String toString() {
	return "BookShop [shopName=" + shopName + ", books=" + books + "]";
}

public void loadData() {
	 for (int i = 0; i < 5; i++) {
		Book book=new Book();
		book.setBookId(i);
		book.setBookName("book"+i)	;
	getBooks().add(book);
	 }
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


}

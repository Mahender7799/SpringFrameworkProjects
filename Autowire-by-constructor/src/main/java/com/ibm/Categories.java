package com.ibm;

public class Categories {
	private String name;// inject name by setter method
	private Book bk;// inject book by constructor autowiring

	public Categories(/* String name, */ Book bk) {
		// this.name = name;
		this.bk = bk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}

	public void show() {
		System.out.println("Category Name : " + name);
		System.out.println("Book Name : " + bk.getBookName() + " and Book Price : " + bk.getBookPrice());
	}

	@Override
	public String toString() {
		return "Categories [name=" + name + ", bk=" + bk + "]";
	}

}
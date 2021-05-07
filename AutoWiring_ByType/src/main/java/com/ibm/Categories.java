package com.ibm;

import java.awt.image.SampleModel;

public class Categories {
	private String name;
	private Book bk;
	private Sample sk;

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

	public Sample getSk() {
		return sk;
	}

	public void setSk(Sample sk) {
		this.sk = sk;
	}

	public void show() {
		System.out.println("Category Name : " + name);
		System.out.println("Book Name : " + bk.getBookName() + " and Book Price : " + bk.getBookPrice());
		System.out.println("Sample Name : " + sk.getSampleName() + " and Sample Price : " + sk.getSamplePrice());
	}

	@Override
	public String toString() {
		return "Categories [name=" + name + ", bk=" + bk + ", sk=" + sk + "]";
	}

}
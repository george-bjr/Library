package com.example.models;

public class Libro {

	private Long id;
	private String name;
	private Long year;
	private String author;
	private Long inStock;
	
	public Libro() {}
	
	public Libro(Long id, String name, Long year, String author) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}

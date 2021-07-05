package com.shrenik.example;

public class Author implements Comparable<Author>{
	
	public String authorName;
	public int totalBooks;
	
	
	public Author()
	{
		this.authorName = "#UnknownAuthorName";
		this.totalBooks = 0;
	}
	
	public Author(String authorName, int totalBooks) {
		super();
		this.authorName = authorName;
		this.totalBooks = totalBooks;
	}

	@Override
	public String toString() {
		return String.format("%20s %10d", this.authorName, this.totalBooks);
	}

	@Override
	public int compareTo(Author another) {
		if(this.authorName.compareTo(another.authorName) > 0)
			return 1;
		else if(this.authorName.compareTo(another.authorName) < 0)
			return -1;
		else
			return 0;
	}
	

	
}

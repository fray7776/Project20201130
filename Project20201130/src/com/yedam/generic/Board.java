package com.yedam.generic;

public class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title=title;
		this.content=content;
	//생성자에 지정을 해서?? set메소드 지정안함			
	}
	public String getTitle() { return title; }
	public String getContent() { return content; }


}

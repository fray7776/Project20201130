package com.yedam.generic;

public class UtilExample {
	public static void main(String[] args) {
		Box<String> box = Util.boxing("Orange");
		box.get();
		
	    Box<Integer> boxint = Util.boxing(100);
	    boxint.get();
	    
	    Pair<String, Integer> p1 = new Pair<String, Integer>();
	    Pair<String, Integer> p2 = new Pair<String, Integer>();
	    p1.setKind("Hong");
	    p1.setModel(100);
	    Util.compare(p1, p2);
	    p2.setKind("Home");
	    p2.setModel(1);
	    if(Util.compare(p1, p2)) {
	    	System.out.println("논리적으로 동일한 객체입니다.");
	    
	    }else {
	    	System.out.println("논리적으로 다른 객체입니다.");
	    }
	}

}

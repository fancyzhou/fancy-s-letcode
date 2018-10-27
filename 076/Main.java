package ≤‚ ‘”√;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main m=new Main();
		System.out.println(m.minWindow("ADOBECODEBANC", "ABC"));
		//System.out.println("ABC".substring(1, 1));
	}
	public String minWindow(String s, String t) {
		String returnStr="";
	    String[] tToArr=t.split("");
	    Map<String,Integer> tMap=new HashMap<>();
	    for(String str:tToArr) {
	    	 if(tMap.containsKey(str)) {
	    		 tMap.put(str, tMap.get(str)+1);
	    	 }else {
	    		 tMap.put(str, 1);
	    	 }
	     }
	    int nowleft=0,nowright=0,count=0;
	    int min=Integer.MAX_VALUE;
	    int minleft=0,minright=0;
	    for(;nowright<s.length();nowright++) {
	    	String nowat=s.substring(nowright, nowright+1);
	    	if(tMap.containsKey(nowat)) {
	    		int d=tMap.get(nowat);
	    		if(d>0) {
	    			count++;
	    			
	    		}
	    		tMap.put(nowat, d-1);
	    	}
	    	
	    	while(count==t.length()) {
	    		if(nowright-nowleft < min) {
	    			min=nowright-nowleft;
	    			minleft=nowleft;
	    			minright=nowright;
	    		}
	    		String leftstr=s.substring(nowleft,nowleft+1);
	    		if(tMap.containsKey(leftstr)) {
	    			int d=tMap.get(leftstr);
	    			if(d>=0) {
	    				count--;
	    			}
	    			tMap.put(leftstr, d+1);
	    		}
	    		nowleft++;
	    	}
	    }
	    
	    
	    if(min ==Integer.MAX_VALUE) {
	    	returnStr="";
	    }else {
	    	returnStr=s.substring(minleft,minright+1);
	    }
	    return returnStr;
		
	}

}


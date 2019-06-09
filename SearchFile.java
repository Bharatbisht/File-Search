package Searchfile;

import java.io.*;
public class SearchFile {
	private File file;
    public void file(String path) {
	      file = new File(path);
	        if(file.exists()) {
	        	//list the content present in this dir..
                if(file.isDirectory()) { 
	        	  String a[]=file.list();
	        	  
                    for(String name:a) {
                    	
                    	String path1=path+"/"+name;
                    	
                    	file=new File(path1);
                    	  if(file.isDirectory()) {
                    		System.out.println(path1);
                    		file(path1);
                           }
                    	      if(name.endsWith(".java")) {
	                            System.out.println(name);		
                    	      }         
                    }
                }
           } 
     }
}


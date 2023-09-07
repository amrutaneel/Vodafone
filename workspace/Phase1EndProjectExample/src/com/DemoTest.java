package com;

import java.io.File;
import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) throws Exception{
		File ff = new File("D:\\FileFolder");
//		//File ff = new File("C:\\Users\\akash\\Desktop\\FileFolder\\a.txt");
//		//System.out.println(ff.getPath());
//		//System.out.println(ff.isDirectory());
//		//System.out.println(ff.isFile());
////		String allFiles[] = ff.list();
////		Arrays.sort(allFiles);
////		for(String name:allFiles) {
////			System.out.println(name);
////		}
//		String pathFile = ff.getPath()+"c.txt";
//		FileOutputStream fos = new FileOutputStream(pathFile);
//		fos.write('A');
//		fos.close();
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the file name");
		String fileName = sc.next();
		
		String newPath = ff.getPath()+"\\"+fileName;
		
//		FileOutputStream fos = new FileOutputStream(newPath);
//				fos.write('A');
//				System.out.println("file created..");
		// create new file 
//		ff = new File(newPath);
//		if(ff.exists()) {
//			System.out.println("file alredy present");
//		}else {
//			ff.createNewFile();
//			System.out.println("new file created with name as "+fileName);
//		}
		
//		// delete file 
//		ff = new File(newPath);
//		if(ff.exists()) {
//				ff.delete();
//				System.out.println("file deleted successfully");
//		}else {
//			
//			System.out.println("file not present with name as "+fileName);
//		}
		
		// search file 
				ff = new File(newPath);
				if(ff.exists()) {
						System.out.println("file present");
				}else {
						System.out.println("file not present");
				}
	}

}

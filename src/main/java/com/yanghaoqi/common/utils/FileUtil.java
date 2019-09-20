package com.yanghaoqi.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @ClassName: FileUtil 
 * @Description: TODO
 * @author:yhq 
 * @date: 2019年9月20日 上午8:30:17
 */
public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName) throws IOException{
		//TODO 实现代码
		
		File file = new File("aaa.jpg");
		
		FileInputStream stream = new FileInputStream(file);
		
		FileOutputStream stream2 = new FileOutputStream(file);
		
		Byte[] b = new Byte[1024];
		
		while(b!=null) {
			
		}
		
		return fileName;
	
	}
}

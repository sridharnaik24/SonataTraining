package com.sonata.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new FileReader("D:\\sample.txt"))){
			System.out.println(br.readLine());
		
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

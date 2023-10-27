package com.cours.sp1;
import java.lang.Class;
import java.lang.reflect.*;
import java.util.Iterator;

public class ReflecMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an object for snake;
		try {
		Snake s1 = new Snake();
		
		//create an object of class
		// using getClass()
		Class obj = s1.getClass();
		
		//get name of the class
		String name = obj.getName();
		System.out.println("Name : "+name);
		
		//get the access mofifier of the class
		int modifier = obj.getModifiers();
		
		//convert the acces to string
		String mod = Modifier.toString(modifier);
		System.out.println("Midifier :"+mod);
		
		//get the superclass 
		
		Class superClass = obj.getSuperclass();
		System.out.println("Supperclass :"+superClass.getName());
		
		//get methods
		Method method = obj.getDeclaredMethod("display", null);
		System.out.println(method);
		
		// get modifier of method
		int mod1 = method.getModifiers();
		System.out.println("Modifier of method : "+Modifier.toString(mod1));
		
		//get type of method
		System.out.println("Return Type : "+method.getReturnType());
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

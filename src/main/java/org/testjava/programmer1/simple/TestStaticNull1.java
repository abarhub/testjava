package org.testjava.programmer1.simple;

/**
 * Created by Alain on 08/04/2017.
 */
public class TestStaticNull1 {

	public static String val1;

	public static void main(String args[]){
		TestStaticNull1 tmp=null;
		tmp.val1="Coucou";
		System.out.println("Fin du test");
	}
}

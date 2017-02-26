package org.testjava.functionnal;

/**
 * Created by Alain on 26/02/2017.
 */
public class TestFunctionnal2 {

	public void test(){

		fun(x -> System.out.println("Test"));

		//fun(x -> int i=val1());
	}

	private void fun(MonInterface1 fun){

	}

	@FunctionalInterface
	public interface MonInterface1{

		public static int val=8;

		public void fun(int val);

		default public int val1(){
			return 5;
		}

		default public int val2(){
			return 7;
		}

		default public int calcul(int i,int j){
			return i+j;
		}
	}
}

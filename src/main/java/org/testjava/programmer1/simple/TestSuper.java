package org.testjava.programmer1.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alain on 13/05/2017.
 */
public class TestSuper extends TestSuperParent {

	public static final Logger LOG = LoggerFactory.getLogger(TestSuper.class);

	protected int no=12;

	@Override
	protected int getNo() {
		return 15;
	}

	public int getVal1(){
		return super.no;
	}

	public int getVal2(){
		return super.getNo();
	}

	public static void main(String args[]) {
		test1();
		//test2();
	}

	private static void test1() {
		TestSuper tmp=new TestSuper();

		LOG.info("no="+tmp.no);
		LOG.info("super.no="+tmp.getVal1());
		LOG.info("getNo()="+tmp.getNo());
		LOG.info("super.getNo()="+tmp.getVal2());

	}

}


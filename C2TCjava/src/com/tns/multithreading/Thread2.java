package com.tns.multithreading;

public class Thread2 extends Thread {

	 Table t;
		Thread2(Table t)
		{
			this.t=t;
	    }
    public void run()
    {
	 t.printTable(10);

	}

}

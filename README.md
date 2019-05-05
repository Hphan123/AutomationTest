Answer of question 1, 2, 3 is output by running class Program in in each respective package.

3) The order of outputs in 2 and 1 different because
     + The output 1: Refer to executing an entire proceses from beginning to end
     + The output 2: Refer to allowing multuple threads within a proceses such that they excute concurrently, independently but share their resources.

	In the output2, there is no guarantee that a thread runs immediately after it starts and we don't know which thread is running at which moment in time. So, if i make sure that thread1 is terminated before thread2 is executed (using join() method ), i can make sure that the question 2 will
	produce the order just like question 1.

	Before:
		thread1.start();
		thread2.start();
		
	After:
		thread1.start();
		thread1.join();
		thread2.start();

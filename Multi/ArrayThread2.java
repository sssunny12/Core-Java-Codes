class ArrayReading implements Runnable {

   String arr[];

    public ArrayReading() {
       // this.arr = arr;
	arr = new String[5];
arr[0] = "Ram";
arr[1] = "405 A";
arr[2] = "Civil Lines";
arr[3] = "Allahabad";
arr[4] = "UP";

    }

    @Override
    public void run() {
            for (int i=0; i<arr.length;i++) 
		{
                    System.out.println(arr[i]);
                                  }
            }
        }
  


class ArrayThread2
{
    public static void main(String[] args) throws InterruptedException {
      
//	int[] arr = { 5, 4, 3, 1, 2 };
        
	ArrayReading arrayReading = new ArrayReading();

        Thread t = new Thread(arrayReading);

        Thread t1 = new Thread(arrayReading);

        t.start();
        t1.start();

     //   t.join();
     //   t1.join();
    }
}

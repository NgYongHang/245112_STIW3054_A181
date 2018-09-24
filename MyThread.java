class MyThread extends Thread {
    
    public void run() {
        System.out.println("is running...");
    }
     public void run(Thread t) {
        System.out.println(t.getName()+" is running...");
    }
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("");
        
        System.out.println("id of t1:" + t1.getId());
        System.out.println("id of t2:" + t2.getId());
        System.out.println("");
        
        System.out.println("Before changing name of t1:" + t1.getName());
        t1.setName("Thread 1");
        System.out.println("After changing name of t1:" + t1.getName());
         t1.run(t1); 
         
        System.out.println("");
        System.out.println("Before changing name of t2:" + t2.getName());
        t2.setName("Thread 2");
        System.out.println("After changing name of t2:" + t2.getName()); 
        t2.start();    
    }
}
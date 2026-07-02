package college_work.programming_pratical;

class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();   // Start child thread

        System.out.println("This is Main Thread");
    }
    public void run() {
        System.out.println("This is Child Thread");
    }

}

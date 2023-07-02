package com.company;
class Thread1 extends Thread
{
    @Override
  public void run()
  {
      int i=0;
      while (i<40000)
      {
          System.out.println("this is chatting thread ");
          System.out.println("i am happy for chat with my best friend");
          i++;
      }
  }
}
class Thread2 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while (i<40000)
        {
            System.out.println("this is cooking thread ");
            System.out.println("i am sad because for cooking");
            i++;
        }
    }
}

public class cwh_69_thread {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();

    }
}

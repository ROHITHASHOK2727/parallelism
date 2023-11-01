package Rohith;


public class ThirdThread extends Thread {



private String threadName;



ThirdThread(String name)



{



threadName=name;



//System.out.println(name + " "+ threadName);



}



@Override



public void run()  {



// TODO Auto-generated method stub



int a=0;

   int b=0;

   int temp=1;

   do {   

       a=b;

       b=temp;

       temp=a+b;

       System.out.println("Third Thread : "+ temp);

       try {



        Thread.sleep(1000);



        } catch (InterruptedException e) {



        // TODO Auto-generated catch block



        e.printStackTrace();



        }

   }while(temp<10);

     



   }



};


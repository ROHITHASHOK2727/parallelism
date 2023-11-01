package Rohith;
public class FirstThread extends Thread {

private String threadName;

int i=0;

FirstThread(String name)

{

threadName=name;

//System.out.println(name + " "+ threadName);

}

@Override

public void run()  {

// TODO Auto-generated method stub

while(i<=20){

System.out.println("First Thread : " + i);

try {

Thread.sleep(1000);

} catch (InterruptedException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

i++;

};

}



}
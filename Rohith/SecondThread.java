package Rohith;



public class SecondThread extends Thread {

private String threadName;

SecondThread(String name)

{

threadName=name;

//System.out.println(name + " "+ threadName);

}

@Override

public void run()  {

// TODO Auto-generated method stub

for (char ch ='A'; ch<='Z'; ch++) {

System.out.println("Second Thread : " + ch);

try {

Thread.sleep(1000);

} catch (InterruptedException e) {

// TODO Auto-generated catch block

e.printStackTrace();

}

};

}



}


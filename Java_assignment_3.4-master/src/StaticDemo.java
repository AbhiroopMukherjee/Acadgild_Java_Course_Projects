public class StaticDemo{
   public static void main(String args[]){
     Student s1 = new Student();
     s1.showData();
     Student s2 = new Student();
     s2.showData();
     //Student.b++;  //Once uncommented, the static variable can be accesses by the classname itself.
     //s1.showData();
  }
}

class Student {
int a; //initialized to zero
static int b; //initialized to zero only when class is loaded not for each object created.

  Student(){
   //Constructor incrementing static variable b
   b++;
  }

   public void showData(){
      System.out.println("Value of a = "+a);
      System.out.println("Value of b = "+b);
   }
//public static void increment(){ //Uncomment and run to see that instance variables cannot be operated inside static methods.
//a++;
//}

}
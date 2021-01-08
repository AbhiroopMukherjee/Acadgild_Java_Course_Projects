//Importing packages to use list

import java.util.ArrayList;
import java.util.List;

// Defining interface
interface Stack {
    
    void push(int I);
    
    int pop();
}

// Defining Fixed stack which is implementing Stack interface
class FixedStack implements Stack {
    int i=0;
    int [] entries;
    
// Fixing the length of the stack from user input    
    FixedStack(int NoOfEntries){
        entries = new int[NoOfEntries];
    }
// Pushing entries into stack and incrementing position by 1    
    public void push(int I){
        
        entries[i]=I;
        i++;
        }
// returning elements from stack    
    public int pop(){
        i--;
        return entries[i];
    }
}

//Defining Fixed stack which is implementing Stack interface
class VariableStack implements Stack {
	
	int i=0;
	List<Integer> list = new ArrayList<Integer>();
	int entries;
    
    
    VariableStack(int NoOfEntries){
        entries = NoOfEntries;
    }
  
 // Pushing entries into stack and incrementing position by 1 
    public void push(int I){
    	
    	list.add(I);
        i++;
    	
    }
    
 // returning elements from stack 
    public int pop(){
    	i--;
    	int result = (int) list.get(i);
    	list.remove(i);
    	return result;
    	
    	
    }
    
    public void getList(){
    	System.out.println("-----------------------");
    	list.forEach(System.out::println);
    }
}

class ImplementStack{
    
    public static void main(String args[]){
 
// Implementing variable stack and checking functionality
    	VariableStack S1 = new VariableStack(5);
        
        S1.push(10);
        S1.push(20);
        S1.push(30);
        S1.push(40);
        S1.push(50);

        
        System.out.println(S1.pop());
        System.out.println(S1.pop());
        System.out.println(S1.pop());
        System.out.println(S1.pop());
        
        S1.push(60);
        S1.push(70);
        S1.push(80);
        S1.push(90);
        
        System.out.println(S1.pop());
        System.out.println(S1.pop());
        System.out.println(S1.pop());
        System.out.println(S1.pop());
        System.out.println(S1.pop());
        
        System.out.println("Now the fixed stack implementation -----------");
 
     // Implementing fixed stack and checking functionality
        FixedStack S2 = new FixedStack(5);
        
        S2.push(10);
        S2.push(20);
        S2.push(30);
        S2.push(40);
        S2.push(50);

        
        System.out.println(S2.pop());
        System.out.println(S2.pop());
        System.out.println(S2.pop());
        System.out.println(S2.pop());
        System.out.println(S2.pop());
        System.out.println(S2.pop());
        System.out.println(S2.pop());
                
    }
}
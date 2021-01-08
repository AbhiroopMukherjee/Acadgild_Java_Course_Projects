class Base
{
    String name;
 
    // constructor 1
    Base()
    {
        this(""); //constructor chaining within a class
        System.out.println("No-argument constructor of" + 
                                           " base class");
    }
 
    // constructor 2
    Base(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                                              + " of base");
    }
}
 
class Derived extends Base
{
    // constructor 3
    Derived()
    {
        System.out.println("No-argument constructor " + 
                           "of derived");
    }
 
    // parameterized constructor 4
    Derived(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " + 
                           "constructor of derived");
    }
 
    public static void main(String args[])
    {
        // calls parameterized constructor 4
        Derived obj = new Derived("test");
 
        // Calls No-argument constructor
        Derived obj1 = new Derived();
    }
}


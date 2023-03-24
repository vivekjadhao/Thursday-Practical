write a JAVA Program.Create a class Calculation add methods addition,substraction,multiplication,division in it.
          create objects and access those methods.*/
class Calculation 
{
    int add,sub,multi,div ;  //data members 
    int a = 20;               //data type ,variable declaration and Assignment
	int b = 10 ;
    void addition()           //metod addition for addition and return nothing
    {
        add = a+b;
        System.out.println("The Addition is:" + add );
    }

    void substraction()        //method substraction for addition and return nothing
    {
        sub = a-b;
        System.out.println("The Substraction is:" + sub);
    }

    void multiplication()   //method multiplication for addition and return nothing
    {
        muliti = a*b;
        System.out.println("The multiplication is :" + multi);
    }

    void division()  //method division for addition and return nothing
    {
        div = a/b;
        System.out.println("The Division is :" + div);
    }    
}

class NewCalculation   //creating another class with main method
{
    public static void main(String[] args) //main method for JVM to start its execution from here
	{
        
        Calculation c1 = new Calculation();  //create an object using Calculation class
 
        c1.addition();           //call method addition created in Calculation class
        c1.substraction();       //call method substraction created in Calculation class
        c1.multiplication();     //call method multiplication created in Calculation class
        c1.division();           //call method division created in Calculation class
    }
}
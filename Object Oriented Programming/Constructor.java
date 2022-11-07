public class Class{
  
  //Construcor has 3 types; default, parametized and no args(argument)
  //always remember that constructor is same name as class name
  
  public Class(){
   
    Syste.out.println("This is Constructor!");
    
  }
  
  
 public static void main(String [] args) {
   
  //Constructor is an object so we need to create an object to call it inside the main
   
   Class myObj = new Class(); // output: This is Constructor!
   
 }
  
}

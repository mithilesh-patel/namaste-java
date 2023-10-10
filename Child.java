public class Child extends Human{
  int x = 5;

  public static void main(String[] args) 
  {
	  Child c= new Child();
	  c.speak();
	  
	  int _x=23;
	  String _name= "Mithilesh"; // this is discouraged
	  
	  //float y= 45_f;
	  // Here the numbers can be separated without changing its value just for the readability
	  int z=12_34_56_789;
	  double a=97_48_84_458;
	  
	  int hexVal =0x23;		//Hexadecimal value
	  int octVal =023;      //Octal value
	  int binVal =0b1011;	//Binary value
	  
	  System.out.println(_x);
	  System.out.println(_name);
	  System.out.println(z+a);
	  
	  System.out.println(hexVal);
	  System.out.println(octVal);
	  System.out.println(binVal);
  }
}


package primitiveDT;
class demo {
void fun () {
System.out.println("I have no Parameters");
}
void fun (int a)
  {
System.out.println("I have 1 parameter a: "+a);
  }
void fun (String s)
  {
System.out.println("I have a string s: "+s);
}
void fun (int a, int b)
}
System.out.println("I have 2 parameters a & b: "+a+", "+b);
}
}

public class methodoverload {
public static void main(String[] args) {
// TODO Auto-generated method stub
demo obj = new demo ();
obj.fun();
obj.fun (5);
  obj.fun (10, 20);
obj.fun ("Hi There");

  //Best example of overloading is println() or print()
System.out.println(5);
System.out.println("abc");
System.out.println(5.06);
}
}

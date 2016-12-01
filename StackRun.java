package mypack;

class StackRun
{
   public static void main(String args[])
   {
       System.out.println("Fixed stack example");
       System.out.print("Enter the fixed stack depth(Below 10):");
       int f=Integer.parseInt(System.console().readLine());
       FixedStack fs= new FixedStack(f);
       for(int i=1;i<=10;i++)
        fs.push(i);
       for(int i=1;i<=10;i++)
        System.out.println(fs.pop());




       System.out.println("Variable stack example");
       System.out.print("Enter the variable stack depth(Below 10):");
       int v=Integer.parseInt(System.console().readLine());
       VariableStack vs= new VariableStack(v);
       for(int i=1;i<=10;i++)
         vs.push(i);
       for(int i=1;i<=10;i++)
          System.out.println(vs.pop());
       
   }
}
class Swap{
     void exchange(int a,int b){
         System.out.println("Before Swap a = "+a+" and b = "+b);
         int temp=a;
         a=b;
         b=temp;
         System.out.println("After Swap a = "+a+" and b = "+b);
     }

     void exchange(double a,double b){
        System.out.println("Before Swap a = "+a+" and b = "+b);
        double temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap a = "+a+" and b = "+b);
    }
}
class a5_Q3 {
   public static void main(String []args){
       int n1 = Integer.parseInt(args[0]);
       int n2 = Integer.parseInt(args[1]);
    
       double d1 = Double.parseDouble(args[2]);
       double d2 = Double.parseDouble(args[3]);

       Swap obj = new Swap();
       obj.exchange(n1,n2);
       obj.exchange(d1,d2);
      
   } 
}
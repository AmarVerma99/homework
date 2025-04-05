public class fraction {


    public  static Fraction add(Fraction f1, Fraction f2){

        int numerator=f1.num*f2.den +f2.num *f1.den;
        int denominator=f1.den*f2.den;
        Fraction f3=new Fraction(numerator, denominator);
        return f3;



    }
    
    public  static Fraction multiply(Fraction f1, Fraction f2){

        int numerator=f1.num*f2.num;
        int denominator=f1.den*f2.den;
        Fraction f3=new Fraction(numerator, denominator);
        return f3;



    }

    public static int gcd(int num , int den){
        int min =Math.min(num, den);
        for(int i=min; i>=1; i--){
            if(num%i==0 && den %i==0)  return i;

        }
        return min;

    }




    public static class Fraction {
        int num;
        int den;


        // constructor

        public Fraction(int num, int den){
            this. num= num;
            this.den= den;
            simplify();

        }
        //simpy function
        public void simplify(){
            int hcf=gcd(num ,den);
            num=num/hcf;
            den=den/hcf;


           
        }
    
        
    }

    public static void main(String[] args) {

        // but when we pass the value 14 and 21 then we have to find the hcf of both num and den
        
       Fraction f1= new Fraction(35, 21);
       Fraction f2= new Fraction(7, 3);

       System.out.println(f1.num+"/"+f1.den);
    //    f1.simplify();
       System.out.println(f2.num+"/"+f2.den);
    //   Fraction f3=add(f1,f2);  
    //   System.out.println(f3.num+"/"+f3.den);

      Fraction f3=multiply(f1, f2);
      System.out.println(f3.num+"/"+f3.den);

      



       


        
    }
}
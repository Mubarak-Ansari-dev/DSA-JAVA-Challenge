
public class StringTesting{

    public static void main(String[] args){
        String s1 = "Sane";
        String s2 = "Sane";

        String s3 = new String("Sane");
        String s4 = new String("Sane");
        // == operator compares references

        if(s1 == s2){
            System.out.println("s1 and s2 are equal");
        }
         else{
            System.out.println("s1 and s2 are not equal");
        }
    }
}
    //output:
    // s1 and s2 are equal but

        if(s3 == s4){
            System.out.println("s3 and s4 are equal");
        }
         else{
            System.out.println("s3 and s4 are not equal");
        }
    //output:
    // s3 and s4 are not equal
    // because memory allocate same for s1 and s2 (two reference but same memory location(same address))
    // but we use new keyword for s3 and s4 so different memory location - s3 & s4 k liye different memory location allocate hota hai-> new keyword use karne pe 

    // but for equals method
        if(s3.equals(s4)){
            System.out.println("s3 and s4 are equal");
        }
         else{
            System.out.println("s3 and s4 are not equal");
        }
    //output:
    // s3 and s4 are equal  
    // equals method compares values
    // so, always use equals method to compare strings

    // if(S1.equals(S4))--> True> Character by character comparison hota hai
    // Java String class is immutable->

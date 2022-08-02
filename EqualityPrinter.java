public class IntEqualityPrinter {
    public static void printEqual(int num1,int num2, int num3){
        if(num1&lt;0 || num2&lt;0 || num3&lt;0){
            System.out.println("Invalid Value");
        }else{
            if(num1==num2 &amp;&amp; num2==num3){
                System.out.println("All numbers are equal");
            }else if(num1!=num2 &amp;&amp; num2!=num3 &amp;&amp; num1!=num3){
                System.out.println("All numbers are different");
            }else{
                System.out.println("Neither all are equal or different");
            }
        }
    }
}

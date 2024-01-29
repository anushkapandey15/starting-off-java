public class Main {
    public static void main(String[] args) {
        System.out.println("Okay, entry");
        
        Calculator addTwoNumbers= new Calculator();
        int res=addTwoNumbers.add(5, 10);
        System.out.printf("Addition : %d",res);
      
    }

   
}

 class Calculator {
    public static int add(int num1,int num2){
        return (num1 + num2);
    }

    public static int subtract(int num1,int num2){
        return ( num1-num2);
    }

    public static int multiply(int num1,int num2){
        return (num1*num2);
    }

    public static int divide(int num1,int num2){
        return num1/num2;
    }
}
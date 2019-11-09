public class Basic15 {

    public static  void  main(String[] args){
        double a =4;
        double b =5;
        double c =6;
        double p =(a+b+c)/2;
        double S =Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Area triangle: " + S);
    }
}

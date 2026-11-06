public class Threenumsum {
    public static void main(String[] args){
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.println("enter the three numbers:");
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            int sum=a+b+c;
            System.out.println("The sum of three numbers is:"+sum);
            sc.close();
        }
    }
}

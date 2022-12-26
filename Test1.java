import java.util.Scanner;

public class Test1

{
    int count=0;
    int sum=0;
    int add=0;
    int g=0;
    int l = 0;
    int c=0;
    int d=0;
    //long int sum=0;
    public int countNum(int n){
        int count=0;
        while(n !=0) {
            n = n / 10;
            count = count + 1;
             }
return count;
    }

    public void input() {
        int a[] = new int[200];
        int m;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {


            //System.out.println(i+"  "+countNum(i));
            int j = countNum(i);
            //System.out.println(j);
            if ((j % 2) == 1) {
                //System.out.println("odd");
                c++;

            }
            if ((j % 2) == 0) {
                //System.out.println("even");
                d++;

            }



        }
        System.out.println("1 number ka sum:"+c);
        System.out.println("1 number wali snkya ka guna :"+c*2);
        System.out.println("2 number ka sum:"+d);
        System.out.println("2 number wali snkya ka guna:"+d*3);
        int k=((countNum(c*2)+countNum(d*4)));
        System.out.println("1 and 2 "+k);
        int l=((countNum(c*2)+countNum(d*4))*2);
        System.out.println("Ans  "+l);



    }
    public static void main(String[] args) {
        Test1 t= new Test1();
        t.input();

    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Q1:
        System.out.println("please enter ur 1st number:");
        int num = input.nextInt();

        System.out.println("please enter ur 2nd number:");
        int numb = input.nextInt();

        int sum = num + numb;
        int sub = num - numb;
        int mul = num * numb;
        int div = num / numb;
        int rem = sum % 2;


        System.out.println("sum=" + sum);
        System.out.println("subtract=" + sub);
        System.out.println("multiple=" + mul);
        System.out.println("divide=" + div);
        System.out.println("reminder=" + rem);


        //Q2:
        System.out.println("please enter a number:");
        int n = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }


        //Q3:
        System.out.println("enter a number(redius)");
        double r = input.nextDouble();
        double area = 3.15 * r * r;
        double ci = 2 * 3.15 * r;

        System.out.println("area=" + area);
        System.out.println("ci" + ci);


        //Q4:
        System.out.println("how many numbers?");
        int m = input.nextInt();
        double summ = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("enter number:");
            double mm = input.nextDouble();
            summ += mm;
        }
        double av = summ / m;
        System.out.println("averge=" + av);


        //Q5:
        System.out.println("enter a 1st number:");
        int n1 = input.nextInt();
        System.out.println("enter a 2nd number:");
        int n2 = input.nextInt();
        System.out.println("please enter a 3rd number:");
        int n3 = input.nextInt();
        boolean result = true;

        if (n1 + n2 == n3) {
            System.out.println("the result:" + result);

        } else {
            System.out.println("not equal");
        }

        //Q6:
        System.out.println("enter a word:");
        String word = input.nextLine();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        System.out.println("the reverse word: " + reverse);

        //Q7:

        System.out.println("please enter a number:");
        int nn = input.nextInt();
        boolean eve = true;

        if (nn % 2 == 0) {
            System.out.println("the number is od");
        } else {
            System.out.println("the number id ev");
        }


        //Q8:
        System.out.println("enter celsius:");
        double c = input.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("fahrnhiet=" + f);


        //Q9:

        input.nextLine();
        System.out.println("enter a string:");
        String x = input.nextLine();

        System.out.println("enter a number:");
        int y = input.nextInt();
        String rev = "";

        for (int i = x.length() - 1; i > 0; i--) {
            rev += x.charAt(i);

        }
        System.out.println("output:" + rev);


        //Q10:

        System.out.println("please enter a height:");
        double nnn = input.nextDouble();

        System.out.println("please enter a width:");
        double nnn1 = input.nextDouble();

        double area1 = nnn * nnn1;
        double p = 2 * (nnn + nnn1);

        System.out.println("area:" + area1);
        System.out.println("perimetr:" + p);


        //Q12:

        System.out.println("enter a sec:");
        int total = input.nextInt();
        int h = total / 3600;
        int mi = (total % 3600) / 60;
        int s = total % 60;
        System.out.println(h + ":" + mi + ":" + s);


        //Q13:
        System.out.println("please enter 4 numbers:");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int fourth = input.nextInt();

        if (first == second && second == third && third == fourth) {
            System.out.println("the numbers are equels");
        } else {
            System.out.println("the numbers are not equals");
        }


        //Q14:

        System.out.println("enter a number:");
        int hh = input.nextInt();

        if (hh > 0) {
            System.out.println("positve");
        } else if (hh < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }


        //Q15:
        int pos = 0;
        int neg = 0;
        int zero = 0;

        System.out.println("enter numbers *-1 to stop*");

        while (true) {
            int nuum = input.nextInt();
            if (nuum == -1)
                break;
            if (nuum > 0)
                pos++;
            else if (nuum < 0)
                neg++;
            else
                zero++;
        }

        System.out.println("positve:" + pos);
        System.out.println("negative:" + neg);
        System.out.println("zeros:" + zero);


        //Q16:
        System.out.println("enter a number:");
        int ii = input.nextInt();
        int revee = 0;

        while (ii != 0) {
            int digit = ii % 10;
            revee = revee * 10 + digit;
            ii = ii / 10;
        }

        System.out.println("reverse:" + revee);

        //Q17:
        int numberr;
        int largest;
        int smallest;
        char choice;

        System.out.println("please enter a number:");
        numberr= input.nextInt();
        largest= numberr;
        smallest= numberr;
        do {
            System.out.println("do u want to continue y or n? ");
            choice= input.next().charAt(0);
            if (choice== 'y') {
                System.out.println("enter the number:");
                numberr= input.nextInt();
                if (numberr>largest) {
                    largest= numberr;
                }
                if (numberr<smallest) {
                    smallest=numberr;
                }
            }

        }while (choice== 'y');
        System.out.println("the largest number: "+largest);
        System.out.println("the smallest number: "+smallest);
        //System.out.println("how many numbers?");
       // int b = input.nextInt();

       // for (int i = 1; i <= n; i++) {
           // System.out.println("enter number:");
           // int bb = input.nextInt();
          //  if (bb =)
       // }

        //System.out.println("");


        //Q18:
        //String str="java bootcamp";
        //int ll=0;
        //for (int i = str.length();) {
        // ll+= str.charAt(i);

        //}
        //System.out.println("output:" + ll);

        System.out.println("enter a word:");
        String bb = input.nextLine();

        System.out.println("enter a letter:");
        char cc=input.next().charAt(0);

        int count = 0;
        for (int i = 0; i < bb.length(); i++){
            if(bb.charAt(i) == cc){
        count++;
    }
}    System.out.println("number of letters:"+count);












            //  System.out.println("enter a 1st number:");
            // int nu1=input.nextInt();
            // System.out.println("enter a 2nd number:");
            // int nu2=input.nextInt();

            //  if (nu1 <nu2){
            //     System.out.print(nu1+"<"+nu2);
            // }else if(nu2<nu1){
            //    System.out.println(nu2+">"+nu1);
            //  }else if(nu1==nu2) {
            //    System.out.println(nu1 + "=" + nu2);
            //   }else{
            //  System.out.println(nu1+"!="+nu2);
            // }

            // System.out.println("enter a 1st number:");
            // int q1=input.nextInt();
            //System.out.println("enter a 2nd number:");
            // int q2=input.nextInt();


            //System.out.println("please enter a number:");
            //int nu=input.nextInt();
            //for(int i=0; i>=)


            //Q6:
            //System.out.println("enter a word:");
            //String w=input.nextLine();
            //String rev="";

            //for(int i=w.length()-1; i>=0; i--){
            // rev=rev+w.charAt(i);
            // }
            //System.out.println("reverse word:"+rev);


        }
                }



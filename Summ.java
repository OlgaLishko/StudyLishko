

public class Summ {
    public static void main(String[] args) {
       int s=0, m=1;
        for(int i=0; i<args.length; i++)
        {
           int abc = Integer.parseInt(args[i]);
            s=s + abc;
            m=m * abc;
        }
        System.out.println("summ = " + s);
        System.out.println("multiplication = "+ m);
        }
    }

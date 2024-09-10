import java.util.Enumeration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        forLoop(1);
        whileLoop(1);
        doWhileLoop(1);
        }
        public static void forLoop(int fornum) {
            for (int i = 0; i <= fornum; i++)
                System.out.println(i);
        }
        public static void whileLoop(int whilenum) {
        int i=0;
        while (i<=whilenum) {
            System.out.println(i);
            i++;
        }
    }
         public static void doWhileLoop(int dowhilenum) {
        int i=0;
        do {
            System.out.println(i);
            i ++;
        }
        while ( i<=dowhilenum);
        }
         }




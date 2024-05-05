package KBA;

import java.util.StringJoiner;

public class Main {
   /* public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("135");
        sb.replace(0, 5, "6789").insert(0, "12345");
        System.out.println(sb.reverse().delete(0, 5));
    }
    */
   public static void main(String[] args) {
       StringJoiner sj1 = new StringJoiner(":", "{", "}");
       StringJoiner sj2 = new StringJoiner(",", "[", "]");
       sj1.add("Name").add("Tony");
       sj2.add("LastName").add("Strak");
       System.out.println(sj1.merge(sj2).toString());
   }

  /* public static void main(String args[]) {
       String E = "extraction1";
       String T = "transformation2";
       String L = "loading3";

       A obj = new A();
       obj.ETL(E + T + L);
   }
   */
}

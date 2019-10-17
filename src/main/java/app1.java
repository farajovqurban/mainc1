import java.lang.*;


public class app1 {
    //psvm
    public static void main(String[] args) {
        //sout
        String str = "1050";

        int inum = Integer.parseInt(str);   //return primitive
        //long ilong = Long.parseLong(longStr);
        System.out.println(inum);

        Integer onum = Integer.valueOf(str); //return object
        //Long olong = Long.valueOf(longStr);
        System.out.println(onum);
        /*String to boolean
        A String value can be converted to primitive boolean value using Boolean.parseBoolean
        method. For conversion to Boolean object, you can use Boolean.valueOf() method.
         */


    }
}

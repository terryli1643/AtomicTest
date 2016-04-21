package hashtree;
import java.io.IOException;
import java.util.Enumeration;

public class HashTree {

    public static void main(String[] args) {
        
        String str1 = "11111111";
        String str2 = "22222222";
        String str3 = "33333333";
        String str4 = "44444444";
        String str5 = "55555555";
        String str6 = "66666666";
        String str7 = "77777777";
        String str8 = "88888888";
        String str9 = "99999999";
        String str0 = "00000000";
        
        Integer h1 = str1.hashCode();
        Integer h2 = str2.hashCode();
        Integer h3 = str3.hashCode();
        Integer h4 = str4.hashCode();
        Integer h5 = str5.hashCode();
        Integer h6 = str6.hashCode();
        Integer h7 = str7.hashCode();
        Integer h8 = str8.hashCode();
        Integer h9 = str9.hashCode();
        Integer h0 = str0.hashCode();
        
        
        System.out.println(Math.abs(h1));
        System.out.println(Math.abs(h2));
        System.out.println(Math.abs(h3));
        System.out.println(Math.abs(h4));
        System.out.println(Math.abs(h5));
        System.out.println(Math.abs(h6));
        System.out.println(Math.abs(h7));
        System.out.println(Math.abs(h8));
        System.out.println(Math.abs(h9));
        System.out.println(Math.abs(h0));
        
        
        System.out.println(Math.abs(h1.toString().hashCode()%10));
        System.out.println(Math.abs(h2.toString().hashCode()%10));
        System.out.println(Math.abs(h3.toString().hashCode()%10));
        System.out.println(Math.abs(h4.toString().hashCode()%10));
        System.out.println(Math.abs(h5.toString().hashCode()%10));
        System.out.println(Math.abs(h6.toString().hashCode()%10));
        System.out.println(Math.abs(h7.toString().hashCode()%10));
        System.out.println(Math.abs(h8.toString().hashCode()%10));
        System.out.println(Math.abs(h9.toString().hashCode()%10));
        System.out.println(Math.abs(h0.toString().hashCode()%10));
        
        System.out.println("====================================");
        System.out.println(new Integer(1).hashCode());
        System.out.println(new Long(2).hashCode());
        System.out.println(new Float(3).hashCode());
        System.out.println(new Double(4).hashCode());
        System.out.println(new Byte("5").hashCode());
        
        System.out.println("====================================");
        System.out.println(Integer.toBinaryString(50000));
        System.out.println(Integer.toBinaryString(0XFF));
        System.out.println(Integer.toBinaryString(50000 & 0XFF));
        System.out.println(Integer.toBinaryString(1<<16));
        try {
//            Process proc  = Runtime.getRuntime().exec("jps");
//            System.out.println(proc.exitValue());
            HashTree test = new HashTree();
            Enumeration en = test.getClass().getClassLoader().getResources("classpath");
            while (en.hasMoreElements()) {
                Object object = (Object) en.nextElement();
                System.out.println(object);
            }
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

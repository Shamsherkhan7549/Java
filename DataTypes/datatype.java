public class datatype {
    public static void main(String[] args) {
        
        byte b = Byte.MAX_VALUE;
        byte b2 = Byte.MIN_VALUE;
        System.out.println("byte " + b);
        System.out.println("byte " + b2);

        // byte c = 128;
        // System.out.println(c);

        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        System.out.println("integer "+ i);
        System.out.println("integer "+ i2);
        
        int l = Integer.MAX_VALUE;
        int l2 = Integer.MIN_VALUE;
        System.out.println("long "+ l);
        System.out.println("long "+ l2);

        float f = Float.MAX_VALUE; //4 bytes
        float f2 = Float.MIN_VALUE;  // Float is wrapper class
        System.out.println("float "+ f);
        System.out.println("float "+ f2);


        double d = Double.MAX_VALUE; //8 byte
        double d2 = Double.MIN_VALUE;
        System.out.println("double "+ d);
        System.out.println("double "+ d2);

        short s = Short.MAX_VALUE;
        short s2 = Short.MIN_VALUE;
        System.out.println("short "+ s);
        System.out.println("short "+ s2);

        // boolean bool = boolean.MAX_VALUE;
        // System.out.println(bool);
    }
}

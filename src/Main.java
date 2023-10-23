// Java program implementing Singleton class 
// with using getInstance() method 

import com.dev.dp.creational.singleton.SingletonC;
import com.dev.dp.creational.singleton.SingletonS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Class 1
// Helper class 
class Singleton {
    // Static variable reference of single_instance
    // of type Singleton
    private static Singleton single_instance = null;

    // Declaring a variable of type String
    public String s;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // Static method
    // Static method to create instance of Singleton class
    public static synchronized Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

// Class 2 
// Main class 
class GFG {
    GFG() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
    }

    // Main driver method
    public static void main(String args[])throws Exception
    {
        System.out.println("Exeplul 1: \n");
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }


        System.out.println("\n");
        System.out.println("Singleton Violation on Using Reflection");
        com.dev.dp.creational.singleton.SingletonR s1 = com.dev.dp.creational.singleton.SingletonR.getInstance();
        com.dev.dp.creational.singleton.SingletonR s2 = com.dev.dp.creational.singleton.SingletonR.getInstance();
        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());

        Class clazz = Class.forName("com.dev.dp.creational.singleton.SingletonR");
        Constructor<com.dev.dp.creational.singleton.SingletonR> ctr= clazz.getDeclaredConstructor();
        ctr.setAccessible(true);
        com.dev.dp.creational.singleton.SingletonR s3 = ctr.newInstance();
        System.out.println("Hashcode of Object s3: " +s3.hashCode());


        System.out.println("\n");
        System.out.println("Singleton Violation on Object Cloning");
        SingletonC e1 = SingletonC.getInstance();
        SingletonC e2 = SingletonC.getInstance();
        System.out.println("Hashcode of Object s1: " +e1.hashCode());
        System.out.println("Hashcode of Object s2: " +e2.hashCode());

        SingletonC e3 = (SingletonC)e2.clone();
        System.out.println("Hashcode of Object s3: " +e3.hashCode());



        System.out.println("\n");
        System.out.println("Singleton Violation on Serialization/Deserialization");
        SingletonS r1 = SingletonS.getInstance();
        SingletonS r2 = SingletonS.getInstance();
        System.out.println("Hashcode of Object s1: " +r1.hashCode());
        System.out.println("Hashcode of Object s2: " +r2.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/tmp/r2.ser"));
        oos.writeObject(r2);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/tmp/r2.ser"));
        SingletonS r3= (SingletonS)ois.readObject();

        System.out.println("Hashcode of Object s3: " +r3.hashCode());

    }


}

package learn;

public class GarbageCollectorTest {

    public static void main(String[] args) throws InterruptedException{

        GarbageCollectorTest t1 = new GarbageCollectorTest();
        GarbageCollectorTest t2 = new GarbageCollectorTest();

        t1 = null;

        System.out.println("1");

        System.gc();

        t2 = null;

        System.out.println("2");
        Runtime.getRuntime().gc();

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called!");
        System.out.println("Object garbage collected : " + this);
    }
}

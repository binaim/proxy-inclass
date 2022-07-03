public class ProxyDemo {
    public static void main(String[] args) {
        /*
        Hello: A
        before
        Hello: A
        after


         */

        // 3a
        Thing t = new AThing("A");

        //3b
        t.compute("Hello");

        //3c
        t = new LoggingProxy(t);

        //3d
        t.compute("Hello");

        //3e
        Thing t1 = new BThing("B");
        t1.compute("Hello");

        t1 = new LoggingProxy(t1);
        t1.compute("Hello");


    }
}

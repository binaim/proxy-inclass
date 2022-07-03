public class LoggingProxy implements Thing{
    private Thing thing;

    public LoggingProxy(Thing thing) {
        this.thing = thing;
    }

    @Override
    public void compute(String string) {
        preAction();
        thing.compute(string);
        postAction();

    }

    public void preAction() {
        log("Before");
    }

    public void postAction() {
        log("After");
    }

    private void log(String string) {
        System.out.println(string);
    }

}

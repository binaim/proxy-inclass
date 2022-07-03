public class AThing implements Thing{
    private String name;

    public AThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String string) {
        System.out.println(string + name);
    }
}

public class BThing implements Thing{
    private String name;

    public BThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String string) {
        System.out.println(string + name);
    }
}

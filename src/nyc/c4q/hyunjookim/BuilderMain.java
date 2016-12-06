package nyc.c4q.hyunjookim;

public class BuilderMain {

    public static void main(String[] args) {
        ClassToBeBuilt c = new ClassToBeBuilt("a", "c", 3, 4, 5.0, int.class);
//        ClassToBeBuilt.Builder builder = new ClassToBeBuilt.Builder();
//        builder.setmA("a");
//        ClassToBeBuilt result = builder.build();



        // made the fields final
        ClassToBeBuilt result = new ClassToBeBuilt.Builder()
                .setmA("a")
                .setmB("bomp")
                .setmE(7.0)
                .build();
        System.out.println(result);

    }
}

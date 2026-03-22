import java.util.Optional;

public class functionalOperation {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");
        Optional<String> nullOpt = Optional.ofNullable(null);
        //if present()
        name.ifPresent((value)-> System.out.println(value));
        nullOpt.ifPresent((value)-> System.out.println(value)); //not print anything if not present

        // map()
        Optional<String> uppercase = name.map((value) -> value.toUpperCase());
        System.out.println(uppercase.orElse("default"));

        //filter()
        Optional<String> temp = name.filter(n -> n.startsWith("J"));
        temp.ifPresent(System.out::println);

        name.filter(n -> n.startsWith("J"))
                    .ifPresent(System.out::println);

        //combined operations;
        name.filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}

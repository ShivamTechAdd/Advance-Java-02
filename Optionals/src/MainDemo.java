import java.util.Optional;

public class MainDemo {
    public static void main(String[] args) {
        //older ways
        String name=null;
        if(name !=null)
            System.out.println(name.length());
        else
            System.out.println("No name valid.");

        System.out.println();

        //Optionals : Are use dto handle the null ptr exception values;
        //Optionals: Container object hai

        //Creating optionals;
        Optional<String> opt = Optional.of("Java");
        System.out.println(opt);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println(mayBe);

        //checking values;
        System.out.println(opt.isPresent());
        System.out.println(mayBe.isPresent());

        System.out.println(opt.isEmpty());
        System.out.println(mayBe.isEmpty());

        // get()
        System.out.println(opt.get());
//        System.out.println(mayBe.get()); //error

        System.out.println();

        //orElse()
        System.out.println(opt.orElse("Default"));
        System.out.println(mayBe.orElse("Default"));

        System.out.println();

        //orElseGet();
        String result = mayBe.orElseGet(()->{
            System.out.println("generating defoult Value");
            return "Defoult";
        });
        System.out.println(result);

        String result1 = opt.orElseGet(()->{
            System.out.println("generating defoult Value");
            return "Defoult";
        });
        System.out.println(result1);

        //orElseThrow()
        String newRes=mayBe.orElseThrow(()-> new RuntimeException("Not Found"));
        System.out.println(newRes);




    }
}

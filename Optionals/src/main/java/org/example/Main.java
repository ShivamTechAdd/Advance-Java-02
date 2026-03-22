package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        String name = null;
        Optional<String> op = Optional.of("Adarsh");
        System.out.println(op);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println(mayBe);

        //Checking values.
        System.out.println(mayBe.isPresent());
        System.out.println(op.isEmpty());

        System.out.println(op.get());

        //orElse("defoult_value");
        System.out.println(op.orElse("defoult"));

        //orElseGet(supplier)

        String result = mayBe.orElseGet(()-> {System.out.println("Genrating Defoult Name");
        return "Defoult";
        });

        //orElseThrow;
        String newResult = mayBe.orElseThrow(
                ()->new RuntimeException("Not found")
        );
        System.out.println(newResult);

        //functional Operations
        Optional name1 = Optional.of("Java");
        //1. ifPresent();

        name1.ifPresent((value)-> System.out.println(value));

        //2. map() :-used to transform one thing to another thing.

//       Optional<String> a = name1.map((value)-> value.toUpperCase());

        //filter()
//        name1.filter( n -> n.startsWith("j"));
       







    }
}
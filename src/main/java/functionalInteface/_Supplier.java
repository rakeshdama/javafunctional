package functionalInteface;

import java.util.function.Supplier;

public class _Supplier {

    static Supplier<String> getDBConnectionUrlS = () ->
            "jdbc://localhost:5432/users";

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlS.get());
    }
}

package ge.tbc.testautomation.exceptionsStringOpsAndRegex_L7;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Throwable throwable = new Throwable(); // throws
        Exception  exception = new Exception();
        RuntimeException runtimeException = new RuntimeException();

        throw new CustomException("SOMETHEING CUSTOM HAPPENED");
//        int x = 10;
//        if (x == 10){
//            throw new RuntimeException("ERROR HAPPENED");
//        }
//
//        try {
//            callerFunction();
//            someSQL();
//        }
//        catch (IOException | SQLException e){
//            e.printStackTrace();
//        }
//        finally {
////            db.close();
//        }


    }

    private static void callerFunction() throws IOException {
        someMethodThatDoesSomething();
    }

    private static void someMethodThatDoesSomething() throws IOException {
        throw new IOException("FILE CANNOT BE OPENED");

//        throw new ArithmeticException("LEARN MATH");
    }

    private static void someSQL() throws SQLException {
        throw new SQLException("BAD SQL HAPPENED");

//        throw new ArithmeticException("LEARN MATH");
    }
}

package db;

import MC01.model.AcademicArea;

public class enumTest {

    public static void main(String[] args) {

        System.out.println(AcademicArea.valueOf("MATH"));
        System.out.println(AcademicArea.MATH.ordinal());
        System.out.println(AcademicArea.MATH.toString());

        System.out.println(AcademicArea.fromString("MATH").ordinal());
    }
}

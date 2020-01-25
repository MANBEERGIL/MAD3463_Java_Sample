package com.lambton;

import java.util.Date;

public class studentsclass {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setData(1,"manbeer","kaur",new Date(),Gender.FEMALE,97);
        s1.printdata();

    }
}

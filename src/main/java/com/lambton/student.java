package com.lambton;

import java.util.Date;
enum Gender{
    MALE,
    FEMALE,
    OTHERS
}
public class student {
    int studentid;
    String firstname;
    String lastname;
    Date birthdate;
    Gender gender;
    float totalMarks;
    public void setData(int studentid,
            String firstname,
            String lastname,
            Date birthdate,
            Gender gender,
            float totalMarks)
    {
       this.studentid=studentid;
       this.firstname=firstname;
       this.lastname=lastname;
       this.birthdate=birthdate;
       this.gender=gender;
       this.totalMarks=totalMarks;

    }
    public void printdata(){
        System.out.println("studentid:"+studentid);
        System.out.println(" first name:"+firstname);
        System.out.println("last name:"+lastname);
        System.out.println("Birth date:"+birthdate);
        System.out.println("gender:"+gender);
        System.out.println("Total Marks:"+totalMarks);
    }
}

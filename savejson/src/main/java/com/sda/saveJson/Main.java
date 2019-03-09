package com.sda.saveJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.json.Address;
import com.sda.json.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        List<Student> students = new ArrayList<>();
        students.add(new Student("janek","fasola",new Address("torun","plaska 2")));
        students.add(new Student("zosia","golab",new Address("bydgoszcz","gorna 23")));
        students.add(new Student("milosz","maly",new Address("warszawa","koscielna 45")));
        students.add(new Student("zenon","martyniuk",new Address("lublin","cegla 23/22")));

        File studenntListfile = new File("student_test_nowy.json");

        try
        {
            mapper.writeValue(studenntListfile,students);
            System.out.println("Zapisano");


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

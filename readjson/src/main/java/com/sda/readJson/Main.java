package com.sda.readJson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.json.Student;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        ObjectMapper mapper = new ObjectMapper();

        try {

            Student[] studentArray =  mapper.readValue(new File("student_test_nowy.json"),Student[].class);// odczytanie z pliku json
            // jedna uwaga trzeba dodaj w klasie Person pusty konstruktor
            List<Student> personL = Arrays.asList(studentArray);
            System.out.println(personL.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }





    }

}

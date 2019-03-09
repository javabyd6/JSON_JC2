package com.sda.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main
{
    public static void main(String[] args)
    {

        Person p1 = new Person("jan","kowalski",22);
        Person p2 = new Person("tomasz","nowak", 31);
        Person p3 = new Person("janusz","plot", 44);
        Person p4 = new Person("grazyna","brama", 78);

        //teraz stworzenie jsona z tego jednego obiektu Person

        ObjectMapper mapper = new ObjectMapper(); // korzysta z getterow, powinny byc gettery w klasie

        try {
            String personStr = mapper.writeValueAsString(p1);
            System.out.println(personStr);
            // do pliku person json zapisac wynikowego stringa

            Files.write(Paths.get("person.json"),personStr.getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }

        /////////////////////////////////////

        List<Person> listaPersons = new ArrayList<>(); // oparta o tablice //linkenList oparta o obiekty

        listaPersons.add(p1);
        listaPersons.add(p2);
        listaPersons.add(p3);
        listaPersons.add(p4);

        try {


            String lista = mapper.writeValueAsString(listaPersons);
            Files.write(Paths.get("person2.json"),lista.getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }


        List<Student> students = new ArrayList<>();
        students.add(new Student("janek","fasola",new Address("torun","plaska 2")));
        students.add(new Student("zosia","golab",new Address("bydgoszcz","gorna 23")));
        students.add(new Student("milosz","maly",new Address("warszawa","koscielna 45")));
    }


}

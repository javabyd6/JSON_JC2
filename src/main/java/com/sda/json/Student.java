package com.sda.json;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student
{
    private String name;
    private String lastName;
    private Address adress;


}

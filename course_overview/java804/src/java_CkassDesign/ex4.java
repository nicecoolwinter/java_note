package java_CkassDesign;

import java.io.Serializable;
import java.util.Date;
class Hostelite implements Serializable
{
    int roomNo;
}

class Person
{
    String name;
    Date dob;
    transient String address;
}

public class ex4 extends Person implements Serializable
{
    String regNo;
    Hostelite host = new Hostelite();

}
/*
which of the field is preserved when an object of the student class is serialized?

A)only regNo
B)only regNo and roomNo
C)only regNo,roomNo , and dob
D)only regNo , roomNo , name , and dob
E)only regNo , roomNo , and name
F)Objects of type Student Cannot be serialized


*/
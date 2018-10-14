package java_CkassDesign;

import java.util.ArrayList;
import java.util.List;

interface Glommer {}
interface Plinkable {}
class Flimmer implements Plinkable
{
    List<Tagget> t = new ArrayList<Tagget>();
}
class Flommer extends Flimmer
{

}
class Tagget
{
    void doStuff()
    {
        String s = "yo";
    }
}

public class ex10
{

}
/*
Which three statements concerning the oo concepts "is-a" and "has-a" are true?

A)Flimmer is-a Plinkable
B)Flommer has-a Tagget
C)Flommer is-a Glommer
D)Tagget has-a String
E)Flommer is-a Plinkable
F)Flimmer is-a Flommer
G)Tagget is-a Plinkable






*/
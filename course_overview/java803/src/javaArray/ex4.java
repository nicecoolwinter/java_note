package javaArray;
class product
{
    String pname;
    product(String pname)
    {
        this.pname = pname;
    }
}

public class ex4
{

    public static void main(String[] args)
    {
        /*product p1=new product("belt");
        product p2=new product("shore");
        */
        //product[] prodlist={new product("belt"),new product("shoe")};


        product[] prodlist = new product[2];
        prodlist[0] = new product("belt");
        prodlist[1] = new product("shoe");
    }

}


/*
Which three code fragments, when inserted independently at line 7, successfully initialize prodlist

A)
product[] prodlist=new product[2];
product[0]=product("belt");
product[1]=product("shore");

B)
product[] prodlist={new product("belt"),new product("shoe")};

C)
product p1=new product("belt");
product p2=new product("shore");

D)
product[] prodlist={product("belt"),product("shore")};

E)
product[] prodlist=new product[2];
prodlist[0]=new product("belt");
prodlist[1]=new product("shoe");






*/
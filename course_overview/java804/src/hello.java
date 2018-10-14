import java.util.ResourceBundle;

public class hello
{

    public static void main(String[] args)
    {
        ResourceBundle res = ResourceBundle.getBundle("messages");
        System.out.println(res.getString("cc.openhome.welcome") + "!");
        System.out.println(res.getString("cc.openhome.name") + "!");

    }

}

package Java_NIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;

public class ex2
{

    public static void main(String[] args) throws IOException {
        Path file = Paths.get("my.text");
        AclFileAttributeView attr =
        Files.getFileAttributeView(file, AclFileAttributeView.class);
        System.out.print(attr.getOwner());
    }

}
/*
Which statement, inserted at line 14,enables the code compile?
A)
BasicFileAttributes attr=
    Files.readAttributes(file,BasicFileAttributes.class);

B)
DosFileAttributes attr=
    Files.readAttributes(file,DosFileAttributes.class)

C)Files attr=Files.getFilesStore(file)

D)AclFileAttributeView attr=
    Files.getFileAttributeView(file,AclFileAttributeView.class);



*/
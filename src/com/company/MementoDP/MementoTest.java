package com.company.MementoDP;

public class MementoTest {

    public static void main(String[] args) {

        File myfile = new File("myfile.txt");
        myfile.write("First write");
        System.out.println(myfile);

        FileCareTaker fc = new FileCareTaker();
        fc.save(myfile);

        myfile.write("\n second write");
        System.out.println(myfile);

        fc.undoToLastSaved(myfile);
        System.out.println("After doing undo....");
        System.out.println(myfile);
    }
}

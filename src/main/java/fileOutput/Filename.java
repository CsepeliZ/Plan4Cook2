package fileOutput;

public class Filename {

    /*TODO A fájlnév: "myMenu_" + dátum és idő
    *  Ezt ez a class generálja, amikor meghivják*/


    String currentTime = CurrentDateTime.currentDateTime();

    String fName = "myMenu_" + currentTime;

}

package ge.tbc.testautomation.annotationsAndStreams_L10;

import java.net.IDN;

public class LibraryClass {

    @Marked(id = 1121, title = "Complete Action")
    public void completeAction(){
        System.out.println("completing action");
    }

    @Marked(id = 1122, title = "Send Request")
    public void sendRequest(){
        System.out.println("sending request");
    }

    public void receiveRequest(){
        System.out.println("receiving request");
    }
}

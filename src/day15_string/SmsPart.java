package day15_string;

public class SmsPart {
      /* [SMS parts]
    Given a String in the following format:
            “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
    Separate these parts and print them separately: Sender: actualSender
    Number: actualNumber Message: actualMessage”
            */
    public static void main(String[] args) {
        String msg ="Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";
        int sendSart = msg.indexOf("<");
        int sendEnd =msg.lastIndexOf(">");
        String name = msg.substring(sendSart,sendEnd);

        System.out.println(name);

        int numStart =msg.indexOf("[")+1;
        int numEnd = msg.indexOf("]");








    }
}

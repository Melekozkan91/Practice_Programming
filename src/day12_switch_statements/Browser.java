package day12_switch_statements;

import java.util.Scanner;
/*
ask a user to enter browser
ask a user to enter URL(link- Uniform resource lacotor)

chrome
edge
safari
opera
firefox
mozilla




 */

public class Browser {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your browser: ");
        String browser = input.next();

        System.out.println("Enter a URL: ");
        String url = input.next();

        switch (browser){
            case "Chrome":
            case "chrome":
            case "CHROME":
                System.out.println("Going into the"+url+" in"+browser+" browser");
                break;
            case "edge":
            case "Edge":
            case "EDGE":
                System.out.println("Going into the"+url+" in"+browser+" browser");
                break;
            case "Safari":
                System.out.println("Going into the"+url+" in"+browser+" browser");
                break;
            case "Firefox":
                System.out.println("Going into the"+url+" in"+browser+" browser");
                break;
            default:
            System.out.println(browser+"is invalid browser ");
        }

    }
}

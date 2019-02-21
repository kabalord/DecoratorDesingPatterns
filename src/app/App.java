package app;


import decorators.BonjourDecorator;
import decorators.SignatureDecorator;

public class App {

    public static void main(String[] args){
        Email e;

        e = new Email();
        System.out.println("Send message :");
        System.out.println(e.send());
        System.out.println("");


        e = new SignatureDecorator(new Email());
        System.out.println("Message with sign :");
        System.out.println(e.send());
        System.out.println("");

        e = new BonjourDecorator(new Email());
        System.out.println("Bonjour :");
        System.out.println(e.send());
        System.out.println("");

        e = new BonjourDecorator(new SignatureDecorator(new Email()));
        System.out.println("Bonjour with sign :");
        System.out.println(e.send());
    }
}

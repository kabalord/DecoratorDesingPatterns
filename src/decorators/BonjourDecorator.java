package decorators;

import app.Email;

public class BonjourDecorator extends EmailDecorator{

    public BonjourDecorator(Email email){
        super(email);
    }

    public String send() {
        return "Bonjour Madame, Monsieur " + email.send();
    }
}

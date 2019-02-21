package decorators;

import app.Email;

public class SignatureDecorator extends EmailDecorator{
    public SignatureDecorator(Email email){
        super(email);
    }

    public  String send(){
        return email.send() + " signature ajoutée automatiquement";
    }
}

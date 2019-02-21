package decorators;

import app.Email;

public class EmailDecorator extends Email{

    public Email email;

    public EmailDecorator(Email email){
        super();
        this.email = email;
    }
}

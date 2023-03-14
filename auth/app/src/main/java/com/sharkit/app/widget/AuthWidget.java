package com.sharkit.app.widget;

import android.view.View;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sharkit.app.R;
import lombok.Getter;

import javax.inject.Inject;

@Getter
public class AuthWidget {

    @Inject
    public AuthWidget(final View view){
        this.emailLayout = view.findViewById(R.id.email_input_layout);
        this.passwordLayout = view.findViewById(R.id.password_input_layout);
        this.email = view.findViewById(R.id.email_edit_text);
        this.password = view.findViewById(R.id.password_edit_text);
        this.signIn = view.findViewById(R.id.sign_in_button);
        this.register = view.findViewById(R.id.register_button);
    }
    private final TextInputLayout emailLayout;
    private final TextInputLayout passwordLayout;
    private final TextInputEditText email;
    private final TextInputEditText password;
    private final Button signIn;
    private final Button register;
}

package com.explicit.mahabirdas.hometravel;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class NextSignUp extends AppCompatActivity {
    TextView txt_con,txt_name,txt_email,txt_pass,txt_birth,txt_gender;
    EditText edt_name,edt_email,edt_pass;
    RadioGroup _gen_redio;
    RadioButton male_redio,female_radio;
    Button sign_up_gen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_sign_up);

        txt_con=(TextView) findViewById(R.id.continue_txt);
        txt_name=(TextView) findViewById(R.id.text_full_name);
        txt_email=(TextView) findViewById(R.id.text_email);
        txt_pass=(TextView) findViewById(R.id.text_password);
        txt_birth=(TextView) findViewById(R.id.text_birth);
        txt_gender=(TextView) findViewById(R.id.text_gen);

        edt_name=(EditText) findViewById(R.id.edit_name);
        edt_email=(EditText) findViewById(R.id.edit_email);
        edt_pass=(EditText) findViewById(R.id.edit_password);

        Typeface type = Typeface.createFromAsset(this.getAssets(),"fonts/NunitoSans_ExtraLight.ttf");
        edt_name.setTypeface(type);

        Typeface type_email = Typeface.createFromAsset(this.getAssets(),"fonts/NunitoSans_ExtraLight.ttf");
        edt_email.setTypeface(type_email);

        Typeface type_pass = Typeface.createFromAsset(this.getAssets(),"fonts/NunitoSans_ExtraLight.ttf");
        edt_pass.setTypeface(type_pass);

        _gen_redio=(RadioGroup) findViewById(R.id.gen_redio);

        male_redio=(RadioButton)findViewById(R.id.btn_male);
        female_radio=(RadioButton) findViewById(R.id.btn_female);

        sign_up_gen=(Button) findViewById(R.id.signup_btn);

        sign_up_gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_sgnup=new Intent(NextSignUp.this,SuccessPayment.class);
                startActivity(next_sgnup);
            }
        });

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.btn_female:
                if (checked)
                    // Is Male
                    break;
            case R.id.btn_male:
                if (checked)
                    // Is Female
                    break;
        }
    }
}

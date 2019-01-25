package com.explicit.mahabirdas.hometravel;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SuccessPayment extends AppCompatActivity {
    ImageView succ_img;
    TextView pay_mass;
    Button pay_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_payment);

        succ_img=(ImageView) findViewById(R.id.suc_pic);
        pay_mass=(TextView) findViewById(R.id.suc_txt);
        pay_btn=(Button) findViewById(R.id.suc_btn);

        Typeface pay_type = Typeface.createFromAsset(this.getAssets(),"fonts/NunitoSans_ExtraLight.ttf");
        pay_mass.setTypeface(pay_type);

        pay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_tic=new Intent(SuccessPayment.this,SaveTicket.class);
                startActivity(next_tic);
            }
        });
    }
}

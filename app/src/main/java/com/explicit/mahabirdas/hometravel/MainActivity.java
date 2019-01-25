package com.explicit.mahabirdas.hometravel;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView _pic_text,_from,_dep,_ret,_travel,_class;
    EditText _new_edit,_new_to;
    Spinner list_dep,list_ret,list_travel,list_class;
    Button sub_btn;


    String[] travel={"1","2","3","4","5","6","7","8","9","10"};
    String[] quality={"First Class","Business Class","Economy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      _pic_text=(TextView) findViewById(R.id.text_pic);
      _from=(TextView) findViewById(R.id.text_from);
      _dep=(TextView) findViewById(R.id.dep_text);
      _ret=(TextView) findViewById(R.id.ret_text);
      _travel=(TextView) findViewById(R.id.travel_text);
      _class=(TextView) findViewById(R.id.text_class);

      _new_edit=(EditText) findViewById(R.id.edit_from);
      _new_to=(EditText) findViewById(R.id.edit_to);

        Typeface type = Typeface.createFromAsset(this.getAssets(),"fonts/NunitoSans_ExtraLight.ttf");
        _new_edit.setTypeface(type);

        Typeface type_to = Typeface.createFromAsset(this.getAssets(),"fonts/NunitoSans_ExtraLight.ttf");
        _new_to.setTypeface(type_to);

      list_dep=(Spinner)findViewById(R.id.dep_spin);
      list_ret=(Spinner) findViewById(R.id.ret_spin);
      list_travel=(Spinner) findViewById(R.id.trav_spin);
      list_class=(Spinner) findViewById(R.id.class_spin);

      sub_btn=(Button) findViewById(R.id.book_btn);

        ArrayAdapter trav_no=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,travel);
        list_travel.setAdapter(trav_no);

        ArrayAdapter trav_class=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,quality);
        list_class.setAdapter(trav_class);

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_sgnup=new Intent(MainActivity.this,NextSignUp.class);
                startActivity(next_sgnup);
                Toast.makeText(MainActivity.this,"SignUp Your Account",Toast.LENGTH_LONG).show();
            }
        });
    }
}

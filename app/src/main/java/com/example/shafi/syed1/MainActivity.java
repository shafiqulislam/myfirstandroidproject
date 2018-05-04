package com.example.shafi.syed1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText mEtname, mEtemail;
    Button   mbtnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initListener();
    }



    private void init() {
        mEtname    = findViewById(R.id.editText_Name);
        mEtemail   = findViewById(R.id.editText_Email);
        mbtnSubmit = findViewById(R.id.button_Submit);
    }
    private void initListener() {
        mbtnSubmit.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.button_Submit:
               // Toast.makeText(this, "Name: "+mEtname.getText()+ "  Email: "+ mEtemail.getText(), Toast.LENGTH_SHORT).show();

               Intent intent = new Intent(MainActivity.this,SecondActivity.class);

               intent.putExtra("Name",mEtname.getText().toString());
               startActivity(intent);

                break;
        }

    }
}

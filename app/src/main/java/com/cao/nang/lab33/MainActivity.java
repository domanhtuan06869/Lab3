package com.cao.nang.lab33;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText edtusername;
    private EditText edtpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtusername =  findViewById(R.id.edtusername);
        edtpass = findViewById(R.id.edtpass);


    }

    public void DN(View view) {

      check();
    }
    public void check(){
        String user=edtusername.getText().toString();
        String pass=edtpass.getText().toString();
        if (user.equals("")) {

            show("khong de trong user name");
        }else if(pass.equals("")){
            show("khong de trong pass");
        }
         else if(user.equals("admin")&&pass.equals("admin")){
            show("thanh cong");
            Intent in = new Intent(MainActivity.this, Listview.class);
            startActivity(in);
        }
        else {
            show("sai tk mk");

        }
    }
    public void show(String thongbao){
        Toast.makeText(MainActivity.this,thongbao,Toast.LENGTH_SHORT).show();
    }
}

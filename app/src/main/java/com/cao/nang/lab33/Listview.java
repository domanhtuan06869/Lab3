package com.cao.nang.lab33;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Listview extends AppCompatActivity {
    private ListView ListItem;

        List<String> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        ListItem = (ListView) findViewById(R.id.ListItem);
        list.add("dvgsdgadsafdasd");
        list.add("dvgsdgadsafdasd");
        list.add("dvgsdgadsafdasd");
        list.add("dvgsdgafdnhrtreyer");
        list.add("dvgsdgadsafdasd");
        list.add("dvgsdgadrgfsafdasd");
        list.add("dvgsdgrfggfdadsafdasd");
        ArrayAdapter adt=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        ListItem.setAdapter(adt);

    }
}

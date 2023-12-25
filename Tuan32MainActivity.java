package com.example.tuan11myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.tuan11myapplication.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {

    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main2);

        lv=findViewById(R.id.tuan32Listview);

        ls.add(new T32Contact("Nguyen Van a","18",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Tran Van B","19",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Vu Van C","16",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Thi D","22",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Dang Duc e","20",R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Duc G","17",R.drawable.ic_launcher_background));

        adapter=new T32Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}

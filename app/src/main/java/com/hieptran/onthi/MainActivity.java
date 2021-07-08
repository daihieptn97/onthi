package com.hieptran.onthi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewProduct;
    ArrayList ListData;
    Button btnPush;
    private DatabaseReference mDatabase;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mappingView();

        ListData = new ArrayList();
        ListData.add("Nguyễn Văn Xuân");
        ListData.add("Trần Hạ");
        ListData.add("Lê Thị Thu");
        ListData.add("Huỳnh Đông");


        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ListData);
        // Bước 3: Gắn ArrayAdapter vào ListView
        ListView lvDemo = (ListView) findViewById(R.id.listproduct);
        lvDemo.setAdapter(aa);


        btnPush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Psuh", "dasdasd");
                mDatabase.child("users").child("aaaa").setValue("asiougdfadoyguifahdsjkfghjdwsf");
            }
        });


    }

    private void mappingView() {
        btnPush = findViewById(R.id.btnPust);
        mDatabase = FirebaseDatabase.getInstance().getReference();
//        myRef = database.getReference("message");
    }
}
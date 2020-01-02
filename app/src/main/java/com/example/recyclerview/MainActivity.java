package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView ;
    Adapter adapter;
    List<Item> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<Item>();fdgsdgddgd


        itemList = new ArrayList<Item>();
        sjlkvjsdlkfjsdlkfj;
        hfghbdnkf;
        System.out.println("heyy");
        Item item1 = new Item("sudhanshu");
        Item item2 = new Item("sudhanshu");
        Item item3 = new Item("sudhanshu");
        Item item4 = new Item("sudhanshu");
        Item item5 = new Item("sudhanshu");
        Item item6 = new Item("sudhanshu");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        adapter = new Adapter(this,itemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}

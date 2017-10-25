package com.example.inventory;

import android.app.ListActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.inventory.pojo.Dependency;

//Cuando hereda de ListActivity el layout tiene que contener si o si el id "@android:id/list"

public class DependencyActivity extends ListActivity {

    private ArrayAdapter<Dependency> dependencies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency);
        dependencies = new ArrayAdapter<Dependency>(this, android.R.layout.simple_list_item_1,((InventoryApplication)getApplicationContext()).getDependencies());
        getListView().setAdapter(dependencies);
    }
}

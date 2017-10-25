package com.example.inventory;

import android.app.Application;

import com.example.inventory.pojo.Dependency;

import java.util.ArrayList;

/**
 * Created by usuario on 25/10/17.
 */

public class InventoryApplication extends Application {
    ArrayList<Dependency> dependencies;

    public InventoryApplication() {
        dependencies = new ArrayList();
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        dependencies = new ArrayList<Dependency>();
        addDependency(new Dependency(1, "1ª Ciclo formativo de grado superior","1CFGS", "1CFGS Desarrollo de aplicaciones multiplataforma" ));
        addDependency(new Dependency(2, "2ª Ciclo formativo de grado superior","2CFGS", "2CFGS Desarrollo de aplicaciones multiplataforma" ));


    }

    public void addDependency (Dependency dependency)
    {
        dependencies.add(dependency);
    }

    public ArrayList<Dependency> getDependencies()
    {
        return dependencies;
    }
}


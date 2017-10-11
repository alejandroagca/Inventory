package com.example.inventory;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.widget.ImageView;


import java.util.ArrayList;
import java.util.Vector;

public class DashBoardActivity extends AppCompatActivity {

    private GridLayout gridDashBoard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        gridDashBoard = (GridLayout) findViewById(R.id.gridDashBoard);
        //Definir un array de int qu contendra el id de las imagenes

        int [] images = {R.drawable.closet, R.drawable.chair, R.drawable.cpu, R.drawable.inventory,
                R.drawable.keyboard, R.drawable.monitor, R.drawable.mouse, R.drawable.printer,
                R.drawable.proyector, R.drawable.table, R.drawable.whiteboard};

        //No se utiliza en java array de objetos. Se utiliza vector o coleccion.
        //ImageView [] imageViews = new ImageView[images.length];

        //No trabajamos con vector porque no tenemos hilos y no hace falta sincronizacion
        //Vector<ImageView> vectorImageViews = new Vector<ImageView>();

        ImageView image;
        float width = (int) getResources().getDimension(R.dimen.imgDashBoardWidth);
        float heigth = (int)getResources().getDimension(R.dimen.imgDashBoardHeight);
        //arrayImageViews.add(new ImageView(this));
        //arrayImageViews.get(i).setImageResource(images[i]);
        //arrayImageViews.get(i).setLayoutParams(params);
        //ArrayList<ImageView> arrayImageViews = new ArrayList<ImageView>();
        for (int i =0; i < images.length; i++)
        {
            image = new ImageView(this);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.width = (int)width;
            params.height = (int)heigth;
            params.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            image.setImageResource(images[i]);
            image.setLayoutParams(params);
            gridDashBoard.addView(image);
        }

        /*
         ArrayList arrayImageViews = new ArrayList();
         for (int i =0; i < images.length; i++)
         {
         arrayImageViews.add(new ImageView(this));
         if (arrayImageViews.get(i) instanceof ImageView)
         {
         ((ImageView) arrayImageViews.get(i)).setImageResource(images[i]);
         }
         }
         */
    }
}

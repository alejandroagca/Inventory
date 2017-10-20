package com.example.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.widget.ImageView;

/**
 * @author Alejandro Aguilar
 * Maneja y lanza el dashboard con todos los iconos de inventory
 */

public class DashBoardActivity extends AppCompatActivity {

    private GridLayout gridDashBoard;
    private ClickListenerDashBoard listenerDashboard = new ClickListenerDashBoard();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_support);
        gridDashBoard = (GridLayout) findViewById(R.id.gridDashBoard);
        //Definir un array de int qu contendra el id de las imagenes

        int[] images = {R.drawable.inventory, R.drawable.monitor, R.drawable.seccion, R.drawable.dependencias, R.drawable.preferencias};

        //No se utiliza en java array de objetos. Se utiliza vector o coleccion.
        //ImageView [] imageViews = new ImageView[images.length];

        //No trabajamos con vector porque no tenemos hilos y no hace falta sincronizacion
        //Vector<ImageView> vectorImageViews = new Vector<ImageView>()

        //arrayImageViews.add(new ImageView(this));
        //arrayImageViews.get(i).setImageResource(images[i]);
        //arrayImageViews.get(i).setLayoutParams(params);
        //ArrayList<ImageView> arrayImageViews = new ArrayList<ImageView>();

        ImageView imageView;
        float width = getResources().getDimension(R.dimen.imgDashBoardWidth);
        float heigth = getResources().getDimension(R.dimen.imgDashBoardHeigth);
        for (int i = 0; i < images.length; i++) {
            imageView = new ImageView(this);
            imageView.setId((images[i]));
            imageView.setImageResource(images[i]);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.width = (int) width;
            params.height = (int) heigth;
            params.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            imageView.setLayoutParams(params);
            imageView.setOnClickListener(listenerDashboard);
            gridDashBoard.addView(imageView);
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

    class ClickListenerDashBoard implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.drawable.inventory:
                    intent = new Intent(DashBoardActivity.this, InventoryActivity.class);
                    startActivity(intent);
                    break;
                case R.drawable.monitor:
                    intent = new Intent(DashBoardActivity.this, ProductActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }
}
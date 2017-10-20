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

        int [] images = {R.drawable.closet, R.drawable.chair, R.drawable.cpu, R.drawable.inventory,
                R.drawable.keyboard, R.drawable.monitor, R.drawable.mouse, R.drawable.printer,
                R.drawable.proyector, R.drawable.table, R.drawable.whiteboard};

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
        for (int   i = 0; i < images.length; i++) {
            imageView = new ImageView(this);
            imageView.setImageResource(images[i]);
            imageView.setId(images[3]);
            imageView.setOnClickListener(listenerDashboard);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.width = (int) width;
            params.height = (int) heigth;
            imageView.setLayoutParams(params);
            params.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
            params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, GridLayout.FILL, 1f);
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
    class ClickListenerDashBoard implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.drawable.inventory:
                    intent = new Intent(DashBoardActivity.this, ProductActivity.class);
                    Bundle bundle = new Bundle();
                    break;
                /*case R.drawable.product:
                    intent = new Intent(DashboardActivity.this, ProductActivity.class);
                    break;*/
            }
            startActivity(intent);
        }
    }
}

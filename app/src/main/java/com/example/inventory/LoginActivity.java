package com.example.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * LoginLinearLayout
     * @author Alejandro Aguilar
     * @version 1.0
     * @see android.app.Activity
     */

    private TextView txvSignUp;
    private Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnSignUp = (Button) findViewById(R.id.btnSignIn);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btnSignUp)
        {
            Intent intent = new Intent(this, DashBoardActivity.class);
            startActivity(intent);
        }
    }
}

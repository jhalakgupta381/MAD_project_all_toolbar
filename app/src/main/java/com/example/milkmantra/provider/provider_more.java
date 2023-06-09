package com.example.milkmantra.provider;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.milkmantra.MainActivity;
import com.example.milkmantra.R;

public class provider_more extends AppCompatActivity {

    LinearLayout logout,language,sales,customer_report,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_more);


        // it is use for logout account

        logout=findViewById(R.id.Logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intet =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intet);
            }
        });


        // it is use for switch the language

        language=findViewById(R.id.Language);
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                View dialogView = getLayoutInflater().inflate(R.layout.custom_language, null);
                builder.setView(dialogView);

                final AlertDialog dialog = builder.create();



                Button cancelButton = dialogView.findViewById(R.id.Select);
                cancelButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });


                dialog.setCanceledOnTouchOutside(false);

                dialog.show();

            }
        });

        // it is for handling sales page

        sales=findViewById(R.id.Sales);

        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),provider_sales.class);
                startActivity(intent);
            }
        });


        // it is handle the report of customer
        customer_report=findViewById(R.id.Customer_Report);

        customer_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),provider_customer_report.class);
                startActivity(intent);
            }
        });


        // It is use for profile

        profile=findViewById(R.id.Profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),provider_profile.class);
                startActivity(intent);
            }
        });




    }
}
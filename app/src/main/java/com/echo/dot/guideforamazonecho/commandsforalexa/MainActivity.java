package com.echo.dot.guideforamazonecho.commandsforalexa;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import android.widget.TextView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button button;
    ImageButton imageButton;
    TextView tvText1, tvText2, tvText3, tvText4, tvText5, tvText9, tvText15, tvText16, tvText18, tvText20, tvText21, tvText22,
            tvText11, tvText10, tvText99, tvText8, tvText7, tvText36,tvText40,tvText41,tvText42;
    private TextView mText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();



        tvText1 = (TextView) findViewById(R.id.tvText1);
        tvText2 = (TextView) findViewById(R.id.tvText2);
        tvText3 = (TextView) findViewById(R.id.tvText3);
        tvText4 = (TextView) findViewById(R.id.tvText4);
        tvText5 = (TextView) findViewById(R.id.tvText5);
        tvText9 = (TextView) findViewById(R.id.tvText9);
        tvText15 = (TextView) findViewById(R.id.tvText15);
        tvText9 = (TextView) findViewById(R.id.tvText9);
        tvText16 = (TextView) findViewById(R.id.tvText16);
        tvText18 = (TextView) findViewById(R.id.tvText18);
        tvText20 = (TextView) findViewById(R.id.tvText20);

        tvText21 = (TextView) findViewById(R.id.tvText21);

        tvText22 = (TextView) findViewById(R.id.tvText22);

        tvText11 = (TextView) findViewById(R.id.tvText11);

        tvText10 = (TextView) findViewById(R.id.tvText10);
        tvText99 = (TextView) findViewById(R.id.tvText99);

        tvText8 = (TextView) findViewById(R.id.tvText8);

        tvText7 = (TextView) findViewById(R.id.tvText7);
        tvText36 = (TextView) findViewById(R.id.tvText36);



        tvText40 = (TextView) findViewById(R.id.tvText40);

        tvText41 = (TextView) findViewById(R.id.tvText41);
        tvText42 = (TextView) findViewById(R.id.tvText42);

        tvText1.setSelected(true);
        tvText2.setSelected(true);
        tvText3.setSelected(true);
        tvText9.setSelected(true);


        tvText4.setSelected(true);
        tvText5.setSelected(true);
        tvText15.setSelected(true);
        tvText16.setSelected(true);
        tvText18.setSelected(true);
        tvText20.setSelected(true);
        tvText21.setSelected(true);
        tvText22.setSelected(true);

        tvText10.setSelected(true);
        tvText11.setSelected(true);
        tvText99.setSelected(true);
        tvText36.setSelected(true);
        tvText8.setSelected(true);
        tvText7.setSelected(true);

        tvText40.setSelected(true);
        tvText41.setSelected(true);
        tvText42.setSelected(true);

    }


    public void addListenerOnButton() {


        imageButton = (ImageButton) findViewById(R.id.button2);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main2Activity.class);
                startActivity(myIntent);
            }

        });


        imageButton = (ImageButton) findViewById(R.id.button3);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main3Activity.class);
                startActivity(myIntent);
            }

        });




        imageButton = (ImageButton) findViewById(R.id.button5);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main5Activity.class);
                startActivity(myIntent);
            }

        });


        imageButton = (ImageButton) findViewById(R.id.button6);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main6Activity.class);
                startActivity(myIntent);
            }

        });


        imageButton = (ImageButton) findViewById(R.id.button7);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main7Activity.class);
                startActivity(myIntent);
            }

        });


        imageButton = (ImageButton) findViewById(R.id.button8);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main8Activity.class);
                startActivity(myIntent);
            }

        });

        imageButton = (ImageButton) findViewById(R.id.button9);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main9Activity.class);
                startActivity(myIntent);
            }

        });


        imageButton = (ImageButton) findViewById(R.id.button10);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main10Activity.class);
                startActivity(myIntent);
            }

        });

        imageButton = (ImageButton) findViewById(R.id.button11);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main11Activity.class);
                startActivity(myIntent);
            }

        });


        imageButton = (ImageButton) findViewById(R.id.button12);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main12Activity.class);
                startActivity(myIntent);
            }

        });

        imageButton = (ImageButton) findViewById(R.id.button13);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main13Activity.class);
                startActivity(myIntent);
            }

        });


        imageButton = (ImageButton) findViewById(R.id.button28);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main14Activity.class);
                startActivity(myIntent);
            }

        });

        imageButton = (ImageButton) findViewById(R.id.button29);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main15Activity.class);
                startActivity(myIntent);
            }

        });

        imageButton = (ImageButton) findViewById(R.id.button30);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main16Activity.class);
                startActivity(myIntent);
            }

        });
        imageButton = (ImageButton) findViewById(R.id.button90);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main17Activity.class);
                startActivity(myIntent);
            }

        });
        imageButton = (ImageButton) findViewById(R.id.button91);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main18Activity.class);
                startActivity(myIntent);
            }

        });
        imageButton = (ImageButton) findViewById(R.id.button92);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main19Activity.class);
                startActivity(myIntent);
            }

        });








        imageButton = (ImageButton) findViewById(R.id.imageButton5);


        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main20Activity.class);
                startActivity(myIntent);
            }

        });
        imageButton = (ImageButton) findViewById(R.id.imageButton2);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main21Activity.class);
                startActivity(myIntent);
            }

        });
        imageButton = (ImageButton) findViewById(R.id.imageButton6);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent myIntent = new Intent(MainActivity.this,
                        Main22Activity.class);
                startActivity(myIntent);
            }

        });
    }

    public void six(View view) {

            Intent intent = new Intent(this, Main4Activity.class);
            startActivity(intent);

    }



}
package com.example.humayunt.moreless;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button B1 = null;
    Button B3 = null;
    Button B4 = null;
    MediaPlayer mp = null;

    Button B2 = null;
    TextView score = null;
    TextView lifecount = null;
    int num1 = 0;
    int num2 = 0;
    int scoretotal = 0;
    int life = 10;
    int a = 0;
    int b = 0;
    int c = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = (Button) findViewById(R.id.button);
        B2 = (Button) findViewById(R.id.button2);
        B3 = (Button) findViewById(R.id.button3);
        B4 = (Button) findViewById(R.id.button4);


        score = (TextView) findViewById(R.id.score);
        lifecount = (TextView) findViewById(R.id.lifetext);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);


        B1.setText(rand());
        B2.setText(rand());
        B3.setText(rand());
       // oneprime();
        B4.setText("SKIP");


    }


    @Override
    public void onClick(View v) {
        //mp = MediaPlayer.create(this, R.raw.ting);
        // mp.start();
        a = Integer.parseInt((String) B1.getText());
        b = Integer.parseInt((String) B2.getText());

        c = Integer.parseInt((String) B3.getText());


        if (B1.isPressed()) {
            if (isPrime(a)) {
                scoretotal++;
                score.setText(Integer.toString(scoretotal));
                B1.setText(rand());
                B2.setText(rand());
                B3.setText(rand());
                //oneprime();




            } else {
                life--;
                lifecount.setText(Integer.toString(life));
                AlertDialog.Builder popuplife = new AlertDialog.Builder(this);
                popuplife.setMessage("Life lost!  " + " " + life + "  left!");
                popuplife.setPositiveButton("Continue", null);
                popuplife.create().show();

                B1.setText(rand());
                B2.setText(rand());
                B3.setText(rand());
                //oneprime();


                if (life == 1) {
                    AlertDialog.Builder popup = new AlertDialog.Builder(this);
                    popup.setMessage("GAME OVER! " + " YOUR SCORE : " + scoretotal);

                    popup.setPositiveButton("TRY AGAIN", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    life = 10;
                                    scoretotal = 0;
                                    lifecount.setText(Integer.toString(10));
                                    score.setText(Integer.toString(0));
                                }


                            }

                    );
                    popup.create().show();


                }
            }

        }

        if (B2.isPressed()) {
            if (isPrime(b)) {
                scoretotal++;
                score.setText(Integer.toString(scoretotal));
                B1.setText(rand());
                B2.setText(rand());
                B3.setText(rand());
                //oneprime();



            } else {
                life--;
                lifecount.setText(Integer.toString(life));
                AlertDialog.Builder popuplife2 = new AlertDialog.Builder(this);
                popuplife2.setMessage("Life lost  " + " " + life + "  left!");
                popuplife2.setPositiveButton("Continue", null);
                popuplife2.create().show();

                B1.setText(rand());
                B2.setText(rand());
                B3.setText(rand());
                //oneprime();


                if (life == 1) {
                    AlertDialog.Builder popup = new AlertDialog.Builder(this);
                    popup.setMessage("GAME OVER! " + " YOUR SCORE : " + scoretotal);

                    popup.setPositiveButton("TRY AGAIN", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    life = 10;
                                    scoretotal = 0;
                                    lifecount.setText(Integer.toString(10));
                                    score.setText(Integer.toString(0));
                                }

                            }
                    );
                    popup.create().show();


                }
            }
        }

        if (B3.isPressed()) {

            if (isPrime(c)) {
                scoretotal++;
                score.setText(Integer.toString(scoretotal));
                B1.setText(rand());
                B2.setText(rand());
                B3.setText(rand());
                //oneprime();



            } else {
                life--;
                lifecount.setText(Integer.toString(life));
                AlertDialog.Builder popuplife = new AlertDialog.Builder(this);
                popuplife.setMessage("Life lost! " + "  " + life + "  left!");
                popuplife.setPositiveButton("Continue", null);
                popuplife.create().show();

                B1.setText(rand());
                B2.setText(rand());
                B3.setText(rand());
                //oneprime();


                if (life == 1) {
                    AlertDialog.Builder popup = new AlertDialog.Builder(this);
                    popup.setMessage("GAME OVER! " + " YOUR SCORE : " + scoretotal);

                    popup.setPositiveButton("TRY AGAIN", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    life = 10;
                                    scoretotal = 0;
                                    lifecount.setText(Integer.toString(10));
                                    score.setText(Integer.toString(0));
                                }


                            }

                    );
                    popup.create().show();


                }
            }

        }
        if (B4.isPressed()) {
            if (isPrime(a)) {
                {
                    life--;
                    lifecount.setText(Integer.toString(life));
                    AlertDialog.Builder popuplife2 = new AlertDialog.Builder(this);
                    popuplife2.setMessage(" The First Number Was Prime!  " + " " + life + " Lives left!");
                    popuplife2.setPositiveButton("Continue", null);
                    popuplife2.create().show();

                    B1.setText(rand());
                    B2.setText(rand());
                    B3.setText(rand());
                   // oneprime();


                    if (life == 1) {
                        AlertDialog.Builder popup = new AlertDialog.Builder(this);
                        popup.setMessage("GAME OVER! " + " YOUR SCORE : " + scoretotal);

                        popup.setPositiveButton("TRY AGAIN", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        life = 10;
                                        scoretotal = 0;
                                        lifecount.setText(Integer.toString(10));
                                        score.setText(Integer.toString(0));
                                    }

                                }
                        );
                        popup.create().show();

                    }
                } }

            if (isPrime(b)) {
                {
                    life--;
                    lifecount.setText(Integer.toString(life));
                    AlertDialog.Builder popuplife2 = new AlertDialog.Builder(this);
                    popuplife2.setMessage(" The Second Number Was Prime!  " + " " + life + " Lives left!");
                    popuplife2.setPositiveButton("Continue", null);
                    popuplife2.create().show();

                    B1.setText(rand());
                    B2.setText(rand());
                    B3.setText(rand());
                   // oneprime();


                    if (life == 1) {
                        AlertDialog.Builder popup = new AlertDialog.Builder(this);
                        popup.setMessage("GAME OVER! " + " YOUR SCORE : " + scoretotal);

                        popup.setPositiveButton("TRY AGAIN", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        life = 10;
                                        scoretotal = 0;
                                        lifecount.setText(Integer.toString(10));
                                        score.setText(Integer.toString(0));
                                    }

                                }
                        );
                        popup.create().show();

                    }
                } }
            if (isPrime(c)) {
                {
                    life--;
                    lifecount.setText(Integer.toString(life));
                    AlertDialog.Builder popuplife2 = new AlertDialog.Builder(this);
                    popuplife2.setMessage(" The First Number Was Prime!  " + " " + life + " Lives left!");
                    popuplife2.setPositiveButton("Continue", null);
                    popuplife2.create().show();

                    B1.setText(rand());
                    B2.setText(rand());
                    B3.setText(rand());
                   // oneprime();


                    if (life == 1) {
                        AlertDialog.Builder popup = new AlertDialog.Builder(this);
                        popup.setMessage("GAME OVER! " + " YOUR SCORE : " + scoretotal);

                        popup.setPositiveButton("TRY AGAIN", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        life = 10;
                                        scoretotal = 0;
                                        lifecount.setText(Integer.toString(10));
                                        score.setText(Integer.toString(0));
                                    }

                                }
                        );
                        popup.create().show();

                    }
                } }

            else{
                B1.setText(rand());
                B2.setText(rand());
                B3.setText(rand());
               // oneprime();


            }

        }
            }








    public String rand(){
        int x=(int) (Math.random()*50);
        x=(x*2)+1;

          String number1string = Integer.toString(x);
          return number1string;
    }
    /*public void oneprime( ){
        if( isPrime(a)||isPrime(b)||isPrime(c)){
                   // return;
                }
            }
        }
        else{
            B1.setText(rand());
            B2.setText(rand());
            B3.setText(rand());
        }
    }*/

    private static boolean isPrime(int inputNum){
        if (inputNum <= 3 || inputNum % 2 == 0)
            return inputNum == 2 || inputNum == 3; //this returns false if number is <=1 & true if number = 2 or 3
        int divisor = 3;
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0))
            divisor += 2; //iterates through all possible divisors
        return inputNum % divisor != 0; //returns true/false
    }






    }




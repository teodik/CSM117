package com.example.teodik.tictactoe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.nio.charset.Charset;

public class GameActivity extends AppCompatActivity {

    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private int turn;
    private boolean gameOn;
    private String messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        turn = 1;
        gameOn = true;
        LocalBroadcastManager.getInstance(this).registerReceiver(mReciver, new IntentFilter("incomingMessage"));

        b1.setOnClickListener(new View.OnClickListener()
                              {
                                  public void onClick(View v){
                                      if(b1.getText().toString().equals("")){
                                          if(turn == 1){
                                              turn = 2;
                                              b1.setText("X");
                                          }else{
                                              turn = 1;
                                              b1.setText("O");
                                          }
                                          byte[] bytes = "b1".getBytes(Charset.defaultCharset());
                                          MainActivity.mBluetoothConnection.write(bytes);
                                          endGame();
                                      }
                                  }
                              }
        );

        b2.setOnClickListener(new View.OnClickListener()
                              {
                                  public void onClick(View v){
                                      if(b2.getText().toString().equals("")){
                                          if(turn == 1){
                                              turn = 2;
                                              b2.setText("X");
                                          }else{
                                              turn = 1;
                                              b2.setText("O");
                                          }
                                          byte[] bytes = "b2".getBytes(Charset.defaultCharset());
                                          MainActivity.mBluetoothConnection.write(bytes);
                                          endGame();
                                      }
                                  }
                              }
        );

        b3.setOnClickListener(new View.OnClickListener()
                              {
                                  public void onClick(View v){
                                      if(b3.getText().toString().equals("")){
                                          if(turn == 1){
                                              turn = 2;
                                              b3.setText("X");
                                          }else{
                                              turn = 1;
                                              b3.setText("O");
                                          }
                                          byte[] bytes = "b3".getBytes(Charset.defaultCharset());
                                          MainActivity.mBluetoothConnection.write(bytes);
                                          endGame();
                                      }
                                  }
                              }
        );

        b4.setOnClickListener(new View.OnClickListener()
                              {
                                  public void onClick(View v){
                                      if(b4.getText().toString().equals("")){
                                          if(turn == 1){
                                              turn = 2;
                                              b4.setText("X");
                                          }else{
                                              turn = 1;
                                              b4.setText("O");
                                          }
                                          byte[] bytes = "b4".getBytes(Charset.defaultCharset());
                                          MainActivity.mBluetoothConnection.write(bytes);
                                          endGame();
                                      }
                                  }
                              }
        );

        b5.setOnClickListener(new View.OnClickListener()
                              {
                                  public void onClick(View v){
                                      if(b5.getText().toString().equals("")){
                                          if(turn == 1){
                                              turn = 2;
                                              b5.setText("X");
                                          }else{
                                              turn = 1;
                                              b5.setText("O");
                                          }
                                          byte[] bytes = "b5".getBytes(Charset.defaultCharset());
                                          MainActivity.mBluetoothConnection.write(bytes);
                                          endGame();
                                      }
                                  }
                              }
        );

        b6.setOnClickListener(new View.OnClickListener()
                              {
                                  public void onClick(View v){
                                      if(b6.getText().toString().equals("")){
                                          if(turn == 1){
                                              turn = 2;
                                              b6.setText("X");

                                          }else{
                                              turn = 1;
                                              b6.setText("O");
                                          }
                                          byte[] bytes = "b6".getBytes(Charset.defaultCharset());
                                          MainActivity.mBluetoothConnection.write(bytes);
                                          endGame();
                                      }
                                  }
                              }
        );

        b7.setOnClickListener(new View.OnClickListener()
                              {
                                  public void onClick(View v){
                                      if(b7.getText().toString().equals("")){
                                          if(turn == 1){
                                              turn = 2;
                                              b7.setText("X");
                                          }else{
                                              turn = 1;
                                              b7.setText("O");
                                          }
                                          byte[] bytes = "b7".getBytes(Charset.defaultCharset());
                                          MainActivity.mBluetoothConnection.write(bytes);
                                          endGame();
                                      }
                                  }
                              }
        );

        b8.setOnClickListener(new View.OnClickListener()
                              {
                                  public void onClick(View v){
                                      if(b8.getText().toString().equals("")){
                                          if(turn == 1){
                                              turn = 2;
                                              b8.setText("X");
                                          }else{
                                              turn = 1;
                                              b8.setText("O");
                                          }
                                          byte[] bytes = "b8".getBytes(Charset.defaultCharset());
                                          MainActivity.mBluetoothConnection.write(bytes);
                                          endGame();
                                      }
                                  }
                              }
        );

        b9.setOnClickListener(new View.OnClickListener()
                              {
                                  public void onClick(View v){
                                      if(b9.getText().toString().equals("")){
                                          if(turn == 1){
                                              turn = 2;
                                              b9.setText("X");
                                          }else{
                                              turn = 1;
                                              b9.setText("O");
                                              byte[] bytes = "b9".getBytes(Charset.defaultCharset());
                                              MainActivity.mBluetoothConnection.write(bytes);
                                          }
                                          byte[] bytes = "b9".getBytes(Charset.defaultCharset());
                                          MainActivity.mBluetoothConnection.write(bytes);
                                          endGame();
                                      }
                                  }
                              }
        );

        while(gameOn){
            if(turn != MainActivity.yourTurn){
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
                if(!messages.equals("")){
                    b1.setEnabled(true);
                    b2.setEnabled(true);
                    b3.setEnabled(true);
                    b4.setEnabled(true);
                    b5.setEnabled(true);
                    b6.setEnabled(true);
                    b7.setEnabled(true);
                    b8.setEnabled(true);
                    b9.setEnabled(true);
                    switch(messages){
                        case"b1":
                            if(MainActivity.yourTurn == 1)
                                b1.setText("O");
                            else
                                b1.setText("X");
                            break;
                        case"b2":
                            if(MainActivity.yourTurn == 1)
                                b2.setText("O");
                            else
                                b2.setText("X");
                            turn = MainActivity.yourTurn;
                            break;
                        case"b3":
                            if(MainActivity.yourTurn == 1)
                                b3.setText("O");
                            else
                                b3.setText("X");
                            break;
                        case"b14":
                            if(MainActivity.yourTurn == 1)
                                b4.setText("O");
                            else
                                b4.setText("X");
                            break;
                        case"b5":
                            if(MainActivity.yourTurn == 1)
                                b5.setText("O");
                            else
                                b5.setText("X");
                            break;
                        case"b6":
                            if(MainActivity.yourTurn == 1)
                                b6.setText("O");
                            else
                                b6.setText("X");
                            break;
                        case"b7":
                            if(MainActivity.yourTurn == 1)
                                b7.setText("O");
                            else
                                b7.setText("X");
                            break;
                        case"b8":
                            if(MainActivity.yourTurn == 1)
                                b8.setText("O");
                            else
                                b8.setText("X");
                            break;
                        case"b9":
                            if(MainActivity.yourTurn == 1)
                                b9.setText("O");
                            else
                                b9.setText("X");
                            break;
                    }
                    turn = MainActivity.yourTurn;
                    messages = "";
                }
            }
        }
    }

    public void endGame(){
        String s1,s2,s3,s4,s5,s6,s7,s8,s9;
        s1 = b1.getText().toString();
        s2 = b2.getText().toString();
        s3 = b3.getText().toString();
        s4 = b4.getText().toString();
        s5 = b5.getText().toString();
        s6 = b6.getText().toString();
        s7 = b7.getText().toString();
        s8 = b8.getText().toString();
        s9 = b9.getText().toString();
        boolean end = false;
        if(!(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() ||
                s6.isEmpty() || s7.isEmpty() || s8.isEmpty() || s9.isEmpty())){
            Toast.makeText(GameActivity.this, "It's a draw", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s1.equals("X") && s1.equals(s2) && s1.equals(s3)) {
            Toast.makeText(GameActivity.this, "Winner Player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s1.equals("X") && s1.equals(s5) && s1.equals(s9)) {
            Toast.makeText(GameActivity.this, "Winner Player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s1.equals("X") && s1.equals(s4) && s1.equals(s7)) {
            Toast.makeText(GameActivity.this, "Winner Player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s2.equals("X") && s2.equals(s5) && s2.equals(s8)) {
            Toast.makeText(GameActivity.this, "Winner Player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s3.equals("X") && s3.equals(s6) && s3.equals(s9)) {
            Toast.makeText(GameActivity.this, "Winner Player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s3.equals("X") && s3.equals(s5) && s3.equals(s7)) {
            Toast.makeText(GameActivity.this, "Winner Player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s4.equals("X") && s4.equals(s5) && s4.equals(s6)) {
            Toast.makeText(GameActivity.this, "Winner Player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s7.equals("X") && s7.equals(s8) && s7.equals(s9)) {
            Toast.makeText(GameActivity.this, "Winner Player X", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s1.equals("O") && s1.equals(s2) && s1.equals(s3)) {
            Toast.makeText(GameActivity.this, "Winner Player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s1.equals("O") && s1.equals(s5) && s1.equals(s9)) {
            Toast.makeText(GameActivity.this, "Winner Player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s1.equals("O") && s1.equals(s4) && s1.equals(s7)) {
            Toast.makeText(GameActivity.this, "Winner Player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s2.equals("O") && s2.equals(s5) && s2.equals(s8)) {
            Toast.makeText(GameActivity.this, "Winner Player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s3.equals("O") && s3.equals(s6) && s3.equals(s9)) {
            Toast.makeText(GameActivity.this, "Winner Player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s3.equals("O") && s3.equals(s5) && s3.equals(s7)) {
            Toast.makeText(GameActivity.this, "Winner Player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s4.equals("O") && s4.equals(s5) && s4.equals(s6)) {
            Toast.makeText(GameActivity.this, "Winner Player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(s7.equals("O") && s7.equals(s8) && s7.equals(s9)) {
            Toast.makeText(GameActivity.this, "Winner Player O", Toast.LENGTH_LONG).show();
            end = true;
        }
        if(end){
            gameOn = false;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }

    BroadcastReceiver mReciver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            messages = intent.getStringExtra("theMessage");
        }
    };
}

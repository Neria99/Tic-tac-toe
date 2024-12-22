package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    private boolean flag= false;

    public boolean calculation(Button btArr[][],String strU,String strC){
        for (int i = 0; i < 3; i++) {
            //Checking lines
            if (btArr[i][0].getText().equals(strU) && btArr[i][1].getText().equals(strU) && btArr[i][2].getText().equals("")) {
                btArr[i][2].setText(strC);
                btArr[i][2].setTextSize(40);
                btArr[i][2].setTextColor(Color.parseColor("#0000FF"));
                btArr[i][2].setGravity(Gravity.CENTER);
                return true;
            }
            if (btArr[i][0].getText().equals(strU) && btArr[i][2].getText().equals(strU) && btArr[i][1].getText().equals("")) {
                btArr[i][1].setText(strC);
                btArr[i][1].setTextSize(40);
                btArr[i][1].setTextColor(Color.parseColor("#0000FF"));
                btArr[i][1].setGravity(Gravity.CENTER);
                return true;
            }
            if (btArr[i][1].getText().equals(strU) && btArr[i][2].getText().equals(strU) && btArr[i][0].getText().equals("")) {
                btArr[i][0].setText(strC);
                btArr[i][0].setTextSize(40);
                btArr[i][0].setTextColor(Color.parseColor("#0000FF"));
                btArr[i][0].setGravity(Gravity.CENTER);
                return true;
            }
           //Checking columns
            if (btArr[0][i].getText().equals(strU) && btArr[1][i].getText().equals(strU) && btArr[2][i].getText().equals("")) {
                btArr[2][i].setText(strC);
                btArr[2][i].setTextSize(40);
                btArr[2][i].setTextColor(Color.parseColor("#0000FF"));
                btArr[2][i].setGravity(Gravity.CENTER);
                return true;
            }
            if (btArr[0][i].getText().equals(strU) && btArr[2][i].getText().equals(strU) && btArr[1][i].getText().equals("")) {
                btArr[1][i].setText(strC);
                btArr[1][i].setTextSize(40);
                btArr[1][i].setTextColor(Color.parseColor("#0000FF"));
                btArr[1][i].setGravity(Gravity.CENTER);
                return true;
            }
            if (btArr[1][i].getText().equals(strU) && btArr[2][i].getText().equals(strU) && btArr[0][i].getText().equals("")) {
                btArr[0][i].setText(strC);
                btArr[0][i].setTextSize(40);
                btArr[0][i].setTextColor(Color.parseColor("#0000FF"));
                btArr[0][i].setGravity(Gravity.CENTER);
                return true;
            }
            //Diagonal check from left to right
            if (btArr[0][0].getText().equals(strU) && btArr[1][1].getText().equals(strU) && btArr[2][2].getText().equals("")) {
                btArr[2][2].setText(strC);
                btArr[2][2].setTextSize(40);
                btArr[2][2].setTextColor(Color.parseColor("#0000FF"));
                btArr[2][2].setGravity(Gravity.CENTER);
                return true;
            }
            if (btArr[0][0].getText().equals(strU) && btArr[2][2].getText().equals(strU) && btArr[1][1].getText().equals("")) {
                btArr[1][1].setText(strC);
                btArr[1][1].setTextSize(40);
                btArr[1][1].setTextColor(Color.parseColor("#0000FF"));
                btArr[1][1].setGravity(Gravity.CENTER);
                return true;
            }
            if (btArr[1][1].getText().equals(strU) && btArr[2][2].getText().equals(strU) && btArr[0][0].getText().equals("")) {
                btArr[0][0].setText(strC);
                btArr[0][0].setTextSize(40);
                btArr[0][0].setTextColor(Color.parseColor("#0000FF"));
                btArr[0][0].setGravity(Gravity.CENTER);
                return true;
            }
            //Diagonal check from right to left
            if (btArr[0][2].getText().equals(strU) && btArr[1][1].getText().equals(strU) && btArr[2][0].getText().equals("")) {
                btArr[2][0].setText(strC);
                btArr[2][0].setTextSize(40);
                btArr[2][0].setTextColor(Color.parseColor("#0000FF"));
                btArr[2][0].setGravity(Gravity.CENTER);
                return true;
            }
            if (btArr[0][2].getText().equals(strU) && btArr[2][0].getText().equals(strU) && btArr[1][1].getText().equals("")) {
                btArr[1][1].setText(strC);
                btArr[1][1].setTextSize(40);
                btArr[1][1].setTextColor(Color.parseColor("#0000FF"));
                btArr[1][1].setGravity(Gravity.CENTER);
                return true;
            }
            if (btArr[1][1].getText().equals(strU) && btArr[2][0].getText().equals(strU) && btArr[0][2].getText().equals("")) {
                btArr[0][2].setText(strC);
                btArr[0][2].setTextSize(40);
                btArr[0][2].setTextColor(Color.parseColor("#0000FF"));
                btArr[0][2].setGravity(Gravity.CENTER);
                return true;
            }
        }
        return false;
    }
    public  void computer(Button btArr[][] ,TextView tv){
             if(calculation(btArr,"O","O" )) {
                  return;
             }if(calculation(btArr,"X","O" )) {
                 return;
             }
                 int counter =0, index =0;
                 for (int i = 0; i < btArr.length; i++) {
                     for (int j = 0; j < btArr[i].length; j++) {
                         if (btArr[i][j].getText().equals("")) {
                             counter++;
                         }
                     }
                 }
                 if (counter == 0){
                     tv.setText("GAME OVER");
                     tv.setTextSize(20);
                     flag = true;
                     return;
                 }
                 Button[] arr = new Button[counter];
                 for (int i = 0; i < btArr.length; i++) {
                     for (int j = 0; j < btArr[i].length; j++) {
                         if (btArr[i][j].getText().equals("")) {
                             arr[index] = btArr[i][j];
                             index++;
                         }
                     }
                 }
                 int randomNumber = random.nextInt(counter) ;
                 for(int i=0; i< arr.length; i++) {
                     if(i == randomNumber){
                         arr[i].setText("O");
                         arr[i].setTextSize(40);
                         arr[i].setTextColor(Color.parseColor("#0000FF"));
                         arr[i].setGravity(Gravity.CENTER);
                     }
                 }
             }

    public  boolean check(Button bArr[][],String str) {

        if (
                (bArr[0][0].getText().equals(str)) &&
                        (bArr[0][1].getText().equals(str)) &&
                               (bArr[0][2].getText().equals(str))
        ) {
            bArr[0][0].setBackgroundColor(0xFF808080);
            bArr[0][1].setBackgroundColor(0xFF808080);
            bArr[0][2].setBackgroundColor(0xFF808080);
            return true;

        }
        if (
                (bArr[1][0].getText().equals(str)) &&
                        (bArr[1][1].getText().equals(str)) &&
                                (bArr[1][2].getText().equals(str))
        ) {
            bArr[1][0].setBackgroundColor(0xFF808080);
            bArr[1][1].setBackgroundColor(0xFF808080);
            bArr[1][2].setBackgroundColor(0xFF808080);
            return true;
        }
        if (
                (bArr[2][0].getText().equals(str)) &&
                        (bArr[2][1].getText().equals(str)) &&
                        (bArr[2][2].getText().equals(str))
        ) {
            bArr[2][0].setBackgroundColor(0xFF808080);
            bArr[2][1].setBackgroundColor(0xFF808080);
            bArr[2][2].setBackgroundColor(0xFF808080);
            return true;
        }
        if (
                (bArr[0][0].getText().equals(str)) &&
                        (bArr[1][0].getText().equals(str)) &&
                        (bArr[2][0].getText().equals(str))
        ) {
            bArr[0][0].setBackgroundColor(0xFF808080);
            bArr[1][0].setBackgroundColor(0xFF808080);
            bArr[2][0].setBackgroundColor(0xFF808080);
            return true;
        }
        if (
                (bArr[0][1].getText().equals(str)) &&
                        (bArr[1][1].getText().equals(str)) &&
                        (bArr[2][1].getText().equals(str))
        ) {
            bArr[0][1].setBackgroundColor(0xFF808080);
            bArr[1][1].setBackgroundColor(0xFF808080);
            bArr[2][1].setBackgroundColor(0xFF808080);
            return true;
        }
        if (
                (bArr[0][2].getText().equals(str)) &&
                        (bArr[1][2].getText().equals(str)) &&
                        (bArr[2][2].getText().equals(str))
        ) {
            bArr[0][2].setBackgroundColor(0xFF808080);
            bArr[1][2].setBackgroundColor(0xFF808080);
            bArr[2][2].setBackgroundColor(0xFF808080);
            return true;
        }
        if (
                (bArr[0][0].getText().equals(str)) &&
                        (bArr[1][1].getText().equals(str)) &&
                               (bArr[2][2].getText().equals(str))
        ) {
            bArr[0][0].setBackgroundColor(0xFF808080);
            bArr[1][1].setBackgroundColor(0xFF808080);
            bArr[2][2].setBackgroundColor(0xFF808080);
            return true;
        }
        if (
                (bArr[0][2].getText().equals(str)) &&
                        (bArr[1][1].getText().equals(str)) &&
                               (bArr[2][0].getText().equals(str))
        ) {
            bArr[0][2].setBackgroundColor(0xFF808080);
            bArr[1][1].setBackgroundColor(0xFF808080);
            bArr[2][0].setBackgroundColor(0xFF808080);
            return true;
        }
        return false;
    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = findViewById(R.id.button);
        Button bt2 = findViewById(R.id.button2);
        Button bt3 = findViewById(R.id.button3);
        Button bt4 = findViewById(R.id.button4);
        Button bt5 = findViewById(R.id.button5);
        Button bt6 = findViewById(R.id.button6);
        Button bt7 = findViewById(R.id.button7);
        Button bt8 = findViewById(R.id.button8);
        Button bt9 = findViewById(R.id.button9);
        TextView tv = findViewById(R.id.textView2);

        Button bArr2[][] = new Button[3][3];
        bArr2[0][0] = bt1;
        bArr2[0][1] = bt2;
        bArr2[0][2] = bt3;
        bArr2[1][0] = bt4;
        bArr2[1][1] = bt5;
        bArr2[1][2] = bt6;
        bArr2[2][0] = bt7;
        bArr2[2][1] = bt8;
        bArr2[2][2] = bt9;

            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override

                public void onClick(View view) {
                    if(!flag) {
                    Button clickedButton = (Button) view;
                    if (clickedButton.getText().equals("")) {
                        clickedButton.setTextSize(40);
                        clickedButton.setText("X");
                        clickedButton.setTextColor(Color.parseColor("#FF0000"));
                        clickedButton.setGravity(Gravity.CENTER);
                        if (check(bArr2, "X")) {
                            tv.setText("YOU WONNN");
                            tv.setTextSize(20);
                            flag = true;
                        } else {
                            computer(bArr2, tv);
                            if(check(bArr2, "O")){
                                tv.setText("GAME OVER");
                                tv.setTextSize(20);
                                flag = true;
                            }
                        }

                    }
                }
            }
        };
            bt1.setOnClickListener(onClickListener);
            bt2.setOnClickListener(onClickListener);
            bt3.setOnClickListener(onClickListener);
            bt4.setOnClickListener(onClickListener);
            bt5.setOnClickListener(onClickListener);
            bt6.setOnClickListener(onClickListener);
            bt7.setOnClickListener(onClickListener);
            bt8.setOnClickListener(onClickListener);
            bt9.setOnClickListener(onClickListener);
    }
}
package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivityEasy   extends AppCompatActivity {

    Random random = new Random();
    private boolean flag= false;
    public  void computer(Button btArr[][] ,TextView tv){
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
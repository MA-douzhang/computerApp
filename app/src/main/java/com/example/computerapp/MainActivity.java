package com.example.computerapp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button buttonOne;
    Button buttonTow;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonAdd;
    Button buttonReduce;
    Button buttonRide;
    Button buttonDivide;
    Button buttonReturnZero;
    Button buttonZero;
    Button buttonEnd;
    EditText result;
    String nums="";
    String numsTemp="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne=findViewById(R.id.button_one);
        buttonTow=findViewById(R.id.button_two);
        buttonThree=findViewById(R.id.button_three);
        buttonFour=findViewById(R.id.button_four);
        buttonFive=findViewById(R.id.button_five);
        buttonSix=findViewById(R.id.button_six);
        buttonSeven=findViewById(R.id.button_seven);
        buttonEight=findViewById(R.id.button_eight);
        buttonNine=findViewById(R.id.button_nine);
        buttonAdd=findViewById(R.id.button_add);
        buttonReduce=findViewById(R.id.button_reduce);
        buttonRide=findViewById(R.id.button_ride);
        buttonDivide=findViewById(R.id.button_divide);
        buttonReturnZero=findViewById(R.id.button_return_zero);
        buttonZero=findViewById(R.id.button_zero);
        result=findViewById(R.id.button_result);
        buttonEnd =findViewById(R.id.button_end);
        //数字
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums+=1;
                result.setText(nums);
            }
        });
        buttonTow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums+=2;
                result.setText(nums);
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums+=3;
                result.setText(nums);
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums+=4;
                result.setText(nums);
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums+=5;
                result.setText(nums);
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums+=6;
                result.setText(nums);
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums+=7;
                result.setText(nums);
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums+=8;
                result.setText(nums);
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums+=9;
                result.setText(nums);
            }
        });
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nums.length()==0){
                    result.setText("");
                }else {
                    nums+=0;
                    result.setText(nums);
                }
            }
        });

        //符号

        //加
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nums==""){
                    //多次点击加号
                }else {
                    numsTemp="+"+nums;
                    nums="";
                }

            }
        });
        //减
        buttonReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nums==""){
                    //多次点击加号
                }else {
                    numsTemp="-"+nums;
                    nums="";
                }

            }
        });
        //乘
        buttonRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nums==""){
                    //多次点击加号
                }else {
                    numsTemp="*"+nums;
                    nums="";
                }

            }
        });
        //除
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nums==""){
                    //多次点击加号
                }else {
                    numsTemp="/"+nums;
                    nums="";
                }

            }
        });
        //等于
        buttonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nums==""||numsTemp==""){

                }else {
                    String numsResult = "";
                    float one = Float.valueOf(nums);
                    char sign = numsTemp.charAt(0);
                    numsTemp = numsTemp.substring(1);
                    float two = Float.valueOf(numsTemp);
                    nums = "";
                    numsTemp = "";

                    if (sign == '+'){
                        nums += one + two;
                        numsResult += nums;
                    }
                    if(sign=='-'){
                        nums += two-one;
                        numsResult += nums;
                    }
                    if(sign=='*'){
                        nums += two*one;
                        numsResult += nums;
                    }
                    if(sign=='/'){
                        nums += two/(float)one;
                        numsResult += nums;
                    }
                    result.setText(numsResult);
                }

            }
        });
        //归零
        buttonReturnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums = "";
                numsTemp = "";
                result.setText("");
            }
        });
    }




}
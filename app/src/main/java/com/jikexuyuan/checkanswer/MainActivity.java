package com.jikexuyuan.checkanswer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    private Button btnSubmit;
    private RadioButton rbA, rbB;
    private CheckBox cb1, cb2,cb3,cb4,cb5,cb6;
    private TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        rbA = (RadioButton) findViewById(R.id.RbtnMale);
        rbB = (RadioButton) findViewById(R.id.RbtnFemale);
        cb1 = (CheckBox) findViewById(R.id.CB1);
        cb2 = (CheckBox) findViewById(R.id.CB2);
        cb3 = (CheckBox) findViewById(R.id.CB3);
        cb4 = (CheckBox) findViewById(R.id.CB4);
        cb5 = (CheckBox) findViewById(R.id.CB5);
        cb6 = (CheckBox) findViewById(R.id.CB6);
        resultText = (TextView) findViewById(R.id.ResultText);

        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);
        cb4.setOnCheckedChangeListener(this);
        cb5.setOnCheckedChangeListener(this);
        cb6.setOnCheckedChangeListener(this);

        // 设置单选默认值,防止空值出现
        rbA.setChecked(true);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //检查Radio Button的默认值
                if (rbA.isChecked()) {
                    resultText.setText("你选择的性别" + rbA.getText());
                }
                if (rbB.isChecked()) {
                    resultText.setText("你选择的性别" + rbB.getText());
                }

                //检查Check Box的默认值
                if (cb1.isChecked() && cb2.isChecked() && cb4.isChecked() && cb5.isChecked()){
                    resultText.append(", 多选题选择正确");
                }
                else{
                    resultText.append(", 多选题选择错误");
                }
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }
}

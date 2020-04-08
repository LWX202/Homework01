package cn.edu.sdwu.android.home.sn170507180220;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);
    }
    //跳转页面
    public void homework_1(View view){
        Intent intent=new Intent(this,homework1Activity.class);
        startActivity(intent);
    }
    public void homework_2(View view){
        Intent intent=new Intent(this,homework2Activity.class);
        startActivity(intent);
    }

}


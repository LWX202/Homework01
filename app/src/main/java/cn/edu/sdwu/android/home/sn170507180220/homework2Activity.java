package cn.edu.sdwu.android.home.sn170507180220;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class homework2Activity extends AppCompatActivity {
    private ArrayList list;
    private TextView textView;
    String content="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework2);
        list=new ArrayList();
        textView=(TextView) findViewById(R.id.hw_2_tv);


        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.hw2_2_11);
        int count=linearLayout.getChildCount();
        for(int i=0;i<count;i++){
            final View view=linearLayout.getChildAt(i);
            if(view instanceof CheckBox){
                final CheckBox checkBox=(CheckBox)view;
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            list.add(compoundButton);
                        }else{
                            list.remove(compoundButton);
                        }
                        String content="您选择了";
                        for(int t=0;t<list.size();t++){
                            CheckBox checkBox=(CheckBox) list.get(t);
                            String sel=checkBox.getText().toString();
                            content+=sel+",";
                        }
                        textView.setText(content);
                    }

                });
            }
        }
    }
    public void check(View view){
        Toast.makeText(this,content,Toast.LENGTH_LONG).show();
    }
}


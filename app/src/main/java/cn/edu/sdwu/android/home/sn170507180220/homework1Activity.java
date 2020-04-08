package cn.edu.sdwu.android.home.sn170507180220;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class homework1Activity extends AppCompatActivity {
    private TextView tv1;
    private EditText edt1,edt2;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载界面，不要写文件名称,使用资源ID
        setContentView(R.layout.layout_homework1);
        //内部匿名(+)
        btn=(Button)this.findViewById(R.id.btn);
        edt1=(EditText)this.findViewById(R.id.edit1);
        edt2=(EditText)this.findViewById(R.id.edit2);
        tv1=(TextView)this.findViewById(R.id.text1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText1=edt1.getText().toString();
                String inputText2=edt2.getText().toString();
                int num1=Integer.valueOf(inputText1).intValue();
                int num2=Integer.valueOf(inputText2).intValue();
                num1=num1+num2;
                inputText1=String.valueOf(num1);
                tv1.setText(inputText1);
            }
        });
        //内部类（-）
        Button button=(Button) findViewById(R.id.btn1);
        final EditText editText=(EditText)findViewById(R.id.edit1);
        final EditText editText1=(EditText)findViewById(R.id.edit2);
        final TextView textView=(TextView)findViewById(R.id.text1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText1=editText.getText().toString();
                String inputText2=editText1.getText().toString();
                int num1=Integer.valueOf(inputText1).intValue();
                int num2=Integer.valueOf(inputText2).intValue();
                num1=num1-num2;
                inputText1=String.valueOf(num1);
                textView.setText(inputText1);

            }
        });
        //直接实现（*）
        Button button1=(Button) findViewById(R.id.btn2);
        final EditText editText3=(EditText)findViewById(R.id.edit1);
        final EditText editText4=(EditText)findViewById(R.id.edit2);
        final TextView textView1=(TextView)findViewById(R.id.text1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText3=editText3.getText().toString();
                String inputText4=editText4.getText().toString();
                int num3=Integer.valueOf(inputText3).intValue();
                int num4=Integer.valueOf(inputText4).intValue();
                num3=num3*num4;
                inputText3=String.valueOf(num3);
                textView1.setText(inputText3);

            }
        });
    }
    //XML调用（/)
    public void doCount(View view){
        String str1=edt1.getText().toString();
        String str2=edt2.getText().toString();
        //转换成int
        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);
        int num3=num1/num2;
        //转换成String
        tv1.setText(num3+"");
    }
}

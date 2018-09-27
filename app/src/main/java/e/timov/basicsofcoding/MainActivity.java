package e.timov.basicsofcoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        final EditText value1 = this.findViewById(R.id.Number1);
        final EditText value2 = this.findViewById(R.id.Number2);

        Button button = findViewById(R.id.Plus);
        final TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String String1 =  value1.getText().toString();


                String String2 =  value2.getText().toString();

                final int number1 = Integer.parseInt(String1);
                final int number2 = Integer.parseInt(String2);

                final Calculator C = new Calculator();

                int result = C.Plus(number1, number2);
                textView.setText(String.valueOf(result));
            }
        });
    }








}





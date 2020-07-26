package com.hira.coopay.string;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    TextView submittedResult;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton=findViewById(R.id.submit_selection);
        submittedResult=findViewById(R.id.submitted_result);
        input=findViewById(R.id.input_value);

       final  String numbers[]={"Zero","One","Two","Three","Four","Five"};

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    final int numberOfBooksLiked= Integer.parseInt(input.getText().toString());
                    if(numberOfBooksLiked<6){
                        if(numberOfBooksLiked<2)
                        {
                            submittedResult.setText("You like "+ numbers[numberOfBooksLiked]+" book");
                        }
                        else
                            {
                            submittedResult.setText("You like "+ numbers[numberOfBooksLiked]+" books");
                        }
                    }
                    else{
                        submittedResult.setText("Only Five books in the list please inter 5 or less");
                    }
                }catch (Exception e){
                    submittedResult.setText("Please inter number ");
                }
            }
        });
    }
}
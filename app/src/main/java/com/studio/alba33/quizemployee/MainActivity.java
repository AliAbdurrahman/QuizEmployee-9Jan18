package com.studio.alba33.quizemployee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView dResult;
    EditText etName, etJob, etEmployer, etSalary;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hallo, : " + etName + etJob + etEmployer + etSalary);

        dResult = (TextView) findViewById(R.id.dResult);
        etName = (EditText)findViewById(R.id.etName);
        etJob = (EditText)findViewById(R.id.etJob);
        etEmployer = (EditText)findViewById(R.id.etEmployer);
        etSalary = (EditText)findViewById(R.id.etSalary);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Name = etName.getText().toString();
                String Job = etJob.getText().toString();
                String Employer = etEmployer.getText().toString();
                String Salary = etSalary.getText().toString();

                dResult.setText(Name + Job + Employer + Salary);

            }
        });
    }
}

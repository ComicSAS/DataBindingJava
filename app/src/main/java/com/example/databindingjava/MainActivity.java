package com.example.databindingjava;

import android.databinding.DataBindingUtil;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.databindingjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    TextInputEditText mEtName;
    TextInputEditText mEtSurname;
    TextInputEditText mEtAge;
    TextInputEditText mEtAnother;
    Button mBtnSubmit;

    View.OnClickListener onSubmitAction;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("https://avatanplus.com/files/effects/mid/5939ac7362ab215c8949a2cc.jpg",
                "Andrew", "Sukhovolskij", 21, "222");
        binding.setUser(user);
        initViews();
        bindListeners();
    }

    private void initViews() {
        mEtName = findViewById(R.id.etMainName);
        mEtSurname = findViewById(R.id.etMainSurname);
        mEtAge = findViewById(R.id.etMainAge);
        mEtAnother = findViewById(R.id.etMainAnother);
        mBtnSubmit = findViewById(R.id.btnMainSubmit);
    }

    private void initListeners() {
        onSubmitAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isAllValid(mEtName.getText().toString(), mEtSurname.getText()
                        .toString(), mEtAnother.getText().toString())) {
                    user.setName(mEtName.getText().toString());
                    user.setSurname(mEtSurname.getText().toString());
                    user.setAnother(mEtAnother.getText().toString());
                    user.setAge(mEtAge.getText().toString());
                    makeToast("onSubmitAction " + user.toString());
                } else
                    makeToast("onSubmitAction " + "Error: Wrong input data");
            }
        };
    }

    private void bindListeners() {
        initListeners();
        mBtnSubmit.setOnClickListener(onSubmitAction);
    }


    private boolean isValid(String string) {
        return string.length() > 2;
    }

    private boolean isAllValid(String s1, String s2, String s3) {
        return isValid(s1) && isValid(s2) && isValid(s3);
    }

    private void makeToast(String msg) {
        Toast.makeText(this, "Click " + msg, Toast.LENGTH_LONG).show();
    }
}

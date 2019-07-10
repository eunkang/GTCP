package com.zbqmal.gtcp_10.Police;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zbqmal.gtcp_10.Account.MyAccountActivity;
import com.zbqmal.gtcp_10.R;

public class PoliceHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_home);
    }

    public void goToMyAccountActivity(View view) {
        Intent intent = new Intent(this, MyAccountActivity.class);
        startActivity(intent);
    }
}

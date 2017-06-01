package io.github.shredktp.a62gitmanybranch;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String GIT_BRANCH_NAME = "feature v3";
    private static final String TAG = "MainActivity";

    TextView tvBranchName;
    TextView tvMoreString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupTitleName();

        tvBranchName = (TextView) findViewById(R.id.tv_branch_name);
        tvMoreString  = (TextView) findViewById(R.id.tv_more_string);

        String branchName = getString(R.string.tv_branch_name);
        tvBranchName.setText(branchName);
    }

    private void setupTitleName() {
        String titleName = getString(R.string.app_name) + ": " + GIT_BRANCH_NAME;
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            Log.i(TAG, "setupTitleName: Changed");
            actionBar.setTitle(titleName);
        } else {
            Log.i(TAG, "setupTitleName: null");
        }
    }
}

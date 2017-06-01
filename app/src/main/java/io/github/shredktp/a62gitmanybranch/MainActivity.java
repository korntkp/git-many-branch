package io.github.shredktp.a62gitmanybranch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvBranchName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBranchName = (TextView) findViewById(R.id.tv_branch_name);
        String branchName = getString(R.string.tv_branch_name);
        tvBranchName.setText(branchName);
    }
}

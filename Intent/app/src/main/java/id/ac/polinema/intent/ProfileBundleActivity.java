package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.Model.User;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here

        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Intent intent = getIntent();
        User parcelable = intent.getParcelableExtra("user");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here

            String username = extras.getString( "username");
            String name = extras.getString( "name");
            String age = String.valueOf(extras.getInt("age"));

            usernameText.setText(parcelable.getUsername());
            nameText.setText(parcelable.getName());
            ageText.setText(String.valueOf(parcelable.getAge()));

        }
    }
}

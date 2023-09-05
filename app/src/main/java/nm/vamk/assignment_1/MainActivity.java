package nm.vamk.assignment_1;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleText(View v) {
        EditText firstName = findViewById(R.id.editText_firstname);
        EditText surname = findViewById(R.id.editText_surname);
        EditText phoneNumber = findViewById(R.id.editText_phonenumber);
        EditText email = findViewById(R.id.editText_email);

        String firstNameString = firstName.getText().toString();
        String surnameString = surname.getText().toString();
        String phoneNumberString = phoneNumber.getText().toString();
        String emailString = email.getText().toString();

        String[] inputs = {firstNameString, surnameString, phoneNumberString, emailString};

        ((TextView)findViewById(R.id.editText_firstname)).setText("");
        ((TextView)findViewById(R.id.editText_surname)).setText("");
        ((TextView)findViewById(R.id.editText_phonenumber)).setText("");
        ((TextView)findViewById(R.id.editText_email)).setText("");

        for (int i = 0; i < inputs.length; i++) {
            Log.d("info", inputs[i]);
        }
    }
}
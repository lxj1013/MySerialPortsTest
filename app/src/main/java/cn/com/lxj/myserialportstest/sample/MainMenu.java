package cn.com.lxj.myserialportstest.sample;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cn.com.lxj.myserialportstest.sample.R;

public class MainMenu extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button buttonSetup = (Button)findViewById(R.id.ButtonSetup);
        buttonSetup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, SerialPortPreferences.class));
            }
        });

        final Button buttonConsole = (Button)findViewById(R.id.ButtonConsole);
        buttonConsole.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, ConsoleActivity.class));
            }
        });

        final Button buttonLoopback = (Button)findViewById(R.id.ButtonLoopback);
        buttonLoopback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, LoopbackActivity.class));
            }
        });

        final Button button01010101 = (Button)findViewById(R.id.Button01010101);
        button01010101.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainMenu.this, Sending01010101Activity.class));
            }
        });

        final Button buttonAbout = (Button)findViewById(R.id.ButtonAbout);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainMenu.this);
                builder.setTitle("About");
                builder.setMessage(R.string.about_msg);
                builder.show();
            }
        });

        final Button buttonQuit = (Button)findViewById(R.id.ButtonQuit);
        buttonQuit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainMenu.this.finish();
            }
        });
    }

}

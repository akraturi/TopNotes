package topnotes.nituk.com.topnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;

// Sohan create a splash of 4 sec which leads to the login activity

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        // Action bar is depricated from the splash
        getSupportActionBar().hide();

        int s=getIntent().getIntExtra("exit",0);
        if(s==1)
            finish();

        new CountDownTimer(1000,1000){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                //when thread is completed this method will be called
                Intent intent=new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        }.start();

    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;


public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the ' container' FrameLayout
        getSupportFragmentManager(). beginTransaction(). add(
                R.id.container, firstFragment). commit();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i( "This","Welcome to USTH Wheather");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i( "This","Welcome to Weather Prediction");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i( "This"," USTH Wheather");
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.i("This", "You dead");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("This", "You dead");
    }
}

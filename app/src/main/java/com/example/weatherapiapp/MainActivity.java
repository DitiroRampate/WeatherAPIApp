package com.example.weatherapiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button btn_CityID, btn_getWeatherByID, btn_getWeatherByName;
    EditText et_dataInput;
    ListView lv_weatherReports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assign values to each control in the layout
        btn_CityID = findViewById(R.id.btn_getCityID);
        btn_getWeatherByID = findViewById(R.id.getWeatherByCityID);
        btn_getWeatherByName = findViewById(R.id.getWeatherByCityName);

        et_dataInput = findViewById(R.id.et_dataInput);
        lv_weatherReports = findViewById(R.id.lv_weatherReports);

        //click listeners

        btn_CityID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                // Instantiate the RequestQueue.
                    RequestQueue queue = Volley.newRequestQueue(MainActivity.this);

//
//
            }
        });

        btn_getWeatherByID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherDataService weatherDataService = new WeatherDataService(MainActivity.this);
               String cityID = weatherDataService.getCityID(et_dataInput.getText().toString());
                Toast.makeText(MainActivity.this, "returned an ID of " + cityID, Toast.LENGTH_SHORT).show();
            }
        });

        btn_getWeatherByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you typed "+et_dataInput.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
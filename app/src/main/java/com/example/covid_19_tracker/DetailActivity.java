package com.example.covid_19_tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry,tvCases,tvRec,tvCrit,tvAct,tvTodCas,tvTotDea,tvTodDea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry= intent.getIntExtra("position", 0);

        getSupportActionBar().setTitle("Details of  "+ Affected_Countries.countryModelList.
                get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCountry=findViewById(R.id.tvCountry);
        tvCases=findViewById(R.id.tvCases);
        tvRec=findViewById(R.id.tvRecov);
        tvCrit=findViewById(R.id.tvCriticals);
        tvAct=findViewById(R.id.tvActiveCases);
        tvTodCas=findViewById(R.id.tvTodayCases);
        tvTotDea=findViewById(R.id.tvDeaths);
        tvTodDea=findViewById(R.id.tvTodDea);

        tvCountry.setText(Affected_Countries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(Affected_Countries.countryModelList.get(positionCountry).getCases());
        tvRec.setText(Affected_Countries.countryModelList.get(positionCountry).getRecovered());
        tvCrit.setText(Affected_Countries.countryModelList.get(positionCountry).getCritical());
        tvAct.setText(Affected_Countries.countryModelList.get(positionCountry).getActive());
        tvTodCas.setText(Affected_Countries.countryModelList.get(positionCountry).getTodayCases());
        tvTotDea.setText(Affected_Countries.countryModelList.get(positionCountry).getDeaths());
        tvTodDea.setText(Affected_Countries.countryModelList.get(positionCountry).getTodayDeaths());


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();


        return super.onOptionsItemSelected(item);
    }
}
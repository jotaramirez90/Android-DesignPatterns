package com.jota.patterns.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jota.patterns.adapter.activity.GridActivity;
import com.jota.patterns.adapter.activity.ListActivity;
import com.jota.patterns.adapter.activity.RecyclerActivity;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.listButton) public void onListClick() {
    Intent intentToLaunch = new Intent(this, ListActivity.class);
    startActivity(intentToLaunch);
  }

  @OnClick(R.id.gridButton) public void onGridClick() {
    Intent intentToLaunch = new Intent(this, GridActivity.class);
    startActivity(intentToLaunch);
  }

  @OnClick(R.id.recyclerButton) public void onRecyclerClick() {
    Intent intentToLaunch = new Intent(this, RecyclerActivity.class);
    startActivity(intentToLaunch);
  }
}

package com.jota.patterns.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jota.patterns.builder.builder.SedanBuilder;
import com.jota.patterns.builder.builder.SportBuilder;
import com.jota.patterns.builder.director.VehicleDirector;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.vehicleText) TextView mVehicleText;

  private VehicleDirector mVehicleDirector;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  private void showVehicle() {
    if (mVehicleDirector != null) {
      mVehicleText.setText(mVehicleDirector.getVehicle().getBrand());
    }
  }

  @OnClick(R.id.sedan_button) public void createSedanVehicle() {
    mVehicleDirector = new VehicleDirector(new SedanBuilder());
    mVehicleDirector.buildVehicle();
    showVehicle();
  }

  @OnClick(R.id.sport_button) public void createSportVehicle() {
    mVehicleDirector = new VehicleDirector(new SportBuilder());
    mVehicleDirector.buildVehicle();
    showVehicle();
  }
}

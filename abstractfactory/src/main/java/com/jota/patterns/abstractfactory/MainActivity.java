package com.jota.patterns.abstractfactory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jota.patterns.abstractfactory.factory.FactoryVehicle;
import com.jota.patterns.abstractfactory.factory.FactoryVehicleCountry;
import com.jota.patterns.abstractfactory.factory.FactoryVehicleRoad;
import com.jota.patterns.abstractfactory.model.Vehicle;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.description_text) TextView mDescriptionText;

  private FactoryVehicle mFactoryVehicle;
  private Vehicle mVehicle;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  private void showVehicle() {
    if (mVehicle != null) {
      mDescriptionText.setText(mVehicle.showDetails());
    }
  }

  @OnClick(R.id.road_car_button) public void createRoadCar() {
    mFactoryVehicle = new FactoryVehicleRoad();
    mVehicle = mFactoryVehicle.createCar();
    showVehicle();
  }

  @OnClick(R.id.country_car_button) public void createCountryCar() {
    mFactoryVehicle = new FactoryVehicleCountry();
    mVehicle = mFactoryVehicle.createCar();
    showVehicle();
  }

  @OnClick(R.id.road_moto_button) public void createRoadMotorbike() {
    mFactoryVehicle = new FactoryVehicleRoad();
    mVehicle = mFactoryVehicle.createMotorbike();
    showVehicle();
  }

  @OnClick(R.id.country_moto_button) public void createCountryMotorbike() {
    mFactoryVehicle = new FactoryVehicleCountry();
    mVehicle = mFactoryVehicle.createMotorbike();
    showVehicle();
  }
}

package com.jota.patterns.prototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jota.patterns.prototype.model.LCD;
import com.jota.patterns.prototype.model.LED;
import com.jota.patterns.prototype.model.Television;
import com.jota.patterns.prototype.prototype.TelevisionPrototype;

import static com.jota.patterns.prototype.prototype.TelevisionPrototype.TelevisionType.LCD;
import static com.jota.patterns.prototype.prototype.TelevisionPrototype.TelevisionType.LED;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.description_text) TextView mDescription;

  private TelevisionPrototype mPrototype;
  private Television mTelevision;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    mPrototype = new TelevisionPrototype();
  }

  private void showDetails() {
    if (mTelevision != null) {
      mDescription.setText(mTelevision.getBrand() + " " + mTelevision.getInches());
      mTelevision = null;
    } else {
      mDescription.setText("No cloned");
    }
  }

  @OnClick(R.id.add_lcd_button) public void addLCD() {
    LCD lcd = new LCD("Sony", 48, 499, 170);
    mPrototype.addPrototype(LCD, lcd);
    try {
      mTelevision = (Television) mPrototype.getPrototype(LCD);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    showDetails();
  }

  @OnClick(R.id.add_led_button) public void addLED() {
    LED led = new LED("Samsung", 50, 699, false);
    mPrototype.addPrototype(LED, led);
    try {
      mTelevision = (Television) mPrototype.getPrototype(LED);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    showDetails();
  }

  @OnClick(R.id.delete_lcd_button) public void deleteLCD() {
    mPrototype.deletePrototype(LCD);
    mDescription.setText("LCD deleted");
  }

  @OnClick(R.id.delete_led_button) public void deleteLED() {
    mPrototype.deletePrototype(LED);
    mDescription.setText("LED deleted");
  }

  @OnClick(R.id.clone_lcd_button) public void cloneLCD() {
    try {
      mTelevision = (Television) mPrototype.getPrototype(LCD);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    showDetails();
  }

  @OnClick(R.id.clone_led_button) public void cloneLED() {
    try {
      mTelevision = (Television) mPrototype.getPrototype(LED);
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    showDetails();
  }
}

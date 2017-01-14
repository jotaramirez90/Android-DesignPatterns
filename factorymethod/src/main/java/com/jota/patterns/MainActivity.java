package com.jota.patterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jota.patterns.factory.TriangleFactory;
import com.jota.patterns.factory.TriangleFactoryMethod;
import com.jota.patterns.model.Triangle;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.triangle_text) TextView mText;

  private TriangleFactoryMethod mFactory;
  private Triangle mTriangle;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    mFactory = new TriangleFactory();
  }

  private void showTriangle() {
    if (mTriangle != null) {
      mText.setText(mTriangle.getDescription());
    }
  }

  @OnClick(R.id.equilateral_button) public void createEquilateral() {
    mTriangle = mFactory.createTriangle(3, 3, 3);
    showTriangle();
  }

  @OnClick(R.id.isoceles_button) public void createIsosceles() {
    mTriangle = mFactory.createTriangle(3, 3, 4);
    showTriangle();
  }

  @OnClick(R.id.scalene_button) public void createScalene() {
    mTriangle = mFactory.createTriangle(3, 4, 5);
    showTriangle();
  }
}

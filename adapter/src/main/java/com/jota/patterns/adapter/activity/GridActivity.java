package com.jota.patterns.adapter.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jota.patterns.adapter.R;
import com.jota.patterns.adapter.adapter.GridAdapter;
import com.jota.patterns.adapter.model.ModelFactory;

public class GridActivity extends AppCompatActivity {

  @BindView(R.id.grid) GridView mGridView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_grid);
    ButterKnife.bind(this);

    GridAdapter gridAdapter = new GridAdapter(this, ModelFactory.getCities());
    mGridView.setAdapter(gridAdapter);
  }
}

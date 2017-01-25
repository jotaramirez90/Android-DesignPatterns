package com.jota.patterns.adapter.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jota.patterns.adapter.R;
import com.jota.patterns.adapter.adapter.RecyclerAdapter;
import com.jota.patterns.adapter.model.ModelFactory;

public class RecyclerActivity extends AppCompatActivity {

  @BindView(R.id.recycler) RecyclerView mRecycler;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recycler);
    ButterKnife.bind(this);

    RecyclerAdapter recyclerAdapter = new RecyclerAdapter(ModelFactory.getCities());
    mRecycler.setHasFixedSize(true);
    mRecycler.setLayoutManager(new LinearLayoutManager(this));
    mRecycler.setAdapter(recyclerAdapter);
  }
}

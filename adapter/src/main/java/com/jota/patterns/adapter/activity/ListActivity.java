package com.jota.patterns.adapter.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jota.patterns.adapter.R;
import com.jota.patterns.adapter.adapter.ListAdapter;
import com.jota.patterns.adapter.model.ModelFactory;

public class ListActivity extends AppCompatActivity {

  @BindView(R.id.list) ListView mListView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list);
    ButterKnife.bind(this);

    ListAdapter listAdapter = new ListAdapter(this, ModelFactory.getCities());
    mListView.setAdapter(listAdapter);
  }
}

package com.jota.patterns.adapter.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jota.patterns.adapter.R;
import com.jota.patterns.adapter.model.City;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

  private ArrayList<City> cities;

  public RecyclerAdapter(ArrayList<City> cities) {
    this.cities = cities;
  }

  @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city, parent, false);
    return new ViewHolder(view);
  }

  @Override public void onBindViewHolder(ViewHolder holder, int position) {
    City city = cities.get(position);
    holder.mNameCity.setText(city.getName());
    holder.mCountryCity.setText(city.getCountry());
  }

  @Override public int getItemCount() {
    return cities.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.nameCityText) TextView mNameCity;
    @BindView(R.id.countyCityText) TextView mCountryCity;

    public ViewHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }
  }
}

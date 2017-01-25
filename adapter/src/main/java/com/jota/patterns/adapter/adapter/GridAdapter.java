package com.jota.patterns.adapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jota.patterns.adapter.R;
import com.jota.patterns.adapter.model.City;
import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

  private Context mContext;
  private ArrayList<City> cities = new ArrayList<>();

  public GridAdapter(Context context, ArrayList<City> cities) {
    this.mContext = context;
    this.cities = cities;
  }

  @Override public View getView(int position, View view, ViewGroup viewGroup) {
    City city = getItem(position);
    ViewHolder viewHolder = null;
    if (view == null) {
      LayoutInflater inflater = LayoutInflater.from(mContext);
      view = inflater.inflate(R.layout.item_city, viewGroup, false);
      viewHolder = new ViewHolder(view);
      view.setTag(viewHolder);
    } else {
      viewHolder = (ViewHolder) view.getTag();
    }
    viewHolder.mNameCity.setText(city.getName());
    viewHolder.mCountryCity.setText(city.getName());

    return view;
  }

  @Override public int getCount() {
    return cities.size();
  }

  @Override public City getItem(int position) {
    return cities.get(position);
  }

  @Override public long getItemId(int position) {
    return 0;
  }

  static class ViewHolder {

    @BindView(R.id.nameCityText) TextView mNameCity;
    @BindView(R.id.countyCityText) TextView mCountryCity;

    public ViewHolder(View view) {
      ButterKnife.bind(this, view);
    }
  }
}

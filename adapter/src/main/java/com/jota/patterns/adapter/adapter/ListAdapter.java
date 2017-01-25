package com.jota.patterns.adapter.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jota.patterns.adapter.R;
import com.jota.patterns.adapter.model.City;
import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<City> {

  public ListAdapter(Context context, ArrayList<City> cities) {
    super(context, R.layout.item_city, cities);
  }

  @NonNull @Override public View getView(int position, View convertView, ViewGroup parent) {
    City city = getItem(position);
    ViewHolder viewHolder = null;
    if (convertView == null) {
      LayoutInflater inflater = LayoutInflater.from(getContext());
      convertView = inflater.inflate(R.layout.item_city, parent, false);
      viewHolder = new ViewHolder(convertView);
      convertView.setTag(viewHolder);
    } else {
      viewHolder = (ViewHolder) convertView.getTag();
    }
    viewHolder.mNameCity.setText(city.getName());
    viewHolder.mCountryCity.setText(city.getName());

    return convertView;
  }

  static class ViewHolder {

    @BindView(R.id.nameCityText) TextView mNameCity;
    @BindView(R.id.countyCityText) TextView mCountryCity;

    public ViewHolder(View view) {
      ButterKnife.bind(this, view);
    }
  }
}

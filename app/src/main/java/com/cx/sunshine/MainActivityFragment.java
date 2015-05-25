package com.cx.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sunny - 8/63",
                "Tomorrow - Foggy - 70/40",
                "Wednesday - Rainy - 72/63",
                "Thursday - Asteroids - 75/65",
                "Fri - Heavy Rain - 65/56",
                "Sat - Cloudy - 60/51",
                "Sun - Sunny - 80/687"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        ArrayAdapter<String> mForecastAdapter =
                new ArrayAdapter<String>(
                        getActivity(), //context
                        R.layout.list_item_forecast, //ID of list item layout
                        R.id.list_item_forecast_textview, //ID of text view
                        weekForecast //list of data
                );

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);

        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}

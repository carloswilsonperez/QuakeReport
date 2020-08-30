package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    /**
     * Constructs a new {@Link EarthquakeAdapter}.
     *
     * @param context of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given
     * position in the list of earthquakes.
     *
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        // Find the child text views by ID
        TextView magnitudeView = listItemView.findViewById(R.id.magnitude);
        TextView locationView = listItemView.findViewById(R.id.location);
        TextView dateView = listItemView.findViewById(R.id.date);

        // Set the corresponding values for the child views
        magnitudeView.setText(currentEarthquake.getMagnitude());
        locationView.setText(currentEarthquake.getLocation());
        dateView.setText(currentEarthquake.getTimeInMilliseconds().toString());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}

package com.example.andorid.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by SETIAWAN on 9/26/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**
     * Resource for color background
     */
    private final int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find list item text
        LinearLayout linearLayout = (LinearLayout) listItem.findViewById(R.id.list_item_text);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //set Background as resource
        linearLayout.setBackgroundColor(color);

        // Onclick listener on linearlayout
        //WordClickListener wordClickListener = new WordClickListener();
        //linearLayout.setOnClickListener(wordClickListener);

        // Find the TextView on list_item.xml layout with ID default_text
        TextView defaultTextView = (TextView) listItem.findViewById(R.id.default_text_view);
        // set TextView to default word
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the TextView on list_item.xml layout with ID miwok_text
        TextView miwokTextView = (TextView) listItem.findViewById(R.id.miwok_text_view);
        // set TextView to miwok word
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the ImageView on list_item.xml layout with ID image
        ImageView imageView = (ImageView) listItem.findViewById(R.id.miwok_image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());

            // Make sure image to Visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItem;

    }
}

package android.example.corfutourapp;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>  {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_view);
        nameTextView.setText(currentWord.getDefaultNameId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageResourceId());

        return listItemView;
    }
}

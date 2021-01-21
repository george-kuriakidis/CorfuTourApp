package android.example.corfutourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class PictureFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.historic_center), R.drawable.historic_center));
        words.add(new Word(getString(R.string.vlaherna), R.drawable.vlaherna_monastery));
        words.add(new Word(getString(R.string.barbati_view), R.drawable.sea_view_barbati));
        words.add(new Word(getString(R.string.corfu_town), R.drawable.corfu_town));

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}

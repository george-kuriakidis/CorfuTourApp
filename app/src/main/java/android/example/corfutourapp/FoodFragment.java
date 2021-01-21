package android.example.corfutourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.ayli), R.drawable.ayli_food));
        words.add(new Word(getString(R.string.tsantsamini), R.drawable.tsantsamini_food));
        words.add(new Word(getString(R.string.flisvos), R.drawable.flisbos));
        words.add(new Word(getString(R.string.nolita), R.drawable.nolita));
        words.add(new Word(getString(R.string.aegli), R.drawable.aegli_food));

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}

package android.example.corfutourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class sightFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.new_fortress), R.drawable.new_fortress));
        words.add(new Word(getString(R.string.old_fortress), R.drawable.old_fortress));
        words.add(new Word(getString(R.string.spianada), R.drawable.spianada_square));
        words.add(new Word(getString(R.string.achillion), R.drawable.achillion_palace));
        words.add(new Word(getString(R.string.casa), R.drawable.casa_parlante));

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}

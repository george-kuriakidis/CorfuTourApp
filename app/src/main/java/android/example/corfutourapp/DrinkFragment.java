package android.example.corfutourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class DrinkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(getString(R.string.imabari), R.drawable.imabari_drink));
        words.add(new Word(getString(R.string.tales), R.drawable.tales_drink));
        words.add(new Word(getString(R.string.piedra), R.drawable.piedra_drink));
        words.add(new Word(getString(R.string.sabbia), R.drawable.sabbia_drink));
        words.add(new Word(getString(R.string.sway), R.drawable.sway));

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}

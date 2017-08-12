package com.iblacksheep.nixonok.disasterawareness.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.widget.Toast;

import com.iblacksheep.nixonok.disasterawareness.R;


public class HomeFragment extends Fragment {

    String[] disasterName = new String[] { "Earthquake","Storm","Fire","Flood","Tsunami"};
    ListView list;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        list = (ListView) rootView.findViewById(R.id.disasterListView);
        list.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.my_custom_list_view, disasterName));



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view,
                                    int arg2, long arg3) {
                // TODO Auto-generated method stub

                    Intent intent = new Intent( view.getContext() , Main2Activity.class );
                    intent.putExtra("click_position", arg2);
                    startActivity(intent);


            }

        });
        // Inflate the layout for this fragment
        return rootView;
    }




    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
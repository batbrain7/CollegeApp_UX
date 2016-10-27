package sd_dtu.hollerandroid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;


public class MyCollege extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    int[] image_src = {R.drawable.sif,R.drawable.poster1};
    String[] events = {"Startup Fair","Ecell Fair"};
    String[] organs = {"SD DTU","IEE Dtu"};
    String[] date = {"29 October 2016","30 October 2016"};
    String[] time = {"9:41 am","10:41 am"};
    String[] venues = {"mait bla bla bla bla","bla dtu bla bla"};
    ArrayList<EventData> arrayList = new ArrayList<EventData>();

    public MyCollege() {
        // Required empty public constructor
    }

    public static MyCollege newInstance(String param1, String param2) {
        MyCollege fragment = new MyCollege();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my_college, container, false);
        int i = 0;
        for(String n : events)
        {
            EventData eventData = new EventData(image_src[i],events[i],venues[i],organs[i],date[i],time[i]);
            arrayList.add(eventData);
            i++;
        }
        recyclerView = (RecyclerView) v.findViewById(R.id.recycle1_view);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new EventRecyclerAdapter(arrayList,getActivity());
        recyclerView.setAdapter(adapter);
        return v;
    }

}

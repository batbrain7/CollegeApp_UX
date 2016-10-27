package sd_dtu.hollerandroid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AllCollege#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AllCollege extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<EventData> arrayList = new ArrayList<EventData>();
    int[] image_src = {R.drawable.demoimage,R.drawable.sif,R.drawable.poster1,R.drawable.demo1};
    String[] events = {"Nuclear Conference","Startup Fair","Ecell Fair","Tech. Week"};
    String[] organs = {"SD DTU","IEE Dtu","Mait bla","bpit bla"};
    String[] date = {"29 October 2016","30 October 2016","5 November 2016","8 November 2016"};
    String[] time = {"9:41 am","10:41 am","11:41 am","12:41 am"};
    String[] venues = {"mait bla bla bla bla","bla bla bla bla bla","bla dtu bla bla","nsit bla bla bla bla bla"};
    String[] univs = {"Delhi Technological University", "Netaji Subhash Institute of Technology","Maharaja Agarsen Institute of Technology(MAIT)","Bhagwan Parshuram Instutute of Technology(BPIT)"};

    public AllCollege() {
        // Required empty public constructor
    }

    public static AllCollege newInstance(String param1, String param2) {
        AllCollege fragment = new AllCollege();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_all_college, container, false);
        int i = 0;
        for(String n : events)
        {
            EventData eventData = new EventData(image_src[i],univs[i],n,venues[i],organs[i],date[i],time[i]);
            arrayList.add(eventData);
            i++;
        }
        recyclerView = (RecyclerView) v.findViewById(R.id.recycle2_view);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new EventRecyclerAdapter(arrayList,getActivity());
        recyclerView.setAdapter(adapter);
        return v;
    }

}

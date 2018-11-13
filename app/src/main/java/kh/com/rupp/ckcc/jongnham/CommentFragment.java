package kh.com.rupp.ckcc.jongnham;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CommentFragment extends Fragment {

    View v;
    private RecyclerView rvRecyclerView;
    private List<Comment> lstName;

    public CommentFragment() {

    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_comment, container, false);
        rvRecyclerView = v.findViewById(R.id.rvComment);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstName);
        rvRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvRecyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstName = new ArrayList<>();
        lstName.add(new Comment("Khvay Visarassy"));
        lstName.add(new Comment("Chana Chanmetha"));
        lstName.add(new Comment("Somba Bophachan"));
        lstName.add(new Comment("Metha Chivorney"));
        lstName.add(new Comment("Kitea Chanvibol"));
        lstName.add(new Comment("Moeun Sithameasy"));
        lstName.add(new Comment("Kitea Chanvibol"));
        lstName.add(new Comment("Metha Chivorney"));
        lstName.add(new Comment("Kitea Chanvibol"));
        lstName.add(new Comment("Moeun Sithameasy"));
        lstName.add(new Comment("Kitea Chanvibol"));
    }
}

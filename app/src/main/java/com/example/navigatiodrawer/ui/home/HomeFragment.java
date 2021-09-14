package com.example.navigatiodrawer.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigatiodrawer.R;
import com.example.navigatiodrawer.databinding.FragmentHomeBinding;
import com.example.navigatiodrawer.model.NoteModel;
import com.example.navigatiodrawer.ui.adapter.TaskAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    TaskAdapter taskadapter = new TaskAdapter();
    ArrayList<NoteModel> list = new ArrayList<>();
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        setupRecycler();
        getTitle();
        return binding.getRoot();
    }

    private void setupRecycler() {
        binding.recyclerView.setAdapter(taskadapter);
    }


    private void getTitle() {
        getParentFragmentManager().setFragmentResultListener("text", getViewLifecycleOwner(), (requestKey, result) -> {
            NoteModel model = (NoteModel) result.getSerializable("model");
            taskadapter.setList(model);
            Log.e("anime", "getTitle: " + model.getTitle());

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
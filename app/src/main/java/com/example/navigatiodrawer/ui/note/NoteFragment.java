package com.example.navigatiodrawer.ui.note;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigatiodrawer.R;
import com.example.navigatiodrawer.databinding.FragmentNoteBinding;
import com.example.navigatiodrawer.model.NoteModel;


public class NoteFragment extends Fragment {

    private FragmentNoteBinding binding;
    NoteModel model;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNoteBinding.inflate(getLayoutInflater(), container ,false);
        onClickButton();
        return binding.getRoot();
    }

    private void onClickButton() {

        binding.btnDone.setOnClickListener(view -> {
            String title = binding.noteEditText.getText().toString();
            Bundle bundle=new Bundle();
            model= new NoteModel(title);
            bundle.putSerializable( "model", model);
            getParentFragmentManager().setFragmentResult("text", bundle);
            NavController navController = Navigation.findNavController(requireActivity(), R.id.fragmentContainerView);

            navController.navigateUp();
        });
    }
}
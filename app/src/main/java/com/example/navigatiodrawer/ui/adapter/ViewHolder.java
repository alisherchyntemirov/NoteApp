package com.example.navigatiodrawer.ui.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigatiodrawer.databinding.ItemTaskBinding;
import com.example.navigatiodrawer.model.NoteModel;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ItemTaskBinding binding;

    public ViewHolder(@NonNull ItemTaskBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void onBind(NoteModel model) {
        binding.titleItem.setText(model.getTitle());
    }
}

package com.example.navigatiodrawer.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigatiodrawer.databinding.ItemTaskBinding;
import com.example.navigatiodrawer.model.NoteModel;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<NoteModel>list=new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.getContext()), parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
            }


    public void setList(NoteModel list) {
        this.list.add(list);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}

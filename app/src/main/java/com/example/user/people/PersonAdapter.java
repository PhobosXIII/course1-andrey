package com.example.user.people;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder>{
    private List<Person> people;
    private OnItemClickListener itemClickListener;

    public PersonAdapter(List<Person> people, OnItemClickListener itemClickListener) {
        this.people = people;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_person, viewGroup, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder personViewHolder, int position) {
        personViewHolder.bind(people.get(position), itemClickListener);
    }

    @Override
    public int getItemCount() {
        return people == null ? 0 : people.size();
    }

    public void add(Person person){
        people.add(person);
        notifyDataSetChanged();
    }

    public void update(List<Person> people){
        this.people.clear();
        this.people.addAll(people);
        notifyDataSetChanged();
    }

    public interface OnItemClickListener {
        void onItemClick(Person item);
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder{

        TextView tvName;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
        }

        public void bind(final Person person, final OnItemClickListener itemClickListener){
            itemView.setOnClickListener(v -> itemClickListener.onItemClick(person));
            tvName.setText(person.getName());
        }
    }

}

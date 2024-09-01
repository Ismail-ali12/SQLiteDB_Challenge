package com.example.sqlitedb_challenge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BookRecAdapter extends RecyclerView.Adapter<BookRecAdapter.ViewHolder> {

    private final Context context;
    private ArrayList<Book> books = new ArrayList<>();

    public BookRecAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_cardview, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int currentPos = position;
        holder.bookName.setText(books.get(currentPos).getName());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 27/08/2024 navigate to book ivew activity
            }
        });

        holder.cardView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                return false;
            }
        });
        Glide.with(context)
                .asBitmap()
                .load(books.get(currentPos).getImageUrl())
                .centerCrop()
                .into(holder.bookImage);

    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView bookName;
        private ImageView bookImage;
        private MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bookName = itemView.findViewById(R.id.bookName);
            bookImage = itemView.findViewById(R.id.bookImage);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}

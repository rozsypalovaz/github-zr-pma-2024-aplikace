package com.example.semestralniprojektpma;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapter extends FirebaseRecyclerAdapter<MainModel,MainAdapter.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel model) {
    holder.body.setText(model.getBody());
    holder.nazev.setText(model.getNazev());
    holder.popis.setText(model.getPopis());
    holder.kategorie.setText(model.getKategorie());
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.jednotliva_vyzva, parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView body, kategorie, nazev, popis;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            body = (TextView)itemView.findViewById(R.id.body);
            kategorie = (TextView)itemView.findViewById(R.id.kategorie);
            nazev = (TextView)itemView.findViewById(R.id.nazev);
            popis = (TextView)itemView.findViewById(R.id.popis);

        }
    }


}

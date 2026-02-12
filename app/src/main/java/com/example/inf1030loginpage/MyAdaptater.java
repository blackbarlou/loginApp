
package com.example.inf1030loginpage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inf1030loginpage.databinding.StudentBinding;

import java.util.ArrayList;
import java.util.List;

public class MyAdaptater extends RecyclerView.Adapter< MyAdaptater.StudentViewHolder > {
    private final Context context;
    private List<StudentDTO> data;

    public MyAdaptater(Context context) {
        this.context = context;
        this.data = new ArrayList<>();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setData(List<StudentDTO> data ){
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    /**
     *
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     *               an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return
     */
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        var binder = StudentBinding.inflate(LayoutInflater.from(context),
                parent,
                false);
        return new StudentViewHolder(binder);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaptater.StudentViewHolder holder, int position) {
        var student = data.get(position);
        holder.setStudent(student);

    }

    /**
     * methode override de RecyclerView
     * @return le nombre d'element dans la liste data
     */
    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder{

        private final StudentBinding binder;
        public StudentViewHolder(StudentBinding binder) {
            super(binder.getRoot());
            this.binder = binder;
        }

        public void setStudent(StudentDTO student) {
            binder.setItem(student);
        }
    }


}


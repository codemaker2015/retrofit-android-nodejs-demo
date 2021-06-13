package com.example.demo.retrofitdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import com.example.demo.retrofitdemo.R;
import com.example.demo.retrofitdemo.model.Book;

import java.util.List;

/**
 * Created by Codemaker on 12/06/2021.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<Book> dataList;
    private Context context;

    public CustomAdapter(Context context,List<Book> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView txtTitle, txtSubtitle, txtAuthor, txtWebsite;
        private ImageView coverImage;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtTitle = mView.findViewById(R.id.title);
            txtSubtitle = mView.findViewById(R.id.subtitle);
            txtAuthor = mView.findViewById(R.id.author);
            txtWebsite = mView.findViewById(R.id.website);
            coverImage = mView.findViewById(R.id.coverImage);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.txtTitle.setText(dataList.get(position).getTitle());
        holder.txtSubtitle.setText(dataList.get(position).getSubtitle());
        holder.txtAuthor.setText(dataList.get(position).getAuthor());
        holder.txtWebsite.setText(Html.fromHtml(dataList.get(position).getWebsite()));
        Linkify.addLinks(holder.txtWebsite, Linkify.WEB_URLS);
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(dataList.get(position).getThumbnail())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(holder.coverImage);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

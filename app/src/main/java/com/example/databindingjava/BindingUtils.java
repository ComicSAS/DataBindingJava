package com.example.databindingjava;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class BindingUtils {
    @BindingAdapter("uploadAvatar")
    public static void loadAvatar(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .into(view);
    }
}

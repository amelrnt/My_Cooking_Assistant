package com.ameliaR.mycookingassitant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.skydoves.transformationlayout.TransformationLayout;
import com.skydoves.transformationlayout.TransitionExtensionKt;

public class DetailActivity extends AppCompatActivity {
    private ImageView imageMakanan;
    private TextView tvnama;
    private TextView tvBahan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TransformationLayout.Params params = getIntent().getParcelableExtra("myTransitionName");
        TransitionExtensionKt.onTransformationEndContainer(this, params);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageMakanan = findViewById(R.id.image_detail);
        tvnama = findViewById(R.id.tv_nama_detail);
        tvBahan = findViewById(R.id.tv_bahan);

        Bundle extras = getIntent().getExtras();
        if (extras!=null){
            int foto = extras.getInt(MainActivity.FOTO_KEY);
            String nama = extras.getString(MainActivity.NAMA_KEY);
            String bahan = extras.getString(MainActivity.BAHAN_KEY);

            Glide.with(this)
                    .load(foto)
                    .into(imageMakanan);

            tvnama.setText(nama);
            tvBahan.setText(bahan);
        }

    }
}

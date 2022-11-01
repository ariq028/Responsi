package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfilePicActivity extends AppCompatActivity {

    private Button button;
    private CircleImageView gambar;
    private Uri ImageUri;
    private ImageButton buttonprofile;

    private static final int GALLERY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
        buttonprofile = findViewById(R.id.pinkCircle);
        gambar = findViewById(R.id.profilePic);



        buttonprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI), GALLERY_REQUEST_CODE);
            }
        });
    }

}
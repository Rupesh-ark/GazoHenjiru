package com.example.gazohenjiru.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gazohenjiru.R;
import com.example.gazohenjiru.Interface.Contract;
import com.example.gazohenjiru.models.ImageResourceModel;
import com.example.gazohenjiru.presenters.PreviewPresenter;

public class PreviewActivity extends AppCompatActivity implements Contract.PreviewViewInterface {


    final Button selectImgBtn = findViewById(R.id.selectButton);
    final Button cameraBtn = findViewById(R.id.cameraButton);
    Contract.PreviewPresenterInterface presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);





    }

    private void init(){

        presenter = new PreviewPresenter(this, new ImageResourceModel());

        selectImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onSelectPhotoBtnClick();
            }
        });

        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onTakePhotoBtnClick();
            }
        });
    }

    @Override
    public void loadImage() {

    }

    @Override
    public void captureImage() {

    }

    @Override
    public void loadEditView() {

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
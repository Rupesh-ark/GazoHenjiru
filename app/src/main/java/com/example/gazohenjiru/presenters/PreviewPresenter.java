package com.example.gazohenjiru.presenters;

import com.example.gazohenjiru.Interface.Contract;

public class PreviewPresenter implements Contract.PreviewPresenterInterface, Contract.ImageModelInterface.OnFinishedListener {

    private Contract.PreviewViewInterface previewView;
    private Contract.ImageModelInterface imageModel;

    public PreviewPresenter(Contract.PreviewViewInterface previewView, Contract.ImageModelInterface model)
    {
        this.imageModel = model;
        this.previewView = previewView;
    }

    @Override
    public void onTakePhotoBtnClick() {
            if(previewView != null) {

            }
    }

    @Override
    public void onSelectPhotoBtnClick() {
        if(previewView != null) {

        }
    }

    @Override
    public void onDestroy() {
        previewView = null;
    }

    @Override
    public void onFinished(String string) {
        if(imageModel != null){
            //previewView.se
        }

    }
}

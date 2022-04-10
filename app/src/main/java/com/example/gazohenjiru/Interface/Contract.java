package com.example.gazohenjiru.Interface;

public interface Contract {

    interface PreviewViewInterface {

        void loadImage();
        void captureImage();
        void loadEditView();

    }

    interface ImageModelInterface {

        interface OnFinishedListener{
            void onFinished(String string);
        }

    }

    interface PreviewPresenterInterface {
        void onTakePhotoBtnClick();
        void onSelectPhotoBtnClick();
        void onDestroy();
    }

}

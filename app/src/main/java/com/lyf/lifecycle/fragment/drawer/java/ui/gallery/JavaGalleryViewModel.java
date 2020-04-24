package com.lyf.lifecycle.fragment.drawer.java.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JavaGalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JavaGalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
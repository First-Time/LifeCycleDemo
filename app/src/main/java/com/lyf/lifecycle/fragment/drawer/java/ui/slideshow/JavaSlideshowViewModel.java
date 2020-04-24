package com.lyf.lifecycle.fragment.drawer.java.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JavaSlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JavaSlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
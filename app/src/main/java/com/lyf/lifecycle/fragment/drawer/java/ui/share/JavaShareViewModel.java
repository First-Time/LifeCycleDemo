package com.lyf.lifecycle.fragment.drawer.java.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JavaShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JavaShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
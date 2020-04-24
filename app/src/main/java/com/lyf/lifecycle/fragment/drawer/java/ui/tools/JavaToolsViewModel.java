package com.lyf.lifecycle.fragment.drawer.java.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JavaToolsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JavaToolsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
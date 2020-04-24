package com.lyf.lifecycle.fragment.drawer.java.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JavaSendViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JavaSendViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.lyf.lifecycle.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JavaNotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JavaNotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
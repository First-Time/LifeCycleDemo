package com.lyf.lifecycle.fragment.basic.java;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.lyf.lifecycle.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JavaFragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JavaFragment3 extends Fragment {
    private static final String TAG = JavaFragment3.class.getSimpleName();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public JavaFragment3() {
        // Required empty public constructor
        System.out.println(TAG + " onJavaFragment3");
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment JavaFragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static JavaFragment3 newInstance(String param1, String param2) {
        JavaFragment3 fragment = new JavaFragment3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println(TAG + " onAttach");
    }

    @Override
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attrs, @Nullable Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        System.out.println(TAG + " onInflate");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(TAG + " onCreate");
        if (savedInstanceState != null) {
            String params = savedInstanceState.getString("fragment3");
            System.out.println(TAG + " on " + params);
        }

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        System.out.println(TAG + " onCreateView");
        return inflater.inflate(R.layout.fragment_java_fragment3, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        System.out.println(TAG + " onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println(TAG + " onActivityCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        System.out.println(TAG + " onViewStateRestored");
        if (savedInstanceState != null) {
            String params = savedInstanceState.getString("fragment3");
            System.out.println(TAG + " on " + params);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println(TAG + " onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println(TAG + " onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println(TAG + " onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println(TAG + " onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println(TAG + " onDestroyView");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println(TAG + " onSaveInstanceState");
        outState.putString("fragment3", "fragment3");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println(TAG + " onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println(TAG + " onDetach");
    }
}

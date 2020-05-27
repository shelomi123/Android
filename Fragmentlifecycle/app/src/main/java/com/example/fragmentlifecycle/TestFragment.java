package com.example.fragmentlifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(Build.VERSION_CODES.KITKAT)
public class TestFragment extends Fragment {

    private void printLog(String s) {
// display a message in Log File
        Log.d("17020654", s);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        printLog("onActivityCreated Called");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_test, container, false);
        printLog("onCreateView Called");

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        printLog("onViewCreated Called");

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        printLog("onAttach Called");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printLog("onCreate Called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        printLog("onDestroy Called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        printLog("onDestroyView Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        printLog("onDetach Called");
    }

    @Override
    public void onPause() {
        super.onPause();
        printLog("onPause Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        printLog("onResume Called");
    }

    @Override
    public void onStart() {
        super.onStart();
        printLog("onStart Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        printLog("onStop Called");
    }

}
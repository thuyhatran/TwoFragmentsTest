package example.thuya.com.fragmenttest2_2fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by thuyha on 12/09/2016.
 */
public class Fragment_Two extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup containner, Bundle saveInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_two_layout, containner, false);
        return rootView;
    }

}

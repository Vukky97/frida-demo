package infosecadventures.fridademo.fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import infosecadventures.fridademo.R;
import infosecadventures.fridademo.utils.RootUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class RootBypass extends Fragment {


    public RootBypass() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_root_bypass, container, false);
        view.findViewById(R.id.root_check).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RootUtil.isRootAvailable()) {
                    new AlertDialog.Builder(getActivity())
                            .setTitle(getString(R.string.denied))
                            .setMessage(getString(R.string.fail_message))
                            .setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .show();
                } else {
                    new AlertDialog.Builder(getActivity())
                            .setTitle(getString(R.string.granted))
                            .setMessage(getString(R.string.success_message))
                            .setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .show();
                }
            }
        });
        return view;
    }
}

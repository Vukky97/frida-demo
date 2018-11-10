package infosecadventures.fridademo.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import infosecadventures.fridademo.R;
import infosecadventures.fridademo.utils.EncryptionUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class EncryptionKey extends Fragment {


    public EncryptionKey() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_encryption_key, container, false);
        final EditText plain = view.findViewById(R.id.plain);
        final EditText cipher = view.findViewById(R.id.cipher);
        view.findViewById(R.id.encrypt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cipher.setText("");
                if (!plain.getText().toString().isEmpty()) {
                    cipher.setText(EncryptionUtil.encprypt(getString(R.string.key), plain.getText().toString()));
                } else {
                    Toast.makeText(getContext(), getString(R.string.no_plaintext), Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

}

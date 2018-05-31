package com.example.c4q.passionproject.MVPController;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.example.c4q.passionproject.R;


/**
 * Created by c4q on 5/8/18.
 */

public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.alertDialog).setTitle(context.getString(R.string.welcome_message));

        AlertDialog dialog = builder.create();
        dialog.setInverseBackgroundForced(true);
        return dialog;
    }
}

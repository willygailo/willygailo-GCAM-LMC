package com.longtap.framezsl;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import com.Helper;
import com.SDE.LensValue;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: renamed from: com.longtap.framezsl.switch, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public class Cswitch {
    Cswitch() {
    }

    public static void setLongClickListener(View view, Context context) {
        view.setOnLongClickListener(new View.OnLongClickListener(context) { // from class: com.longtap.framezsl.switch.1
            private final Context this$0;

            {
                this.this$0 = context;
            }

            public int getKeyValue(String str) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.this$0);
                if (defaultSharedPreferences.contains(str)) {
                    return Integer.parseInt(defaultSharedPreferences.getString(str, null));
                }
                return 0;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                AlertDialog.Builder title;
                int keyValue;
                DialogInterface.OnClickListener onClickListener;
                int i;
                Context context2 = this.this$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(context2);
                if (Helper.sFront != 0) {
                    title = builder.setTitle("ZSL Frames Front active lens");
                    keyValue = getKeyValue("pref_zsl_frames_key_front");
                    onClickListener = new DialogInterface.OnClickListener(context2) { // from class: com.longtap.framezsl.switch.2
                        private final Context this$0;

                        {
                            this.this$0 = context2;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) throws InterruptedException {
                            Context context3 = this.this$0;
                            AlertDialog alertDialog = (AlertDialog) dialogInterface;
                            PreferenceManager.getDefaultSharedPreferences(context3).edit().putString(Helper.sFront != 0 ? "pref_zsl_frames_key_front" : LensValue.SetLensValue1("pref_zsl_frames_key"), new StringBuffer().append(alertDialog.getListView().getCheckedItemPosition()).toString()).apply();
                            alertDialog.dismiss();
                            Helper.onRestart();
                        }
                    };
                    i = R.array.pref_frames_fix_entries;
                } else {
                    title = builder.setTitle("ZSL Frames Back active lens");
                    keyValue = getKeyValue(LensValue.SetLensValue("pref_zsl_frames_key"));
                    onClickListener = new DialogInterface.OnClickListener(context2) { // from class: com.longtap.framezsl.switch.2
                        private final Context this$0;

                        {
                            this.this$0 = context2;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) throws InterruptedException {
                            Context context3 = this.this$0;
                            AlertDialog alertDialog = (AlertDialog) dialogInterface;
                            PreferenceManager.getDefaultSharedPreferences(context3).edit().putString(Helper.sFront != 0 ? "pref_zsl_frames_key_front" : LensValue.SetLensValue1("pref_zsl_frames_key"), new StringBuffer().append(alertDialog.getListView().getCheckedItemPosition()).toString()).apply();
                            alertDialog.dismiss();
                            Helper.onRestart();
                        }
                    };
                    i = R.array.pref_frames_fix_entries;
                }
                title.setSingleChoiceItems(i, keyValue, onClickListener).setNegativeButton(context2.getString(R.string.cancel_button), (DialogInterface.OnClickListener) null).show();
                return true;
            }
        });
    }
}

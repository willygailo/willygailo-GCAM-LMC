package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.preference.Preference;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.apps.camera.bottombar.BottomBar;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public class dzr2 implements Preference.OnPreferenceClickListener {
    private final /* synthetic */ Activity a;

    dzr2(Activity activity) {
        this.a = activity;
    }

    public static void CrtFolder(String str) {
        File file = new File(Environment.getExternalStorageDirectory() + str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void c(Context context, String str, String str2) {
        String message;
        CrtFolder(str2);
        File shpXML = BottomBar.getShpXML();
        File file = new File(Environment.getExternalStorageDirectory(), "/Android/Data/" + context.getPackageName() + "/files/" + str);
        try {
            FileChannel channel = new FileInputStream(shpXML).getChannel();
            FileChannel channel2 = new FileOutputStream(file).getChannel();
            channel2.transferFrom(channel, 0L, channel.size());
            channel.close();
            channel2.close();
            message = "Save";
        } catch (FileNotFoundException e) {
            message = e.getMessage();
        } catch (IOException e2) {
            message = e2.getMessage();
        }
        Toast.makeText(context, message, 0).show();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
        context.startActivity(Intent.createChooser(intent, "Share via"));
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        Activity activity = this.a;
        EditText editText = new EditText(activity);
        editText.setHint("");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle("Enter config name").setView(editText).setPositiveButton("Okay", new DialogInterface.OnClickListener(this.a, editText) { // from class: dzr2.1
            Activity a;
            EditText ent_name;

            {
                this.a = activity;
                this.ent_name = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dzr2.c(this.a, this.ent_name.getText().toString() + ".xml", "/Android/Data/" + this.a.getPackageName() + "/files/");
            }
        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.getWindow().setSoftInputMode(4);
        alertDialogCreate.show();
        alertDialogCreate.setCancelable(false);
        return true;
    }
}

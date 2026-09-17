package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Environment;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.widget.EditText;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public class xxx implements Preference.OnPreferenceClickListener {
    private final Activity a;

    public xxx(Activity activity) {
        this.a = activity;
    }

    public static void CrtFolder(String str) {
        File file = new File(Environment.getExternalStorageDirectory() + str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public final String Base64decode(String str) {
        return new String(Base64.decode(str, 0));
    }

    public final String Base64encode(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    public final void createFolderConfig(String str) {
        File file = new File(Environment.getExternalStorageDirectory() + str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public final File getFileSharedPreferences() {
        File file = new File((this.a.getFilesDir().getAbsolutePath() + File.separator).replace("files/", "") + "shared_prefs" + File.separator + PreferenceManager.getDefaultSharedPreferencesName(this.a) + ".xml");
        if (file.isDirectory()) {
            file.delete();
        }
        return file;
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        Activity activity = this.a;
        EditText editText = new EditText(activity);
        editText.setHint(".xml");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle("Do you want to save configs?").setView(editText).setPositiveButton("Yes", new yot(this, editText)).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.getWindow().setSoftInputMode(4);
        alertDialogCreate.show();
        alertDialogCreate.setCancelable(false);
        return true;
    }

    public final void saveSharedPreferences(String str) {
        String message;
        createFolderConfig("/LMC8.4/");
        File fileSharedPreferences = getFileSharedPreferences();
        File file = new File(Environment.getExternalStorageDirectory(), "/LMC8.4/" + str);
        try {
            FileChannel channel = new FileInputStream(fileSharedPreferences).getChannel();
            FileChannel channel2 = new FileOutputStream(file).getChannel();
            channel2.transferFrom(channel, 0L, channel.size());
            channel.close();
            channel2.close();
            message = "Saved config is : " + str;
        } catch (FileNotFoundException e) {
            message = e.getMessage();
        } catch (IOException e2) {
            message = e2.getMessage();
        }
        Toast.makeText(this.a, message, 0).show();
    }
}

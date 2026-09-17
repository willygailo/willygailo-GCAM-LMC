package com.google.android.apps.camera.bottombar;

import android.app.AlertDialog;
import android.app.AppGlobals;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import com.Fix.Pref;
import com.Helper;
import com.mycompany.myapp40.MainActivity$100000001;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class DLock$GestureListener extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ BottomBar this$0;

    private DLock$GestureListener(BottomBar bottomBar) {
        this.this$0 = bottomBar;
    }

    /* synthetic */ DLock$GestureListener(BottomBar bottomBar, DLock$GestureListener dLock$GestureListener) {
        this(bottomBar);
    }

    private void a() {
        BottomBar bottomBar = this.this$0;
        final File file = new File(Environment.getExternalStorageDirectory() + "/LMC8.4/");
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles(new FileFilter());
            if (0 < fileArrListFiles.length) {
                Arrays.sort(fileArrListFiles, new MainActivity$100000001());
                final String[] fileNames = getFileNames(fileArrListFiles);
                if (0 < fileNames.length) {
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(bottomBar.appContext, getDialogTheme());
                    ArrayAdapter arrayAdapter = new ArrayAdapter(contextThemeWrapper, android.R.layout.simple_spinner_dropdown_item, fileNames);
                    arrayAdapter.setDropDownViewResource(com.google.android.GoogleCameraEngR18F1.R.layout.support_simple_spinner_dropdown_item);
                    final Spinner spinner = new Spinner(contextThemeWrapper);
                    spinner.setPopupBackgroundResource(com.google.android.GoogleCameraEngR18F1.R.color.google_white);
                    spinner.setAdapter((SpinnerAdapter) arrayAdapter);
                    AlertDialog.Builder builder = new AlertDialog.Builder(contextThemeWrapper);
                    BottomBar bottomBar2 = this.this$0;
                    String cfg = getCfg(contextThemeWrapper);
                    if (!contextThemeWrapper.getSharedPreferences("settings", 0).contains("installed_config")) {
                        cfg = "[*] Default config";
                    }
                    builder.setTitle(cfg).setView(spinner).setPositiveButton("Import", new DialogInterface.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.DLock$GestureListener.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            DLock$GestureListener.this.b(file, fileNames, spinner, dialogInterface, i);
                        }
                    }).setNegativeButton("Quit", (DialogInterface.OnClickListener) null).setNeutralButton("Delete", new DialogInterface.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.DLock$GestureListener.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            DLock$GestureListener.this.a(file, fileNames, spinner, dialogInterface, i);
                        }
                    }).show().setCancelable(false);
                    return;
                }
            }
        }
        Toast.makeText(bottomBar.appContext, "Configs not found", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, String[] strArr, Spinner spinner, DialogInterface dialogInterface, int i) {
        try {
            b(file + File.separator + strArr[spinner.getSelectedItemPosition()]);
        } catch (Exception e) {
        }
    }

    private void a(String str) {
        try {
            copyFile(str, getFileSharedPreferences().getPath());
            Helper.onRestart();
        } catch (SecurityException e) {
            Toast.makeText(this.this$0.appContext, "Permission is required to access the memory!", 0).show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(File file, String[] strArr, Spinner spinner, DialogInterface dialogInterface, int i) {
        try {
            a(file + File.separator + strArr[spinner.getSelectedItemPosition()]);
        } catch (Exception e) {
        }
    }

    private void b(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static String getCfg(Context context) {
        return ("☑️" + ((Object) context.getSharedPreferences("settings", 0).getString("installed_config", null))).replace("/storage/emulated/0/LMC8.4/", "");
    }

    public static String getCfgFileName(String str) {
        Application initialApplication = AppGlobals.getInitialApplication();
        Context applicationContext = initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        if (applicationContext.getSharedPreferences("settings", 0).contains("installed_config")) {
            String strReplace = applicationContext.getSharedPreferences("settings", 0).getString("installed_config", null).replace("/storage/emulated/0/LMC8.4/", "");
            str = str.replace("lmc_8.4", strReplace).replace("PANO", strReplace).replace("lmc_8.4", strReplace).replace("MVIMG", strReplace);
        }
        return Pref.MenuValue("without_xml_prefix") == 0 ? str.replace(".xml", "") : str;
    }

    public static int getDialogTheme() {
        Application initialApplication = AppGlobals.getInitialApplication();
        return PreferenceManager.getDefaultSharedPreferences(initialApplication.createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext()).getBoolean("cfg_dialog_dark", false) ? android.R.style.Theme.Material.Dialog : android.R.style.Theme.Material.Light.Dialog;
    }

    public static String[] getFileNames(File[] fileArr) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (fileArr.length == 0) {
            arrayList = (ArrayList) null;
        } else {
            for (File file : fileArr) {
                arrayList2.add(file.getName());
            }
            arrayList = arrayList2;
        }
        return (String[]) arrayList2.toArray(new String[arrayList.size()]);
    }

    public final void apply(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("pref_config_show", true).apply();
    }

    public final void copyFile(String str, String str2) {
        try {
            File file = new File(str);
            File file2 = new File(str2);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    this.this$0.appContext.getSharedPreferences("settings", 0).edit().putString("installed_config", str).apply();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final File getFileSharedPreferences() {
        File file = new File((this.this$0.appContext.getFilesDir().getAbsolutePath() + File.separator).replace("files/", "") + "shared_prefs" + File.separator + PreferenceManager.getDefaultSharedPreferencesName(this.this$0.appContext) + ".xml");
        if (file.isDirectory()) {
            file.delete();
        }
        return file;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.this$0.isDoubleClick || jCurrentTimeMillis - this.this$0.lastTouchUpTime >= 500) {
            this.this$0.lastTouchUpTime = jCurrentTimeMillis;
            this.this$0.isDoubleClick = false;
            return false;
        }
        this.this$0.isDoubleClick = true;
        this.this$0.lastTouchUpTime = jCurrentTimeMillis;
        a();
        return true;
    }
}

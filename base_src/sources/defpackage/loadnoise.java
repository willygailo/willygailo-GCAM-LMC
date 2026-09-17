package defpackage;

import android.app.Activity;
import android.os.Environment;
import android.preference.Preference;
import com.Helper;
import com.gcam.simple.filechooser.ChooserDialog;
import com.google.common.io.ByteStreams;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class loadnoise implements Preference.OnPreferenceClickListener {
    private final /* synthetic */ Activity a;

    loadnoise(Activity activity) {
        this.a = activity;
    }

    private void a(String str) throws IOException {
        processFile(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, File file) throws IOException {
        a(str);
    }

    private void copyFile(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = file2.isDirectory() ? new FileOutputStream(file2.getAbsolutePath() + "/" + file.getName()) : new FileOutputStream(file2);
        try {
            try {
                ByteStreams.copy(fileInputStream, fileOutputStream);
                Helper.ShowToastDirect("The noise modeler file is imported.");
                fileOutputStream.close();
            } catch (IOException e) {
                throw new IOException(new StringBuffer().append("Import Lib failed. From file: ").append(file.getAbsoluteFile()).append(" to file: ").append(file2.getAbsoluteFile()).toString());
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    private void processFile(String str) throws IOException {
        String ext = getExt(str);
        File file = new File(str);
        StringBuilder sbAppend = new StringBuilder().append(Environment.getExternalStorageDirectory());
        xxx.CrtFolder("/LMC8.4/NOISE MODELER/");
        File file2 = new File(sbAppend.append("/LMC8.4/NOISE MODELER/").toString());
        if (ext != null) {
            if (ext.equals("c")) {
                copyFile(file, file2);
            } else {
                unzip(file, file2);
            }
        }
    }

    private void unzip(File file, File file2) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    Helper.ShowToastDirect("The noise modeler file is imported.");
                    return;
                }
                File file3 = new File(file2, nextEntry.getName());
                File parentFile = nextEntry.isDirectory() ? file3 : file3.getParentFile();
                if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                    throw new FileNotFoundException(new StringBuffer().append("Failed to ensure directory: ").append(parentFile.getAbsolutePath()).toString());
                }
                if (!nextEntry.isDirectory()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    while (true) {
                        try {
                            int i = zipInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                fileOutputStream.write(bArr, 0, i);
                            }
                        } catch (Throwable th) {
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                }
            }
        } catch (Throwable th2) {
            zipInputStream.close();
            throw th2;
        }
    }

    public String getExt(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf > 0) {
            return str.substring(iLastIndexOf + 1).toLowerCase();
        }
        return null;
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        new ChooserDialog().with(this.a).withFilterRegex(false, false, ".*\\.(c)").withStartFile(Environment.getExternalStorageDirectory().getPath()).withChosenListener(new ChooserDialog.Result() { // from class: loadnoise.1
            @Override // com.gcam.simple.filechooser.ChooserDialog.Result
            public final void onChoosePath(String str, File file) throws IOException {
                loadnoise.this.a(str, file);
            }
        }).build().show();
        return true;
    }
}

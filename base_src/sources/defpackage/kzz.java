package defpackage;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kzz extends BackupAgentHelper {
    public static void c(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        if (!(obj instanceof Set)) {
            String strValueOf = String.valueOf(obj != null ? obj.getClass() : null);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69 + String.valueOf(strValueOf).length());
            sb.append("Skipping restore of key ");
            sb.append(str);
            sb.append(" because its value is the unrecognized type ");
            sb.append(strValueOf);
            sb.append(".");
            Log.w("PersistentBackupAgentHe", sb.toString());
            return;
        }
        Set<String> set = (Set) obj;
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                String strValueOf2 = String.valueOf(obj != null ? obj.getClass() : null);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 82 + String.valueOf(strValueOf2).length());
                sb2.append("Skipping restore of key ");
                sb2.append(str);
                sb2.append(" because its value is a set containing an object of type ");
                sb2.append(strValueOf2);
                sb2.append(".");
                Log.w("PersistentBackupAgentHe", sb2.toString());
                return;
            }
        }
        editor.putStringSet(str, set);
    }

    public static boolean d(String str) {
        return (str.contains(File.separator) || str.contains("/") || "persistent_backup_agent_helper".equals(str)) ? false : true;
    }

    private final void e() {
        getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }

    protected abstract Map a();

    protected final SharedPreferences b(String str) {
        return getSharedPreferences(str, 0);
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        Map mapA = a();
        SharedPreferences.Editor editorEdit = getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        editorEdit.clear();
        for (Map.Entry entry : ((oor) mapA).entrySet()) {
            String str = (String) entry.getKey();
            if (!d(str)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
                sb.append("Unsupported shared preferences file name \"");
                sb.append(str);
                sb.append("\"");
                throw new IllegalArgumentException(sb.toString());
            }
            for (Map.Entry<String, ?> entry2 : b(str).getAll().entrySet()) {
                String key = entry2.getKey();
                Object value = entry2.getValue();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(key).length());
                sb2.append(str);
                sb2.append("/");
                sb2.append(key);
                c(editorEdit, sb2.toString(), value);
            }
        }
        editorEdit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        e();
    }

    @Override // android.app.backup.BackupAgent
    public final void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_backup_agent_helper", 0);
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            int iIndexOf = key.indexOf("/");
            if (iIndexOf < 0 || iIndexOf >= key.length() - 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 57);
                sb.append("Format of key \"");
                sb.append(key);
                sb.append("\" not understood, so skipping its restore.");
                Log.w("PersistentBackupAgentHe", sb.toString());
            } else {
                String strSubstring = key.substring(0, iIndexOf);
                String strSubstring2 = key.substring(iIndexOf + 1);
                SharedPreferences.Editor editorEdit = (SharedPreferences.Editor) map.get(strSubstring);
                if (editorEdit == null) {
                    if (d(strSubstring)) {
                        editorEdit = b(strSubstring).edit();
                        map.put(strSubstring, editorEdit);
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + 52);
                        sb2.append("Skipping unsupported shared preferences file name \"");
                        sb2.append(strSubstring);
                        sb2.append("\"");
                        Log.w("PersistentBackupAgentHe", sb2.toString());
                    }
                }
                c(editorEdit, strSubstring2, value);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
        map.keySet();
        e();
    }
}

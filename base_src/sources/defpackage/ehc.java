package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ehc {
    private static final ouj b = ouj.h("com/google/android/apps/camera/imax/ImaxDataset");
    public final String a;
    private final File c;
    private final iki d;

    public ehc(Context context, iki ikiVar, kme kmeVar, Set set, byte[] bArr) {
        String strB = kmeVar.b(System.currentTimeMillis());
        File file = new File(context.getCacheDir(), "datasets");
        File file2 = new File(file, strB);
        synchronized (set) {
            set.add(file2.toString());
        }
        if (!file.exists()) {
            file.mkdir();
        }
        if (!file2.mkdirs()) {
            ((oug) ((oug) b.b()).G((char) 1158)).o("Failed to create directory");
        }
        this.c = file2;
        this.a = file2.getName();
        this.d = ikiVar;
    }

    public final String a() {
        String parent = this.c.getParent();
        String str = File.separator;
        String name = this.c.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(parent).length() + String.valueOf(str).length() + String.valueOf(name).length());
        sb.append(parent);
        sb.append(str);
        sb.append(name);
        return sb.toString();
    }

    public final String b() {
        String strA = a();
        String str = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 11 + String.valueOf(str).length());
        sb.append(strA);
        sb.append(str);
        sb.append("capture.mp4");
        return sb.toString();
    }

    public final void c() {
        String strValueOf = String.valueOf(this.d.a());
        String str = File.separator;
        String str2 = this.a;
        String.valueOf(strValueOf).length();
        String.valueOf(str).length();
        String.valueOf(str2).length();
    }
}

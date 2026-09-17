package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public enum deq {
    INSTANCE;

    private final File c = new File("/sys/fs/selinux/enforce");

    static ghb b() throws Throwable {
        InputStreamReader inputStreamReader = null;
        ghb ghbVar = new ghb(null);
        deq deqVar = INSTANCE;
        ghbVar.a = deqVar.a();
        boolean z = true;
        try {
            try {
                if (deqVar.a()) {
                    try {
                        InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(deqVar.c));
                        try {
                            if (((char) inputStreamReader2.read()) == '1') {
                                inputStreamReader2.close();
                            } else {
                                inputStreamReader2.close();
                                z = false;
                            }
                        } catch (FileNotFoundException e) {
                            inputStreamReader = inputStreamReader2;
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            ghbVar.b = z;
                            return ghbVar;
                        } catch (IOException e2) {
                            inputStreamReader = inputStreamReader2;
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            } else {
                                z = false;
                            }
                            ghbVar.b = z;
                            return ghbVar;
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader = inputStreamReader2;
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (IOException e3) {
                                }
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e4) {
                    } catch (IOException e5) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    z = false;
                }
            } catch (IOException e6) {
            }
        } catch (IOException e7) {
        }
        ghbVar.b = z;
        return ghbVar;
    }

    final boolean a() {
        return this.c.exists();
    }
}

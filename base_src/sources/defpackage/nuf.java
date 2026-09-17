package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class nuf {
    public static final ovk a = ovk.h("RxUploadClient");

    public static final String a(pvg pvgVar) throws IOException {
        InputStream inputStream = pvgVar.c;
        inputStream.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, qou.a), 8192);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = bufferedReader.read(cArr); i >= 0; i = bufferedReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            string.getClass();
            qmd.a(bufferedReader, null);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                qmd.a(bufferedReader, th);
                throw th2;
            }
        }
    }
}

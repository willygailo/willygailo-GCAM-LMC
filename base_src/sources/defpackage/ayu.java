package defpackage;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ayu implements Closeable {
    public final File a;
    public Writer c;
    public int d;
    private final File f;
    private final File g;
    private final File h;
    private final long j;
    private long k = 0;
    private final LinkedHashMap l = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor e = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ayq());
    private final Callable n = new ayp(this);
    private final int i = 1;
    public final int b = 1;

    private ayu(File file, long j) {
        this.a = file;
        this.f = new File(file, "journal");
        this.g = new File(file, "journal.tmp");
        this.h = new File(file, "journal.bkp");
        this.j = j;
    }

    public static ayu g(File file, long j) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                n(file2, file3, false);
            }
        }
        ayu ayuVar = new ayu(file, j);
        if (ayuVar.f.exists()) {
            try {
                ayuVar.m();
                k(ayuVar.g);
                Iterator it = ayuVar.l.values().iterator();
                while (it.hasNext()) {
                    ays aysVar = (ays) it.next();
                    if (aysVar.f == null) {
                        for (int i = 0; i < ayuVar.b; i = 1) {
                            ayuVar.k += aysVar.b[0];
                        }
                    } else {
                        aysVar.f = null;
                        for (int i2 = 0; i2 < ayuVar.b; i2 = 1) {
                            k(aysVar.c());
                            k(aysVar.d());
                        }
                        it.remove();
                    }
                }
                return ayuVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                String strValueOf = String.valueOf(file);
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36 + String.valueOf(message).length());
                sb.append("DiskLruCache ");
                sb.append(strValueOf);
                sb.append(" is corrupt: ");
                sb.append(message);
                sb.append(", removing");
                printStream.println(sb.toString());
                ayuVar.close();
                ayx.b(ayuVar.a);
            }
        }
        file.mkdirs();
        ayu ayuVar2 = new ayu(file, j);
        ayuVar2.c();
        return ayuVar2;
    }

    private final void i() {
        if (this.c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void j(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void k(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void l(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:68:0x012d A[Catch: EOFException -> 0x013b, all -> 0x01ba, TryCatch #0 {EOFException -> 0x013b, blocks: (B:15:0x0057, B:18:0x0065, B:20:0x0071, B:22:0x007b, B:23:0x007e, B:21:0x0076, B:24:0x007f, B:26:0x0088, B:28:0x008e, B:30:0x0096, B:65:0x011d, B:33:0x00a3, B:35:0x00ad, B:39:0x00bd, B:41:0x00c5, B:44:0x00df, B:46:0x00e2, B:49:0x00f0, B:50:0x00f4, B:51:0x00f5, B:52:0x00f9, B:56:0x00ff, B:58:0x0107, B:62:0x0114, B:66:0x0121, B:68:0x012d, B:70:0x0137, B:71:0x013a, B:69:0x0132, B:32:0x009f), top: B:85:0x0057, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0132 A[Catch: EOFException -> 0x013b, all -> 0x01ba, TryCatch #0 {EOFException -> 0x013b, blocks: (B:15:0x0057, B:18:0x0065, B:20:0x0071, B:22:0x007b, B:23:0x007e, B:21:0x0076, B:24:0x007f, B:26:0x0088, B:28:0x008e, B:30:0x0096, B:65:0x011d, B:33:0x00a3, B:35:0x00ad, B:39:0x00bd, B:41:0x00c5, B:44:0x00df, B:46:0x00e2, B:49:0x00f0, B:50:0x00f4, B:51:0x00f5, B:52:0x00f9, B:56:0x00ff, B:58:0x0107, B:62:0x0114, B:66:0x0121, B:68:0x012d, B:70:0x0137, B:71:0x013a, B:69:0x0132, B:32:0x009f), top: B:85:0x0057, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final void m() {
        String strSubstring;
        String strValueOf;
        String str;
        ayw aywVar = new ayw(new FileInputStream(this.f), ayx.a);
        try {
            String strA = aywVar.a();
            String strA2 = aywVar.a();
            String strA3 = aywVar.a();
            String strA4 = aywVar.a();
            String strA5 = aywVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.i).equals(strA3) || !Integer.toString(this.b).equals(strA4) || !"".equals(strA5)) {
                StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 35 + String.valueOf(strA2).length() + String.valueOf(strA4).length() + String.valueOf(strA5).length());
                sb.append("unexpected journal header: [");
                sb.append(strA);
                sb.append(", ");
                sb.append(strA2);
                sb.append(", ");
                sb.append(strA4);
                sb.append(", ");
                sb.append(strA5);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            int i = 0;
            while (true) {
                try {
                    String strA6 = aywVar.a();
                    int iIndexOf = strA6.indexOf(32);
                    if (iIndexOf == -1) {
                        String strValueOf2 = String.valueOf(strA6);
                        throw new IOException(strValueOf2.length() != 0 ? "unexpected journal line: ".concat(strValueOf2) : new String("unexpected journal line: "));
                    }
                    int i2 = iIndexOf + 1;
                    int iIndexOf2 = strA6.indexOf(32, i2);
                    if (iIndexOf2 == -1) {
                        strSubstring = strA6.substring(i2);
                        if (iIndexOf == 6) {
                            if (strA6.startsWith("REMOVE")) {
                                this.l.remove(strSubstring);
                            } else {
                                iIndexOf = 6;
                            }
                        }
                        i++;
                    } else {
                        strSubstring = strA6.substring(i2, iIndexOf2);
                    }
                    ays aysVar = (ays) this.l.get(strSubstring);
                    if (aysVar == null) {
                        aysVar = new ays(this, strSubstring);
                        this.l.put(strSubstring, aysVar);
                    }
                    if (iIndexOf2 == -1 || iIndexOf != 5) {
                        if (iIndexOf2 == -1 || iIndexOf != 5 || !strA6.startsWith("DIRTY")) {
                            if (iIndexOf2 != -1 && iIndexOf == 4 && strA6.startsWith("READ")) {
                            }
                            strValueOf = String.valueOf(strA6);
                            if (strValueOf.length() != 0) {
                                str = "unexpected journal line: ".concat(strValueOf);
                            } else {
                                str = new String("unexpected journal line: ");
                            }
                            throw new IOException(str);
                        }
                        aysVar.f = new ayr(this, aysVar);
                    } else {
                        if (!strA6.startsWith("CLEAN")) {
                            iIndexOf = 5;
                            if (iIndexOf2 == -1) {
                                if (iIndexOf2 != -1) {
                                }
                                strValueOf = String.valueOf(strA6);
                                if (strValueOf.length() != 0) {
                                    str = "unexpected journal line: ".concat(strValueOf);
                                } else {
                                    str = new String("unexpected journal line: ");
                                }
                                throw new IOException(str);
                            }
                            if (iIndexOf2 != -1) {
                            }
                            strValueOf = String.valueOf(strA6);
                            if (strValueOf.length() != 0) {
                                str = "unexpected journal line: ".concat(strValueOf);
                            } else {
                                str = new String("unexpected journal line: ");
                            }
                            throw new IOException(str);
                        }
                        String[] strArrSplit = strA6.substring(iIndexOf2 + 1).split(" ");
                        aysVar.e = true;
                        aysVar.f = null;
                        if (strArrSplit.length != aysVar.g.b) {
                            throw ays.e(strArrSplit);
                        }
                        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                            try {
                                aysVar.b[i3] = Long.parseLong(strArrSplit[i3]);
                            } catch (NumberFormatException e) {
                                throw ays.e(strArrSplit);
                            }
                        }
                    }
                    i++;
                } catch (EOFException e2) {
                    this.d = i - this.l.size();
                    if (aywVar.b == -1) {
                        c();
                    } else {
                        this.c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), ayx.a));
                    }
                    ayx.a(aywVar);
                    return;
                }
            }
        } catch (Throwable th) {
            ayx.a(aywVar);
            throw th;
        }
    }

    private static void n(File file, File file2, boolean z) throws IOException {
        if (z) {
            k(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized ayt a(String str) {
        i();
        ays aysVar = (ays) this.l.get(str);
        if (aysVar != null && aysVar.e) {
            File[] fileArr = aysVar.c;
            int length = fileArr.length;
            for (int i = 0; i < length; i = 1) {
                if (!fileArr[0].exists()) {
                    return null;
                }
            }
            this.d++;
            this.c.append((CharSequence) "READ");
            this.c.append(' ');
            this.c.append((CharSequence) str);
            this.c.append('\n');
            if (e()) {
                this.e.submit(this.n);
            }
            return new ayt(aysVar.c);
        }
        return null;
    }

    public final synchronized void b(ayr ayrVar, boolean z) {
        int i;
        ays aysVar = ayrVar.a;
        if (aysVar.f != ayrVar) {
            throw new IllegalStateException();
        }
        if (!z || aysVar.e) {
            i = 0;
        } else {
            for (int i2 = 0; i2 < this.b; i2 = 1) {
                if (!ayrVar.b[0]) {
                    ayrVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!aysVar.d().exists()) {
                    ayrVar.a();
                    return;
                }
            }
            i = 0;
        }
        while (i < this.b) {
            File fileD = aysVar.d();
            if (z) {
                if (fileD.exists()) {
                    File fileC = aysVar.c();
                    fileD.renameTo(fileC);
                    long j = aysVar.b[0];
                    long length = fileC.length();
                    aysVar.b[0] = length;
                    this.k = (this.k - j) + length;
                }
                i = 1;
            } else {
                k(fileD);
                i = 1;
            }
        }
        this.d++;
        aysVar.f = null;
        if (aysVar.e || z) {
            aysVar.e = true;
            this.c.append((CharSequence) "CLEAN");
            this.c.append(' ');
            this.c.append((CharSequence) aysVar.a);
            this.c.append((CharSequence) aysVar.a());
            this.c.append('\n');
            if (z) {
                this.m++;
            }
        } else {
            this.l.remove(aysVar.a);
            this.c.append((CharSequence) "REMOVE");
            this.c.append(' ');
            this.c.append((CharSequence) aysVar.a);
            this.c.append('\n');
        }
        l(this.c);
        if (this.k > this.j || e()) {
            this.e.submit(this.n);
        }
    }

    public final synchronized void c() {
        try {
            Writer writer = this.c;
            if (writer != null) {
                j(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), ayx.a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.i));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.b));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (ays aysVar : this.l.values()) {
                    if (aysVar.f != null) {
                        String str = aysVar.a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                        sb.append("DIRTY ");
                        sb.append(str);
                        sb.append('\n');
                        bufferedWriter.write(sb.toString());
                    } else {
                        String str2 = aysVar.a;
                        String strA = aysVar.a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(strA).length());
                        sb2.append("CLEAN ");
                        sb2.append(str2);
                        sb2.append(strA);
                        sb2.append('\n');
                        bufferedWriter.write(sb2.toString());
                    }
                }
                j(bufferedWriter);
                if (this.f.exists()) {
                    n(this.f, this.h, true);
                }
                n(this.g, this.f, false);
                this.h.delete();
                this.c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), ayx.a));
            } catch (Throwable th) {
                j(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.l.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ayr ayrVar = ((ays) arrayList.get(i)).f;
            if (ayrVar != null) {
                ayrVar.a();
            }
        }
        d();
        j(this.c);
        this.c = null;
    }

    public final void d() {
        while (this.k > this.j) {
            h((String) ((Map.Entry) this.l.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean e() {
        int i = this.d;
        return i >= 2000 && i >= this.l.size();
    }

    public final synchronized ayr f(String str) {
        i();
        ays aysVar = (ays) this.l.get(str);
        if (aysVar == null) {
            aysVar = new ays(this, str);
            this.l.put(str, aysVar);
        } else if (aysVar.f != null) {
            return null;
        }
        ayr ayrVar = new ayr(this, aysVar);
        aysVar.f = ayrVar;
        this.c.append((CharSequence) "DIRTY");
        this.c.append(' ');
        this.c.append((CharSequence) str);
        this.c.append('\n');
        l(this.c);
        return ayrVar;
    }

    public final synchronized void h(String str) {
        i();
        ays aysVar = (ays) this.l.get(str);
        if (aysVar == null || aysVar.f != null) {
            return;
        }
        for (int i = 0; i < this.b; i = 1) {
            File fileC = aysVar.c();
            if (fileC.exists() && !fileC.delete()) {
                String strValueOf = String.valueOf(fileC);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
                sb.append("failed to delete ");
                sb.append(strValueOf);
                throw new IOException(sb.toString());
            }
            long j = this.k;
            long[] jArr = aysVar.b;
            this.k = j - jArr[0];
            jArr[0] = 0;
        }
        this.d++;
        this.c.append((CharSequence) "REMOVE");
        this.c.append(' ');
        this.c.append((CharSequence) str);
        this.c.append('\n');
        this.l.remove(str);
        if (e()) {
            this.e.submit(this.n);
        }
    }
}

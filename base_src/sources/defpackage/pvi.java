package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pvi implements pvn {
    public final HttpURLConnection a;
    public final pvd b;
    public final byte[] c;
    public long d;
    public int e = -1;
    public int f = 0;
    public int g;
    public plk h;

    public pvi(HttpURLConnection httpURLConnection, String str, pvf pvfVar, pvd pvdVar) {
        this.a = httpURLConnection;
        try {
            httpURLConnection.setRequestMethod(str);
            httpURLConnection.setReadTimeout(300000);
            httpURLConnection.setConnectTimeout(300000);
            httpURLConnection.setDoInput(true);
            this.b = pvdVar;
            httpURLConnection.setDoOutput(true);
            if (pvdVar.d() >= 0) {
                long jD = pvdVar.d() - pvdVar.c();
                if (jD < 2147483647L) {
                    httpURLConnection.setFixedLengthStreamingMode((int) jD);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode(jD);
                }
            } else {
                httpURLConnection.setChunkedStreamingMode(0);
            }
            for (String str2 : pvfVar.c()) {
                Iterator it = pvfVar.b(str2).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty(str2, (String) it.next());
                }
            }
            this.g = 1;
            this.c = new byte[65536];
        } catch (ProtocolException e) {
            throw new IllegalArgumentException("Invalid http method.", e);
        }
    }

    @Override // defpackage.pvn
    public final long a() {
        throw null;
    }

    public final pvg b() throws pvp {
        InputStream errorStream;
        pvf pvfVar;
        d();
        try {
            int responseCode = this.a.getResponseCode();
            try {
                errorStream = this.a.getInputStream();
            } catch (IOException e) {
                errorStream = this.a.getErrorStream();
            }
            Map<String, List<String>> headerFields = this.a.getHeaderFields();
            if (headerFields != null) {
                pvfVar = new pvf();
                for (String str : headerFields.keySet()) {
                    if (str != null) {
                        Iterator<String> it = headerFields.get(str).iterator();
                        while (it.hasNext()) {
                            pvfVar.d(str, it.next());
                        }
                    }
                }
            } else {
                pvfVar = null;
            }
            return new pvg(responseCode, pvfVar, errorStream);
        } catch (IOException e2) {
            throw new pvp(pvo.CONNECTION_ERROR, "Error while reading response code.", e2);
        }
    }

    @Override // defpackage.pvn
    public final String c() {
        throw null;
    }

    public final synchronized void d() {
        int i;
        while (true) {
            i = this.g;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }
        if (i == 3) {
            throw new pvp(pvo.CANCELED, "");
        }
        obr.ap(i == 1);
    }

    @Override // defpackage.pvn
    public final synchronized void e() {
        throw null;
    }

    public final boolean f() throws pvp {
        try {
            return this.b.g();
        } catch (IOException e) {
            throw new pvp(pvo.REQUEST_BODY_READ_ERROR, e);
        }
    }

    @Override // defpackage.pvn
    public final synchronized void g(plk plkVar, int i, int i2) {
        this.h = plkVar;
        if (i > 0) {
            this.e = i;
        }
        this.f = i2;
    }
}

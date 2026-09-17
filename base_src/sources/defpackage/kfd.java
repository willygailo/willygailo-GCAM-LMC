package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import j$.net.URLEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class kfd extends kdu {
    public static final byte[] a = "\n".getBytes();
    public final kfm c;
    private final String d;

    public kfd(kdx kdxVar) {
        super(kdxVar);
        String str = kdv.a;
        String str2 = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String string = null;
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    sb.append("-");
                    sb.append(locale.getCountry().toLowerCase(locale));
                }
                string = sb.toString();
            }
        }
        this.d = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", str, str2, string, Build.MODEL, Build.ID);
        this.c = new kfm();
    }

    private static final void I(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    final HttpURLConnection C(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(((Integer) keu.u.a()).intValue());
        httpURLConnection.setReadTimeout(((Integer) keu.v.a()).intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.d);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    public final URL D() {
        String strF = ken.f();
        String str = (String) keu.l.a();
        try {
            return new URL(str.length() != 0 ? strF.concat(str) : new String(strF));
        } catch (MalformedURLException e) {
            o("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final URL E(kex kexVar) {
        String strConcat;
        if (kexVar.d) {
            String strF = ken.f();
            String strG = ken.g();
            strConcat = strG.length() != 0 ? strF.concat(strG) : new String(strF);
        } else {
            String strH = ken.h();
            String strG2 = ken.g();
            strConcat = strG2.length() != 0 ? strH.concat(strG2) : new String(strH);
        }
        try {
            return new URL(strConcat);
        } catch (MalformedURLException e) {
            o("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final URL F(kex kexVar, String str) {
        String string;
        if (kexVar.d) {
            String strF = ken.f();
            String strG = ken.g();
            int length = strF.length();
            StringBuilder sb = new StringBuilder(length + 1 + strG.length() + str.length());
            sb.append(strF);
            sb.append(strG);
            sb.append("?");
            sb.append(str);
            string = sb.toString();
        } else {
            String strH = ken.h();
            String strG2 = ken.g();
            int length2 = strH.length();
            StringBuilder sb2 = new StringBuilder(length2 + 1 + strG2.length() + str.length());
            sb2.append(strH);
            sb2.append(strG2);
            sb2.append("?");
            sb2.append(str);
            string = sb2.toString();
        }
        try {
            return new URL(string);
        } catch (MalformedURLException e) {
            o("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final void G(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        o("Error closing http connection input stream", e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        o("Error closing http connection input stream", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public final boolean H() {
        NetworkInfo activeNetworkInfo;
        kdo.a();
        z();
        try {
            activeNetworkInfo = ((ConnectivityManager) d().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        q("No network connectivity");
        return false;
    }

    @Override // defpackage.kdu
    protected final void a() {
        r("Network initialized. User agent", this.d);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[SYNTHETIC] */
    public final int b(URL url, byte[] bArr) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnectionC;
        IOException e;
        OutputStream outputStream;
        mip.dk(bArr);
        int length = bArr.length;
        super.w(3, "POST bytes, url", Integer.valueOf(length), url, null);
        x();
        OutputStream outputStream2 = null;
        outputStream2 = null;
        outputStream2 = null;
        HttpURLConnection httpURLConnection = null;
        try {
            d().getPackageName();
            httpURLConnectionC = C(url);
            try {
                httpURLConnectionC.setDoOutput(true);
                httpURLConnectionC.setFixedLengthStreamingMode(length);
                httpURLConnectionC.connect();
                outputStream2 = httpURLConnectionC.getOutputStream();
                outputStream2.write(bArr);
                G(httpURLConnectionC);
                int responseCode = httpURLConnectionC.getResponseCode();
                if (responseCode == 200) {
                    f().c();
                    responseCode = 200;
                }
                m("POST status", Integer.valueOf(responseCode));
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e2) {
                        o("Error closing http post connection output stream", e2);
                    }
                }
                if (httpURLConnectionC != null) {
                    httpURLConnectionC.disconnect();
                }
                return responseCode;
            } catch (IOException e3) {
                e = e3;
                OutputStream outputStream3 = outputStream2;
                httpURLConnection = httpURLConnectionC;
                outputStream = outputStream3;
                try {
                    u("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            o("Error closing http post connection output stream", e4);
                        }
                    }
                    if (httpURLConnection == null) {
                        return 0;
                    }
                    httpURLConnection.disconnect();
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    HttpURLConnection httpURLConnection2 = httpURLConnection;
                    outputStream2 = outputStream;
                    httpURLConnectionC = httpURLConnection2;
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException e5) {
                            o("Error closing http post connection output stream", e5);
                        }
                    }
                    if (httpURLConnectionC != null) {
                        throw th;
                    }
                    httpURLConnectionC.disconnect();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
                if (httpURLConnectionC != null) {
                    throw th;
                }
                httpURLConnectionC.disconnect();
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnectionC = null;
        }
    }

    final String c(kex kexVar, boolean z) {
        long j;
        mip.dk(kexVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : kexVar.a.entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    I(sb, str, (String) entry.getValue());
                }
            }
            I(sb, "ht", String.valueOf(kexVar.c));
            I(sb, "qt", String.valueOf(System.currentTimeMillis() - kexVar.c));
            if (z) {
                mip.ds("_s");
                mip.dm(true, "Short param name required");
                String str2 = (String) kexVar.a.get("_s");
                try {
                    j = Long.parseLong(str2 != null ? str2 : "0");
                } catch (NumberFormatException e) {
                    j = 0;
                }
                I(sb, "z", j != 0 ? String.valueOf(j) : String.valueOf(kexVar.b));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            o("Failed to encode name or value", e2);
            return null;
        }
    }
}

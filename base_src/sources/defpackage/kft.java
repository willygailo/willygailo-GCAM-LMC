package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class kft implements Runnable {
    private static final knw a = new knw("RevokeAccessOperation");
    private final String b;
    private final klf c;

    public kft(String str) {
        mip.ds(str);
        this.b = str;
        this.c = new klf(null);
    }

    public static kip a(String str) {
        if (str != null) {
            kft kftVar = new kft(str);
            new Thread(kftVar).start();
            return kftVar.c;
        }
        Status status = new Status(4);
        mip.dm(!status.b(), "Status code must not be SUCCESS");
        kiq kiqVar = new kiq(status);
        kiqVar.j(status);
        return kiqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.c;
        try {
            String str = this.b;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(str) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.a;
            } else {
                a.c("Unable to revoke access!");
            }
            try {
                knw knwVar = a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Response Code: ");
                sb.append(responseCode);
                knwVar.b(sb.toString());
            } catch (IOException e) {
                e = e;
                knw knwVar2 = a;
                String strValueOf = String.valueOf(e.toString());
                knwVar2.c(strValueOf.length() != 0 ? "IOException when revoking access: ".concat(strValueOf) : new String("IOException when revoking access: "));
            } catch (Exception e2) {
                e = e2;
                knw knwVar3 = a;
                String strValueOf2 = String.valueOf(e.toString());
                knwVar3.c(strValueOf2.length() != 0 ? "Exception when revoking access: ".concat(strValueOf2) : new String("Exception when revoking access: "));
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
        this.c.j(status);
    }
}

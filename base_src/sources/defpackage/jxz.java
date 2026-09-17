package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class jxz {
    private static final Duration d = Duration.ofSeconds(1);
    public final lis b;
    public final kij c;
    private final Executor e;
    private final kij g;
    private final kij h;
    public String a = null;
    private final Executor f = Executors.newSingleThreadExecutor();

    public jxz(Executor executor, lis lisVar, kij kijVar, kij kijVar2, kij kijVar3) {
        this.e = executor;
        this.b = lisVar.a("WearMessageUtil");
        this.c = kijVar;
        this.g = kijVar2;
        this.h = kijVar3;
    }

    private final Set f() {
        pih pihVarF = pih.f();
        kim kimVar = this.g.j;
        mip.dl(true);
        kxc kxcVar = new kxc(kimVar);
        kimVar.b(kxcVar);
        mip.dv(kxcVar, kyv.b).g(this.f, new jxw(this, pihVarF, 1));
        try {
            return (Set) pihVarF.get(d.getSeconds(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.b.i("Failed to getNodesByCapabilitySync.", e);
            return null;
        }
    }

    public final String a() {
        Set<kyz> setF = f();
        String str = null;
        if (setF == null || setF.isEmpty()) {
            this.b.b("findBestNode failed!");
            return null;
        }
        for (kyz kyzVar : setF) {
            lis lisVar = this.b;
            String strValueOf = String.valueOf(kyzVar.a);
            lisVar.b(strValueOf.length() != 0 ? "Check node: ".concat(strValueOf) : new String("Check node: "));
            if (!TextUtils.isEmpty(kyzVar.a)) {
                str = kyzVar.a;
                if (kyzVar.d) {
                    break;
                }
            }
        }
        lis lisVar2 = this.b;
        String strValueOf2 = String.valueOf(str);
        lisVar2.b(strValueOf2.length() != 0 ? "Found node: ".concat(strValueOf2) : new String("Found node: "));
        return str;
    }

    public final void b(final String str, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: jxy
            @Override // java.lang.Runnable
            public final void run() {
                jxz jxzVar = this.a;
                String str2 = str;
                Runnable runnable2 = runnable;
                try {
                    jxzVar.a = jxzVar.a();
                    String str3 = jxzVar.a;
                    if (TextUtils.isEmpty(str3)) {
                        jxzVar.b.h("sendMessageAsync failed because can't find node!");
                        if (runnable2 == null) {
                        }
                    } else {
                        jxzVar.e(str3, str2, null);
                        if (runnable2 == null) {
                        }
                    }
                } finally {
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }
        });
    }

    public final boolean c() {
        pih pihVarF = pih.f();
        kim kimVar = this.h.j;
        kyx kyxVar = new kyx(kimVar);
        kimVar.b(kyxVar);
        mip.dv(kyxVar, kyv.c).g(this.f, new jxw(this, pihVarF, 0));
        try {
            return ((Boolean) pihVarF.get(d.getSeconds(), TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.b.i("Failed to process isWearDeviceExistSync.", e);
            return false;
        }
    }

    public final void d(String str, byte[] bArr) {
        if (TextUtils.isEmpty(this.a)) {
            this.a = a();
        }
        String str2 = this.a;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        e(str2, str, bArr);
    }

    final void e(String str, final String str2, byte[] bArr) {
        final pih pihVarF = pih.f();
        kim kimVar = this.c.j;
        kyr kyrVar = new kyr(kimVar, str, str2, bArr);
        kimVar.b(kyrVar);
        mip.dv(kyrVar, kyv.a).g(this.e, new kvc() { // from class: jxx
            @Override // defpackage.kvc
            public final void a(kvk kvkVar) {
                jxz jxzVar = this.a;
                pih pihVar = pihVarF;
                String str3 = str2;
                try {
                    pihVar.o((Integer) kvkVar.c());
                } catch (kvj e) {
                    lis lisVar = jxzVar.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 34);
                    sb.append("Message:");
                    sb.append(str3);
                    sb.append(" sent fail with exception ");
                    lisVar.i(sb.toString(), e);
                    pihVar.o(null);
                }
            }
        });
        lis lisVar = this.b;
        String strValueOf = String.valueOf(pihVarF);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 15 + String.valueOf(strValueOf).length());
        sb.append("Message:");
        sb.append(str2);
        sb.append(" sent: ");
        sb.append(strValueOf);
        lisVar.b(sb.toString());
        try {
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.b.i("Failed to sendMessage.", e);
        }
    }
}

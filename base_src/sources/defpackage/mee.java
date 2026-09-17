package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class mee {
    public static final mee a = new mee();
    private final Object b = new Object();
    private final med[] c;
    private volatile meh d;

    private mee() {
        int[] iArrA = psg.a();
        int iMax = 0;
        for (int i = 0; i < 29; i++) {
            int i2 = iArrA[i];
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            iMax = Math.max(iMax, i3);
        }
        this.c = new med[iMax + 1];
        int[] iArrA2 = psg.a();
        for (int i4 = 0; i4 < 29; i4++) {
            int i5 = iArrA2[i4];
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            switch (i6) {
                case 12:
                case 13:
                case 14:
                case 15:
                case 17:
                case 19:
                case 20:
                case 21:
                case 27:
                    this.c[i6] = new med();
                    this.c[i6].a = oom.l();
                    break;
            }
        }
    }

    public final mec a(int i, mdo mdoVar) {
        int i2 = i - 1;
        int i3 = 0;
        switch (i2) {
            case 0:
                return mdy.a;
            case 1:
                return mdy.b;
            case 2:
                if (mdoVar.c) {
                    try {
                        Account[] accountsByType = AccountManager.get(mdoVar.a).getAccountsByType("com.google");
                        int length = accountsByType.length;
                        while (i3 < length) {
                            Account account = accountsByType[i3];
                            if (account.name != null && account.type != null && account.name.endsWith("@google.com")) {
                                return mdy.b;
                            }
                            i3++;
                        }
                    } catch (SecurityException e) {
                    }
                }
                if (this.d == null) {
                    synchronized (this.b) {
                        if (this.d == null) {
                            meg megVar = new meg();
                            Context applicationContext = mdoVar.a.getApplicationContext();
                            applicationContext.getClass();
                            megVar.a = applicationContext;
                            qmd.ad(megVar.a, Context.class);
                            this.d = new meh(megVar.a);
                        }
                        break;
                    }
                }
                return (mek) this.d.c.get();
            case 3:
                mei meiVar = new mei();
                meiVar.a = mdoVar;
                qmd.ad(meiVar.a, mdo.class);
                return new mdy(2);
            case 4:
                return mdy.b;
            case 5:
                return mdy.b;
            case 6:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 25:
            default:
                med medVar = this.c[i2];
                mdz mdzVarA = null;
                if (medVar != null) {
                    oom oomVar = medVar.a;
                    int i4 = ((orr) oomVar).c;
                    while (i3 < i4) {
                        meb mebVar = (meb) oomVar.get(i3);
                        ojc ojcVarA = mebVar.b().a();
                        if (!ojcVarA.g() || ((oom) ojcVarA.c()).isEmpty()) {
                            mdzVarA = mebVar.a();
                        } else {
                            i3++;
                        }
                    }
                }
                return mdzVarA != null ? mdzVarA : mdy.a;
            case 7:
                return mdy.b;
            case 8:
                return mdy.b;
            case 9:
                return mdy.b;
            case 10:
                return mdy.b;
            case 22:
                return mdy.b;
            case 23:
                return mdy.b;
            case 24:
                return mdy.b;
            case 26:
                return mdy.b;
        }
    }
}

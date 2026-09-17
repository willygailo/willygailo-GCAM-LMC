package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hws implements Runnable {
    public final /* synthetic */ hwt a;
    private final /* synthetic */ int b;

    public /* synthetic */ hws(hwt hwtVar, int i) {
        this.b = i;
        this.a = hwtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hwa hwaVar = (hwa) this.a.b.get();
                if (hwaVar.c == null) {
                    nyj nyjVar = new nyj(hwaVar.a, true != hwaVar.b.k(ddl.ay) ? 0 : 2132083559);
                    nyjVar.s(R.string.installing_updates_dialog_title);
                    nyjVar.l(R.string.installing_updates_dialog_message);
                    hz hzVar = nyjVar.a;
                    hzVar.r = null;
                    hzVar.q = R.layout.installing_update_dialog;
                    nyjVar.k(false);
                    hwaVar.c = nyjVar.b();
                }
                hwaVar.c.show();
                break;
            default:
                ie ieVar = ((hwa) this.a.b.get()).c;
                if (ieVar != null) {
                    ieVar.dismiss();
                }
                break;
        }
    }
}

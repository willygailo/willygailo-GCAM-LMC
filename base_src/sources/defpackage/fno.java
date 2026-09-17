package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fno {
    public final Queue a = new ArrayDeque();
    public final AtomicBoolean b;
    public final jgu c;
    public final jgu d;
    public final elw e;
    public final fnu f;
    public final fnq g;

    public fno(Context context, elw elwVar, fnu fnuVar, AtomicBoolean atomicBoolean, fnq fnqVar, ddf ddfVar) {
        this.e = elwVar;
        this.b = atomicBoolean;
        this.f = fnuVar;
        this.g = fnqVar;
        jgv jgvVar = new jgv();
        jgvVar.f = context;
        jgvVar.e = context.getResources().getString(R.string.thermal_flash_disabled_chip_text);
        jgvVar.a = true;
        jgvVar.i = 11;
        jgvVar.h = ddfVar.k(ddl.ay);
        this.c = jgvVar.a();
        jgvVar.e = context.getResources().getString(R.string.long_shot_record_failed_text);
        jgvVar.a = false;
        jgvVar.i = 11;
        jgvVar.h = ddfVar.k(ddl.ay);
        this.d = jgvVar.a();
    }
}

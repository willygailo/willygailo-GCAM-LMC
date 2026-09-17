package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class iru extends TextView {
    public final AtomicInteger a;
    public final Resources b;
    public final irr c;

    public iru(Context context, irr irrVar) {
        super(context);
        this.a = new AtomicInteger(0);
        this.b = context.getResources();
        this.c = irrVar;
    }
}

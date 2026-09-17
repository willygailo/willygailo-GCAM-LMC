package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class uv extends hn {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new uu());
    public volatile Handler c;
}

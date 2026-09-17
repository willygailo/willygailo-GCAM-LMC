package defpackage;

import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hrx {
    public static final ouj a = ouj.h("com/google/android/apps/camera/session/SessionNotifier");
    public final hpu c;
    private final pyn e;
    private final lar f;
    public final List b = new ArrayList();
    public final Map d = new ConcurrentHashMap();

    public hrx(lar larVar, hpu hpuVar, pyn pynVar) {
        this.f = larVar;
        this.c = hpuVar;
        this.e = pynVar;
    }

    public final void a(hsb hsbVar) {
        synchronized (this.b) {
            this.b.add(hsbVar);
        }
    }

    public final void b(final Consumer consumer, final hsp hspVar) {
        this.f.c(new Runnable() { // from class: hru
            @Override // java.lang.Runnable
            public final void run() {
                hrx hrxVar = this.a;
                Consumer consumer2 = consumer;
                hsp hspVar2 = hspVar;
                synchronized (hrxVar.b) {
                    hrxVar.c(consumer2);
                }
                hrxVar.c.d(hspVar2);
                hrxVar.d.remove(hspVar2);
            }
        });
    }

    public final void c(Consumer consumer) {
        Iterator it = ((Set) this.e.get()).iterator();
        while (it.hasNext()) {
            consumer.accept((hsb) it.next());
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            consumer.accept((hsb) it2.next());
        }
    }

    public final void d(final Consumer consumer) {
        this.f.c(new Runnable() { // from class: hrt
            @Override // java.lang.Runnable
            public final void run() {
                hrx hrxVar = this.a;
                Consumer consumer2 = consumer;
                synchronized (hrxVar.b) {
                    hrxVar.c(consumer2);
                }
            }
        });
    }

    public final void e(hsp hspVar, Runnable runnable, String str) {
        pht phtVar = (pht) this.d.get(hspVar);
        if (phtVar == null) {
            ((oug) ((oug) a.b()).G(2630)).y("%s: No queued future found, maybe shot already finalized?: %s", hspVar, str);
        } else {
            plk.af(phtVar, new hrw(str, runnable, hspVar), pgr.INSTANCE);
        }
    }

    public final void f(final Bitmap bitmap) {
        d(new Consumer() { // from class: hrl
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((hsb) obj).n(bitmap);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void g(hsp hspVar) {
        pht phtVar = (pht) this.d.get(hspVar);
        if (phtVar == null) {
            ((oug) ((oug) a.b()).G((char) 2636)).r("%s: No queued future found, maybe shot already finalized?: notifyTaskDone", hspVar);
        } else {
            phtVar.d(new hrq(this, hspVar, 2), pgr.INSTANCE);
        }
    }

    public final void h(final hsp hspVar, pht phtVar, final hss hssVar) {
        this.d.put(hspVar, pgb.h(phtVar, new oiu() { // from class: hrk
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                hrx hrxVar = this.a;
                final hsp hspVar2 = hspVar;
                final hss hssVar2 = hssVar;
                final hsj hsjVar = (hsj) obj;
                hssVar2.name();
                hrxVar.d(new Consumer() { // from class: hro
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj2) {
                        hsp hspVar3 = hspVar2;
                        hsj hsjVar2 = hsjVar;
                        hss hssVar3 = hssVar2;
                        hsjVar2.getClass();
                        ((hsb) obj2).p(hspVar3, hsjVar2, hssVar3);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, pgr.INSTANCE));
    }

    public final void i(hsb hsbVar) {
        synchronized (this.b) {
            this.b.remove(hsbVar);
        }
    }
}

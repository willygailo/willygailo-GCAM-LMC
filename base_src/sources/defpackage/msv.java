package defpackage;

import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class msv implements msr {
    public final pht a;
    public final pht b;
    public final pht c;
    public final pht d;
    public boolean i;
    private final mtf j;
    private final boolean k;
    private boolean l;
    public final List h = new ArrayList();
    public final pih e = pih.f();
    public final pih f = pih.f();
    public final pih g = pih.f();

    public msv(pht phtVar, pht phtVar2, pht phtVar3, pht phtVar4, boolean z, Executor executor) {
        this.a = phtVar;
        this.b = phtVar2;
        this.c = phtVar3;
        this.d = phtVar4;
        this.k = z;
        this.j = new mtf(executor);
    }

    @Override // defpackage.msr
    public final synchronized msx a(msw mswVar) {
        if (this.l) {
            throw new IllegalStateException("Muxer already started. No tracks can be added now.");
        }
        mta mtaVar = new mta(mswVar.a, new mtf(this.j));
        this.h.add(mtaVar);
        if (!this.k) {
            return mtaVar;
        }
        return new msp(mtaVar);
    }

    @Override // defpackage.msr
    public final pht b() {
        return this.g;
    }

    @Override // defpackage.msr
    public final synchronized void c() {
        if (this.l) {
            throw new IllegalStateException("Muxer already started. Cannot call start twice.");
        }
        final int i = 1;
        this.l = true;
        this.g.d(new Runnable(this) { // from class: msu
            public final /* synthetic */ msv a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x01d4 A[DONT_GENERATE] */
            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsDone;
                boolean zIsDone2;
                int i2 = 0;
                switch (i) {
                    case 0:
                        msv msvVar = this.a;
                        try {
                            Iterator it = msvVar.h.iterator();
                            while (it.hasNext()) {
                                if (((Boolean) plk.ad(((mta) it.next()).b)).booleanValue()) {
                                    i2++;
                                }
                            }
                            if (i2 == 0) {
                                if (!msvVar.i) {
                                    ((MediaMuxer) plk.ad(msvVar.e)).release();
                                    msvVar.i = true;
                                }
                                msvVar.f.cancel(true);
                                return;
                            }
                            if (msvVar.i) {
                                return;
                            }
                            MediaMuxer mediaMuxer = (MediaMuxer) plk.ad(msvVar.e);
                            for (mta mtaVar : msvVar.h) {
                                if (((Boolean) plk.ad(mtaVar.b)).booleanValue()) {
                                    int iAddTrack = mediaMuxer.addTrack((MediaFormat) plk.ad(mtaVar.a));
                                    mtaVar.g = (MediaMuxer) plk.ad(msvVar.e);
                                    mtaVar.c.o(Integer.valueOf(iAddTrack));
                                }
                            }
                            mediaMuxer.start();
                            msvVar.f.o(true);
                            return;
                        } catch (ExecutionException e) {
                            Log.e("MuxerImpl", "MediaMuxer should be done by now.", e);
                            msvVar.f.a(e);
                            return;
                        }
                    case 1:
                        msv msvVar2 = this.a;
                        if (msvVar2.g.isCancelled()) {
                            if (!msvVar2.e.isDone() || msvVar2.e.isCancelled()) {
                                msvVar2.e.cancel(false);
                                return;
                            }
                            try {
                                if (msvVar2.i) {
                                    return;
                                }
                                ((MediaMuxer) plk.ad(msvVar2.e)).release();
                                msvVar2.i = true;
                                return;
                            } catch (ExecutionException e2) {
                                Log.w("MuxerImpl", "Error while trying to close media muxer.", e2);
                                return;
                            }
                        }
                        return;
                    default:
                        msv msvVar3 = this.a;
                        try {
                            if (msvVar3.f.isDone() && !msvVar3.f.isCancelled() && ((Boolean) plk.ad(msvVar3.f)).booleanValue()) {
                                ((MediaMuxer) plk.ad(msvVar3.e)).stop();
                            } else {
                                Log.w("MuxerImpl", "Output cancelled since no data written to any track.");
                                msvVar3.g.cancel(false);
                                if (msvVar3.a.isDone() && !msvVar3.a.isCancelled()) {
                                    ojc ojcVar = ((msq) plk.ad(msvVar3.a)).a;
                                }
                            }
                            try {
                                if (!msvVar3.i) {
                                    ((MediaMuxer) plk.ad(msvVar3.e)).release();
                                    msvVar3.i = true;
                                }
                                if (msvVar3.g.isDone()) {
                                    return;
                                }
                                break;
                            } catch (Throwable th) {
                                try {
                                    msvVar3.g.a(th);
                                    if (zIsDone2) {
                                        return;
                                    }
                                } finally {
                                    if (!msvVar3.g.isDone()) {
                                        msvVar3.g.o(msv.class);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                msvVar3.g.a(th2);
                                try {
                                    if (!msvVar3.i) {
                                        ((MediaMuxer) plk.ad(msvVar3.e)).release();
                                        msvVar3.i = true;
                                    }
                                    if (msvVar3.g.isDone()) {
                                        return;
                                    }
                                    break;
                                } catch (Throwable th3) {
                                    try {
                                        msvVar3.g.a(th3);
                                        if (zIsDone) {
                                            return;
                                        }
                                    } finally {
                                        if (!msvVar3.g.isDone()) {
                                            msvVar3.g.o(msv.class);
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    if (!msvVar3.i) {
                                        ((MediaMuxer) plk.ad(msvVar3.e)).release();
                                        msvVar3.i = true;
                                    }
                                    if (!msvVar3.g.isDone()) {
                                    }
                                    break;
                                } catch (Throwable th5) {
                                    try {
                                        msvVar3.g.a(th5);
                                        if (!msvVar3.g.isDone()) {
                                        }
                                    } finally {
                                        if (!msvVar3.g.isDone()) {
                                            msvVar3.g.o(msv.class);
                                        }
                                    }
                                }
                                throw th4;
                            }
                        }
                        return;
                }
            }
        }, this.j);
        final int i2 = 0;
        final int i3 = 2;
        this.e.e(pgb.i(plk.S(this.a, this.b, this.c, this.d), new pgk() { // from class: mst
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                MediaMuxer mediaMuxer;
                msv msvVar = this.a;
                try {
                    ojc ojcVarH = ojc.h((Integer) plk.ad(msvVar.b));
                    ojc ojcVarH2 = ojc.h((Float) plk.ad(msvVar.c));
                    ojc ojcVarH3 = ojc.h((Float) plk.ad(msvVar.d));
                    msq msqVar = (msq) plk.ad(msvVar.a);
                    ojc ojcVar = msqVar.a;
                    mediaMuxer = new MediaMuxer((FileDescriptor) ((ojj) msqVar.b).a, 0);
                    try {
                        if (ojcVarH.g()) {
                            mediaMuxer.setOrientationHint(((Integer) ojcVarH.c()).intValue());
                        }
                        if (ojcVarH2.g() && ojcVarH3.g()) {
                            mediaMuxer.setLocation(((Float) ojcVarH2.c()).floatValue(), ((Float) ojcVarH3.c()).floatValue());
                        }
                        return plk.V(mediaMuxer);
                    } catch (Throwable th) {
                        th = th;
                        Log.e("MuxerImpl", "Error trying to construct MediaMuxer.", th);
                        if (!msvVar.i && mediaMuxer != null) {
                            mediaMuxer.release();
                            msvVar.i = true;
                        }
                        return plk.U(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mediaMuxer = null;
                }
            }
        }, this.j));
        ArrayList arrayListAg = obr.ag();
        arrayListAg.add(this.e);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            arrayListAg.add(((mta) it.next()).b);
        }
        plk.R(arrayListAg).d(new Runnable(this) { // from class: msu
            public final /* synthetic */ msv a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x01d4 A[DONT_GENERATE] */
            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsDone;
                boolean zIsDone2;
                int i4 = 0;
                switch (i2) {
                    case 0:
                        msv msvVar = this.a;
                        try {
                            Iterator it2 = msvVar.h.iterator();
                            while (it2.hasNext()) {
                                if (((Boolean) plk.ad(((mta) it2.next()).b)).booleanValue()) {
                                    i4++;
                                }
                            }
                            if (i4 == 0) {
                                if (!msvVar.i) {
                                    ((MediaMuxer) plk.ad(msvVar.e)).release();
                                    msvVar.i = true;
                                }
                                msvVar.f.cancel(true);
                                return;
                            }
                            if (msvVar.i) {
                                return;
                            }
                            MediaMuxer mediaMuxer = (MediaMuxer) plk.ad(msvVar.e);
                            for (mta mtaVar : msvVar.h) {
                                if (((Boolean) plk.ad(mtaVar.b)).booleanValue()) {
                                    int iAddTrack = mediaMuxer.addTrack((MediaFormat) plk.ad(mtaVar.a));
                                    mtaVar.g = (MediaMuxer) plk.ad(msvVar.e);
                                    mtaVar.c.o(Integer.valueOf(iAddTrack));
                                }
                            }
                            mediaMuxer.start();
                            msvVar.f.o(true);
                            return;
                        } catch (ExecutionException e) {
                            Log.e("MuxerImpl", "MediaMuxer should be done by now.", e);
                            msvVar.f.a(e);
                            return;
                        }
                    case 1:
                        msv msvVar2 = this.a;
                        if (msvVar2.g.isCancelled()) {
                            if (!msvVar2.e.isDone() || msvVar2.e.isCancelled()) {
                                msvVar2.e.cancel(false);
                                return;
                            }
                            try {
                                if (msvVar2.i) {
                                    return;
                                }
                                ((MediaMuxer) plk.ad(msvVar2.e)).release();
                                msvVar2.i = true;
                                return;
                            } catch (ExecutionException e2) {
                                Log.w("MuxerImpl", "Error while trying to close media muxer.", e2);
                                return;
                            }
                        }
                        return;
                    default:
                        msv msvVar3 = this.a;
                        try {
                            if (msvVar3.f.isDone() && !msvVar3.f.isCancelled() && ((Boolean) plk.ad(msvVar3.f)).booleanValue()) {
                                ((MediaMuxer) plk.ad(msvVar3.e)).stop();
                            } else {
                                Log.w("MuxerImpl", "Output cancelled since no data written to any track.");
                                msvVar3.g.cancel(false);
                                if (msvVar3.a.isDone() && !msvVar3.a.isCancelled()) {
                                    ojc ojcVar = ((msq) plk.ad(msvVar3.a)).a;
                                }
                            }
                            try {
                                if (!msvVar3.i) {
                                    ((MediaMuxer) plk.ad(msvVar3.e)).release();
                                    msvVar3.i = true;
                                }
                                if (msvVar3.g.isDone()) {
                                    return;
                                }
                                break;
                            } catch (Throwable th) {
                                try {
                                    msvVar3.g.a(th);
                                    if (zIsDone2) {
                                        return;
                                    }
                                } finally {
                                    if (!msvVar3.g.isDone()) {
                                        msvVar3.g.o(msv.class);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                msvVar3.g.a(th2);
                                try {
                                    if (!msvVar3.i) {
                                        ((MediaMuxer) plk.ad(msvVar3.e)).release();
                                        msvVar3.i = true;
                                    }
                                    if (msvVar3.g.isDone()) {
                                        return;
                                    }
                                    break;
                                } catch (Throwable th3) {
                                    try {
                                        msvVar3.g.a(th3);
                                        if (zIsDone) {
                                            return;
                                        }
                                    } finally {
                                        if (!msvVar3.g.isDone()) {
                                            msvVar3.g.o(msv.class);
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    if (!msvVar3.i) {
                                        ((MediaMuxer) plk.ad(msvVar3.e)).release();
                                        msvVar3.i = true;
                                    }
                                    if (!msvVar3.g.isDone()) {
                                    }
                                    break;
                                } catch (Throwable th5) {
                                    try {
                                        msvVar3.g.a(th5);
                                        if (!msvVar3.g.isDone()) {
                                        }
                                    } finally {
                                        if (!msvVar3.g.isDone()) {
                                            msvVar3.g.o(msv.class);
                                        }
                                    }
                                }
                                throw th4;
                            }
                        }
                        return;
                }
            }
        }, this.j);
        ArrayList arrayListAg2 = obr.ag();
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            arrayListAg2.add(((mta) it2.next()).e);
        }
        plk.R(arrayListAg2).d(new Runnable(this) { // from class: msu
            public final /* synthetic */ msv a;

            {
                this.a = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x01d4 A[DONT_GENERATE] */
            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsDone;
                boolean zIsDone2;
                int i4 = 0;
                switch (i3) {
                    case 0:
                        msv msvVar = this.a;
                        try {
                            Iterator it3 = msvVar.h.iterator();
                            while (it3.hasNext()) {
                                if (((Boolean) plk.ad(((mta) it3.next()).b)).booleanValue()) {
                                    i4++;
                                }
                            }
                            if (i4 == 0) {
                                if (!msvVar.i) {
                                    ((MediaMuxer) plk.ad(msvVar.e)).release();
                                    msvVar.i = true;
                                }
                                msvVar.f.cancel(true);
                                return;
                            }
                            if (msvVar.i) {
                                return;
                            }
                            MediaMuxer mediaMuxer = (MediaMuxer) plk.ad(msvVar.e);
                            for (mta mtaVar : msvVar.h) {
                                if (((Boolean) plk.ad(mtaVar.b)).booleanValue()) {
                                    int iAddTrack = mediaMuxer.addTrack((MediaFormat) plk.ad(mtaVar.a));
                                    mtaVar.g = (MediaMuxer) plk.ad(msvVar.e);
                                    mtaVar.c.o(Integer.valueOf(iAddTrack));
                                }
                            }
                            mediaMuxer.start();
                            msvVar.f.o(true);
                            return;
                        } catch (ExecutionException e) {
                            Log.e("MuxerImpl", "MediaMuxer should be done by now.", e);
                            msvVar.f.a(e);
                            return;
                        }
                    case 1:
                        msv msvVar2 = this.a;
                        if (msvVar2.g.isCancelled()) {
                            if (!msvVar2.e.isDone() || msvVar2.e.isCancelled()) {
                                msvVar2.e.cancel(false);
                                return;
                            }
                            try {
                                if (msvVar2.i) {
                                    return;
                                }
                                ((MediaMuxer) plk.ad(msvVar2.e)).release();
                                msvVar2.i = true;
                                return;
                            } catch (ExecutionException e2) {
                                Log.w("MuxerImpl", "Error while trying to close media muxer.", e2);
                                return;
                            }
                        }
                        return;
                    default:
                        msv msvVar3 = this.a;
                        try {
                            if (msvVar3.f.isDone() && !msvVar3.f.isCancelled() && ((Boolean) plk.ad(msvVar3.f)).booleanValue()) {
                                ((MediaMuxer) plk.ad(msvVar3.e)).stop();
                            } else {
                                Log.w("MuxerImpl", "Output cancelled since no data written to any track.");
                                msvVar3.g.cancel(false);
                                if (msvVar3.a.isDone() && !msvVar3.a.isCancelled()) {
                                    ojc ojcVar = ((msq) plk.ad(msvVar3.a)).a;
                                }
                            }
                            try {
                                if (!msvVar3.i) {
                                    ((MediaMuxer) plk.ad(msvVar3.e)).release();
                                    msvVar3.i = true;
                                }
                                if (msvVar3.g.isDone()) {
                                    return;
                                }
                                break;
                            } catch (Throwable th) {
                                try {
                                    msvVar3.g.a(th);
                                    if (zIsDone2) {
                                        return;
                                    }
                                } finally {
                                    if (!msvVar3.g.isDone()) {
                                        msvVar3.g.o(msv.class);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                msvVar3.g.a(th2);
                                try {
                                    if (!msvVar3.i) {
                                        ((MediaMuxer) plk.ad(msvVar3.e)).release();
                                        msvVar3.i = true;
                                    }
                                    if (msvVar3.g.isDone()) {
                                        return;
                                    }
                                    break;
                                } catch (Throwable th3) {
                                    try {
                                        msvVar3.g.a(th3);
                                        if (zIsDone) {
                                            return;
                                        }
                                    } finally {
                                        if (!msvVar3.g.isDone()) {
                                            msvVar3.g.o(msv.class);
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    if (!msvVar3.i) {
                                        ((MediaMuxer) plk.ad(msvVar3.e)).release();
                                        msvVar3.i = true;
                                    }
                                    if (!msvVar3.g.isDone()) {
                                    }
                                    break;
                                } catch (Throwable th5) {
                                    try {
                                        msvVar3.g.a(th5);
                                        if (!msvVar3.g.isDone()) {
                                        }
                                    } finally {
                                        if (!msvVar3.g.isDone()) {
                                            msvVar3.g.o(msv.class);
                                        }
                                    }
                                }
                                throw th4;
                            }
                        }
                        return;
                }
            }
        }, this.j);
    }
}

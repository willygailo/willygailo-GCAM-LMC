package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dfb implements Runnable {
    public final /* synthetic */ dff a;
    private final /* synthetic */ int b;

    public /* synthetic */ dfb(dff dffVar, int i) {
        this.b = i;
        this.a = dffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        final int i = 1;
        final int i2 = 0;
        switch (this.b) {
            case 0:
                dff dffVar = this.a;
                if (((Boolean) dffVar.o.c(htu.ab)).booleanValue()) {
                    dffVar.i.e("CameraFilmstripDataAdapter#removeMarsDeletedItems");
                    ArrayList arrayList = new ArrayList(dffVar.m.a());
                    Iterator it = dffVar.m.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((bty) it.next()).a().c());
                    }
                    Map mapA = dffVar.q.a(arrayList);
                    dffVar.i.f();
                    dffVar.i.e("RemoveDeletedMarsItems");
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Uri uri = (Uri) arrayList.get(i3);
                        if (!Boolean.TRUE.equals(mapA.get(uri))) {
                            dffVar.m.i(uri);
                        }
                    }
                    dffVar.i.f();
                }
                dffVar.i.e("CameraFilmstripDataAdapter#removeDeletedItems");
                ArrayList arrayList2 = new ArrayList();
                bty btyVarF = dffVar.l.f();
                btyVarF.getClass();
                Instant instantG = btyVarF.a().g();
                bty btyVarF2 = dffVar.l.f();
                btyVarF2.getClass();
                Instant instantH = btyVarF2.a().h();
                HashSet hashSet = new HashSet();
                hashSet.addAll(dffVar.e.f.e(instantG, instantH, false));
                hashSet.addAll(dffVar.f.d.e(instantG, instantH, true));
                Iterator it2 = dffVar.l.iterator();
                while (it2.hasNext()) {
                    btz btzVarA = ((bty) it2.next()).a();
                    if (!btzVarA.j() && !hashSet.contains(btzVarA.c())) {
                        arrayList2.add(btzVarA.c());
                    }
                }
                dffVar.i.f();
                bqg bqgVar = dffVar.r;
                synchronized (bqgVar.a) {
                    zA = bqgVar.g.a();
                    break;
                }
                if (zA) {
                    ((oug) ((oug) dff.a.c()).G((char) 731)).o("Activity is destroyed. Canceling load.");
                    return;
                }
                dffVar.i.e("RemoveDeleted");
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    dffVar.l.i((Uri) arrayList2.get(i2));
                    i2++;
                }
                dffVar.i.f();
                return;
            case 1:
                dff dffVar2 = this.a;
                plk.af(dffVar2.j.b(dffVar2), dffVar2.c, dffVar2.h);
                return;
            case 2:
                this.a.c.b(null);
                return;
            default:
                dff dffVar3 = this.a;
                dffVar3.i.e("CameraFilmstripDataAdapter#queryFilmStrip");
                Instant instantH2 = dffVar3.k ? dffVar3.p : Instant.EPOCH;
                bty btyVarB = dffVar3.r().b();
                Instant instantG2 = btyVarB != null ? btyVarB.a().g() : instantH2;
                if (btyVarB != null) {
                    instantH2 = btyVarB.a().h();
                }
                dffVar3.i.e("CameraFilmstripDataAdapter#queryFilmStrip#querySince");
                try {
                    ooh oohVarE = oom.e();
                    final dfx dfxVar = dffVar3.e;
                    final dfr dfrVar = dfxVar.f;
                    oohVarE.h((List) Collection.EL.stream(dfrVar.d(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, dfr.c, instantG2.toEpochMilli(), instantH2.getEpochSecond(), 5, new Function() { // from class: dfp
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            switch (i) {
                                case 0:
                                    break;
                            }
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            switch (i) {
                                case 0:
                                    break;
                            }
                            return dfrVar.b((Cursor) obj).a();
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            switch (i) {
                                case 0:
                                    break;
                            }
                            return Function.CC.$default$compose(this, function);
                        }
                    })).map(new Function() { // from class: dfw
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            dfx dfxVar2 = dfxVar;
                            return new dfv(dfxVar2.c, dfxVar2.d, (dfo) obj, dfxVar2.h, hss.MEDIA_STORE);
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            return Function.CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toList()));
                    final dga dgaVar = dffVar3.f;
                    final dfr dfrVar2 = dgaVar.d;
                    oohVarE.h((List) Collection.EL.stream(dfrVar2.d(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, dfr.c, instantG2.toEpochMilli(), instantH2.getEpochSecond(), 5, new Function() { // from class: dfp
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            switch (i2) {
                                case 0:
                                    break;
                            }
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            switch (i2) {
                                case 0:
                                    break;
                            }
                            return dfrVar2.b((Cursor) obj).a();
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            switch (i2) {
                                case 0:
                                    break;
                            }
                            return Function.CC.$default$compose(this, function);
                        }
                    })).map(new Function() { // from class: dfz
                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function andThen(Function function) {
                            return Function.CC.$default$andThen(this, function);
                        }

                        @Override // j$.util.function.Function
                        public final Object apply(Object obj) {
                            dga dgaVar2 = dgaVar;
                            return new dfy(dgaVar2.a, dgaVar2.b, (dfo) obj, hss.MEDIA_STORE);
                        }

                        @Override // j$.util.function.Function
                        public final /* synthetic */ Function compose(Function function) {
                            return Function.CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toList()));
                    oom oomVarF = oohVarE.f();
                    int i4 = ((orr) oomVarF).c;
                    dffVar3.i.g("CameraFilmstripDataAdapter#queryFilmStrip#loadMetadata");
                    otj it3 = oomVarF.iterator();
                    while (it3.hasNext()) {
                        dffVar3.g.a(dffVar3.d, (bty) it3.next());
                    }
                    if (dffVar3.l.a() == 0) {
                        dffVar3.l.g(oomVarF);
                    } else {
                        otj it4 = oomVarF.iterator();
                        while (it4.hasNext()) {
                            dffVar3.l.k((bty) it4.next());
                        }
                    }
                    return;
                } finally {
                    dffVar3.i.f();
                    dffVar3.i.f();
                }
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.LruCache;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mdq {
    private static final int c = d.c("DEFAULT");
    public final LruCache a;
    public qzd b;
    private final LruCache d;
    private final Context e;
    private final Integer f;

    public mdq(Context context, int i, LruCache lruCache, LruCache lruCache2) {
        this.e = context;
        this.f = Integer.valueOf(i);
        this.d = lruCache;
        this.a = lruCache2;
    }

    private static Map e(List list, oom oomVar) throws mdp {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() >= oomVar.size()) {
                throw new mdp(String.format("CollectionBasisHolder index(%d) exceeds list size(%d)", num, Integer.valueOf(oomVar.size())));
            }
            qyx qyxVar = (qyx) oomVar.get(num.intValue());
            Integer numValueOf = Integer.valueOf((qyxVar.a & 2) != 0 ? qyxVar.c : c);
            poy poyVar = (poy) qyxVar.G(5);
            poyVar.o(qyxVar);
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            qyx qyxVar2 = (qyx) poyVar.b;
            qyxVar2.a &= -3;
            qyxVar2.c = 0;
            map.put(numValueOf, (qyx) poyVar.j());
        }
        return map;
    }

    public final qza a(int i) {
        LruCache lruCache = this.d;
        Integer numValueOf = Integer.valueOf(i);
        qza qzaVar = (qza) lruCache.get(numValueOf);
        if (qzaVar == null) {
            if (this.b == null) {
                this.b = c();
            }
            qzaVar = (qza) Collections.unmodifiableMap(this.b.a).get(numValueOf);
            if (qzaVar != null) {
                this.d.put(numValueOf, qzaVar);
                return qzaVar;
            }
        }
        return qzaVar;
    }

    public final qza b(int i) {
        qza qzaVarA = a(i);
        if (qzaVarA != null) {
            return qzaVarA;
        }
        throw new IllegalArgumentException();
    }

    public final qzd c() throws IOException {
        qyw qywVar;
        Context context = this.e;
        if (context == null) {
            throw new IOException("No context to load resource from");
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(this.f.intValue());
            try {
                poh pohVarH = poh.H(inputStreamOpenRawResource);
                poy poyVarM = qzd.f.m();
                pos posVarA = pos.a();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                try {
                    pqu.a.b(poyVarM.b).h(poyVarM.b, poi.p(pohVarH), posVarA);
                    qzd qzdVar = (qzd) poyVarM.j();
                    ppm ppmVar = qzdVar.c;
                    ppk ppkVar = qzdVar.d;
                    if (ppmVar.size() != ppkVar.size()) {
                        throw new mdp(String.format("ProtoHashNamesList[%d] and MessagesList[%d] must have same size", Integer.valueOf(ppkVar.size()), Integer.valueOf(ppmVar.size())));
                    }
                    HashMap map = new HashMap();
                    oom oomVarJ = oom.j(qzdVar.e);
                    Iterator it = ppkVar.iterator();
                    Iterator it2 = ppmVar.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        Integer num = (Integer) it.next();
                        qza qzaVar = (qza) it2.next();
                        Map mapE = e(qzaVar.e, oomVarJ);
                        ppk ppkVar2 = qzaVar.f;
                        ppl pplVar = qzaVar.g;
                        if (ppkVar2.size() != pplVar.size()) {
                            throw new mdp(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(pplVar.size()), Integer.valueOf(ppkVar2.size())));
                        }
                        HashMap map2 = new HashMap();
                        Iterator it3 = ppkVar2.iterator();
                        Iterator it4 = pplVar.iterator();
                        while (it4.hasNext() && it3.hasNext()) {
                            Long l = (Long) it4.next();
                            Map mapE2 = e(oom.m((Integer) it3.next()), oomVarJ);
                            poy poyVarM2 = qyw.e.m();
                            poyVarM2.ar(mapE2);
                            map2.put(l, (qyw) poyVarM2.j());
                        }
                        ppm ppmVar2 = qzaVar.c;
                        ppl pplVar2 = qzaVar.d;
                        if (ppmVar2.size() != pplVar2.size()) {
                            throw new mdp(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(pplVar2.size()), Integer.valueOf(ppmVar2.size())));
                        }
                        Iterator it5 = pplVar2.iterator();
                        Iterator it6 = ppmVar2.iterator();
                        while (it5.hasNext() && it6.hasNext()) {
                            Long l2 = (Long) it5.next();
                            qyw qywVar2 = (qyw) it6.next();
                            Map mapE3 = e(qywVar2.d, oomVarJ);
                            if (map2.containsKey(l2)) {
                                poy poyVar = (poy) qywVar2.G(5);
                                poyVar.o(qywVar2);
                                poyVar.o((qyw) map2.get(l2));
                                qywVar = (qyw) poyVar.j();
                            } else {
                                poy poyVar2 = (poy) qywVar2.G(5);
                                poyVar2.o(qywVar2);
                                poyVar2.ar(mapE3);
                                if (poyVar2.c) {
                                    poyVar2.m();
                                    poyVar2.c = false;
                                }
                                ((qyw) poyVar2.b).d = qyw.w();
                                qywVar = (qyw) poyVar2.j();
                            }
                            map2.put(l2, qywVar);
                        }
                        poy poyVar3 = (poy) qzaVar.G(5);
                        poyVar3.o(qzaVar);
                        if (poyVar3.c) {
                            poyVar3.m();
                            poyVar3.c = false;
                        }
                        qza qzaVar2 = (qza) poyVar3.b;
                        pqh pqhVar = qzaVar2.a;
                        if (!pqhVar.b) {
                            qzaVar2.a = pqhVar.a();
                        }
                        qzaVar2.a.putAll(mapE);
                        if (poyVar3.c) {
                            poyVar3.m();
                            poyVar3.c = false;
                        }
                        ((qza) poyVar3.b).e = qza.w();
                        if (poyVar3.c) {
                            poyVar3.m();
                            poyVar3.c = false;
                        }
                        qza qzaVar3 = (qza) poyVar3.b;
                        pqh pqhVar2 = qzaVar3.b;
                        if (!pqhVar2.b) {
                            qzaVar3.b = pqhVar2.a();
                        }
                        qzaVar3.b.putAll(map2);
                        if (poyVar3.c) {
                            poyVar3.m();
                            poyVar3.c = false;
                        }
                        ((qza) poyVar3.b).d = qza.y();
                        if (poyVar3.c) {
                            poyVar3.m();
                            poyVar3.c = false;
                        }
                        ((qza) poyVar3.b).c = qza.A();
                        if (poyVar3.c) {
                            poyVar3.m();
                            poyVar3.c = false;
                        }
                        ((qza) poyVar3.b).f = qza.w();
                        if (poyVar3.c) {
                            poyVar3.m();
                            poyVar3.c = false;
                        }
                        ((qza) poyVar3.b).g = qza.y();
                        map.put(num, (qza) poyVar3.j());
                    }
                    poy poyVarM3 = qzd.f.m();
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    qzd qzdVar2 = (qzd) poyVarM3.b;
                    pqh pqhVar3 = qzdVar2.a;
                    if (!pqhVar3.b) {
                        qzdVar2.a = pqhVar3.a();
                    }
                    qzdVar2.a.putAll(map);
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(qzdVar.b);
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    qzd qzdVar3 = (qzd) poyVarM3.b;
                    pqh pqhVar4 = qzdVar3.b;
                    if (!pqhVar4.b) {
                        qzdVar3.b = pqhVar4.a();
                    }
                    qzdVar3.b.putAll(mapUnmodifiableMap);
                    qzd qzdVar4 = (qzd) poyVarM3.j();
                    if (inputStreamOpenRawResource != null) {
                        inputStreamOpenRawResource.close();
                    }
                    return qzdVar4;
                } catch (RuntimeException e) {
                    if (e.getCause() instanceof IOException) {
                        throw ((IOException) e.getCause());
                    }
                    throw e;
                }
            } catch (Throwable th) {
                if (inputStreamOpenRawResource == null) {
                    throw th;
                }
                try {
                    inputStreamOpenRawResource.close();
                    throw th;
                } catch (Throwable th2) {
                    throw th;
                }
            }
        } catch (Resources.NotFoundException e2) {
            throw new IOException(e2);
        }
    }

    public final boolean d(int i) {
        return a(i) != null;
    }
}

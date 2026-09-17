package defpackage;

import android.media.MediaFormat;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lgw implements Callable {
    public final /* synthetic */ lgy a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgw(lgy lgyVar, int i) {
        this.b = i;
        this.a = lgyVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        final int i = 0;
        final int i2 = 1;
        switch (this.b) {
            case 0:
                lgy lgyVar = this.a;
                lfm lfmVar = lgyVar.e;
                if (lfmVar != null) {
                    synchronized (((lfy) lfmVar).e) {
                        int i3 = ((lfy) lfmVar).O;
                        if (i3 != 1) {
                            switch (i3) {
                                case 1:
                                    str = "READY";
                                    break;
                                case 2:
                                    str = "STARTED";
                                    break;
                                case 3:
                                    str = "STOPPED";
                                    break;
                                case 4:
                                    str = "CLOSED";
                                    break;
                                case 5:
                                    str = "PAUSED";
                                    break;
                                default:
                                    str = "null";
                                    break;
                            }
                            StringBuilder sb = new StringBuilder(str.length() + 17);
                            sb.append("illegal state as ");
                            sb.append(str);
                            Log.e("AudioEncoder", sb.toString());
                        } else if (((lfy) lfmVar).B) {
                            ((lfy) lfmVar).close();
                            ((lfy) lfmVar).m.a(lga.MEDIA_CODEC_ERROR_AUDIO);
                        } else {
                            ((lfy) lfmVar).t = 0L;
                            final lfy lfyVar = (lfy) lfmVar;
                            ((lfy) lfmVar).C = ((lfy) lfmVar).k.a(new lij() { // from class: lfn
                                @Override // defpackage.lij
                                public final void fB(Object obj) {
                                    switch (i2) {
                                        case 0:
                                            lfyVar.h();
                                            break;
                                        default:
                                            lfy lfyVar2 = lfyVar;
                                            Long l = (Long) obj;
                                            if (l.longValue() > 0) {
                                                lfyVar2.h();
                                            } else if (l.longValue() == -1) {
                                                Log.w("AudioEncoder", "Empty video recording detected, not adding audio.");
                                                lfyVar2.N.o(null);
                                            }
                                            break;
                                    }
                                }
                            }, ((lfy) lfmVar).c);
                            final lfy lfyVar2 = (lfy) lfmVar;
                            ((lfy) lfmVar).D = ((lfy) lfmVar).u.a(new lij() { // from class: lfn
                                @Override // defpackage.lij
                                public final void fB(Object obj) {
                                    switch (i) {
                                        case 0:
                                            lfyVar2.h();
                                            break;
                                        default:
                                            lfy lfyVar3 = lfyVar2;
                                            Long l = (Long) obj;
                                            if (l.longValue() > 0) {
                                                lfyVar3.h();
                                            } else if (l.longValue() == -1) {
                                                Log.w("AudioEncoder", "Empty video recording detected, not adding audio.");
                                                lfyVar3.N.o(null);
                                            }
                                            break;
                                    }
                                }
                            }, ((lfy) lfmVar).c);
                            ((lfy) lfmVar).h.c();
                            String strValueOf = String.valueOf(((lfy) lfmVar).h.getRoutedDevice());
                            ((lfy) lfmVar).h.a();
                            String.valueOf(strValueOf).length();
                            if (((lfy) lfmVar).h.a() != 3) {
                                ((lfy) lfmVar).j.f();
                                ((lfy) lfmVar).j.k();
                                ((lfy) lfmVar).m.a(lga.AUDIO_TRACK_FAIL_TO_START);
                                ((lfy) lfmVar).close();
                            } else {
                                ((lfy) lfmVar).O = 2;
                                if (((lfy) lfmVar).n) {
                                    synchronized (((lfy) lfmVar).f) {
                                        ((lfy) lfmVar).E = true;
                                        Iterator it = ((lfy) lfmVar).G.iterator();
                                        while (it.hasNext()) {
                                            lfy lfyVar3 = (lfy) lfmVar;
                                            lfyVar3.e(((lfy) lfmVar).i, ((Integer) it.next()).intValue());
                                        }
                                        Iterator it2 = ((lfy) lfmVar).H.iterator();
                                        while (it2.hasNext()) {
                                            ((lfy) lfmVar).i.releaseOutputBuffer(((Integer) it2.next()).intValue(), false);
                                        }
                                        ((lfy) lfmVar).f(((lfy) lfmVar).F);
                                    }
                                } else {
                                    ((lfy) lfmVar).i.start();
                                }
                            }
                        }
                        break;
                    }
                    lfl lflVar = lgyVar.k;
                    if (lflVar != null) {
                        lflVar.b(lgyVar.j);
                    }
                }
                return null;
            case 1:
                lfi lfiVar = this.a.d;
                if (lfiVar != null) {
                    synchronized (((lgt) lfiVar).a) {
                        int i4 = ((lgt) lfiVar).x;
                        if (i4 != 1 && i4 != 5) {
                            String strBz = mip.bz(i4);
                            StringBuilder sb2 = new StringBuilder(strBz.length() + 17);
                            sb2.append("illegal state as ");
                            sb2.append(strBz);
                            Log.e("VideoEncoder", sb2.toString());
                        } else if (((lgt) lfiVar).t) {
                            ((lgt) lfiVar).close();
                            ((lgt) lfiVar).e.a(lga.MEDIA_CODEC_ERROR_VIDEO);
                        } else {
                            if (((lgt) lfiVar).l) {
                                synchronized (((lgt) lfiVar).b) {
                                    ((lgt) lfiVar).v = true;
                                    MediaFormat mediaFormat = ((lgt) lfiVar).w;
                                    if (mediaFormat != null) {
                                        ((lgt) lfiVar).c(mediaFormat);
                                    }
                                    Iterator it3 = ((lgt) lfiVar).u.iterator();
                                    while (it3.hasNext()) {
                                        ((lgt) lfiVar).c.releaseOutputBuffer(((Integer) it3.next()).intValue(), false);
                                    }
                                }
                            } else {
                                ((lgt) lfiVar).c.start();
                            }
                            ((lgt) lfiVar).d(false);
                            ((lgt) lfiVar).x = 2;
                        }
                        break;
                    }
                }
                return null;
            case 2:
                Iterator it4 = this.a.f.values().iterator();
                while (it4.hasNext()) {
                    ((lfd) it4.next()).e();
                }
                return null;
            default:
                Iterator it5 = this.a.f.values().iterator();
                while (it5.hasNext()) {
                    ((lfd) it5.next()).k();
                }
                return null;
        }
    }
}

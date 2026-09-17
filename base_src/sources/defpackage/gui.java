package defpackage;

import j$.util.function.Consumer;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gui implements Consumer {
    private final /* synthetic */ int j;
    public static final /* synthetic */ gui i = new gui(10);
    public static final /* synthetic */ gui h = new gui(9);
    public static final /* synthetic */ gui g = new gui(8);
    public static final /* synthetic */ gui f = new gui(7);
    public static final /* synthetic */ gui e = new gui(5);
    public static final /* synthetic */ gui d = new gui(4);
    public static final /* synthetic */ gui c = new gui(3);
    public static final /* synthetic */ gui b = new gui(2);
    public static final /* synthetic */ gui a = new gui(0);

    public /* synthetic */ gui(int i2) {
        this.j = i2;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z = false;
        switch (this.j) {
            case 0:
                ((gtu) obj).c();
                return;
            case 1:
                fik fikVar = (fik) obj;
                int i2 = fhv.k;
                if (fikVar instanceof fhz) {
                    ((fhz) fikVar).a();
                    return;
                }
                return;
            case 2:
                iek iekVar = (iek) obj;
                iekVar.setVisibility(8);
                iekVar.setScaleX(0.0f);
                iekVar.setScaleY(0.0f);
                iekVar.setAlpha(0.0f);
                return;
            case 3:
                iek iekVar2 = (iek) obj;
                iekVar2.setEnabled(false);
                iekVar2.setColorFilter(iek.a);
                return;
            case 4:
                ((jtc) obj).f();
                return;
            case 5:
                ((jtc) obj).g();
                return;
            case 6:
                return;
            case 7:
                ((mip) obj).r();
                return;
            case 8:
                final ohj ohjVar = (ohj) obj;
                synchronized (ohjVar.a) {
                    int i3 = ohjVar.e;
                    z = i3 == 1;
                    String str = ohjVar.b;
                    String strD = ohh.d(i3);
                    if (i3 == 0) {
                        throw null;
                    }
                    obr.aU(z, "Can't run: state of audio stream parser '%s' is '%s'.", str, strD);
                    ohjVar.e = 2;
                }
                ohjVar.d.execute(new Runnable() { // from class: ohi
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z2;
                        ohj ohjVar2 = ohjVar;
                        try {
                            InputStream inputStream = ohjVar2.c;
                            try {
                                byte[] bArr = new byte[400];
                                for (boolean z3 = false; ohjVar2.b() && !z3; z3 = z2) {
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= 400) {
                                            z2 = false;
                                            break;
                                        }
                                        int i5 = ohjVar2.c.read(bArr, i4, 400 - i4);
                                        if (i5 < 0) {
                                            z2 = true;
                                            break;
                                        }
                                        i4 += i5;
                                    }
                                    if (ohjVar2.b() && i4 > 0) {
                                        ogu oguVar = ohjVar2.f;
                                        oguVar.a.i(ByteBuffer.wrap(bArr, 0, i4));
                                    }
                                }
                                ohjVar2.a(null);
                                inputStream.close();
                            } catch (Throwable th) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            ohjVar2.a(e2);
                        }
                    }
                });
                return;
            case 9:
                ohj ohjVar2 = (ohj) obj;
                synchronized (ohjVar2.a) {
                    int i4 = ohjVar2.e;
                    if (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                        z = true;
                    }
                    String str2 = ohjVar2.b;
                    String strD2 = ohh.d(i4);
                    if (i4 == 0) {
                        throw null;
                    }
                    obr.aU(z, "Can't shut down: state of the audio stream parser '%s' is '%s'.", str2, strD2);
                    if (ohjVar2.e != 5) {
                        ohjVar2.e = 4;
                    }
                }
                return;
            case 10:
                ((mip) obj).r();
                return;
            case 11:
                return;
            default:
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.j) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
        }
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

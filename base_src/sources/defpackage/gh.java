package defpackage;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.camera.bottombar.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class gh {
    static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static int d(qp qpVar, pq pqVar, View view, View view2, qc qcVar, boolean z) {
        if (qcVar.ai() == 0 || qpVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(qc.be(view) - qc.be(view2)) + 1;
        }
        return Math.min(pqVar.k(), pqVar.a(view2) - pqVar.d(view));
    }

    public static int e(qp qpVar, pq pqVar, View view, View view2, qc qcVar, boolean z, boolean z2) {
        if (qcVar.ai() == 0 || qpVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (qpVar.a() - Math.max(qc.be(view), qc.be(view2))) - 1) : Math.max(0, Math.min(qc.be(view), qc.be(view2)));
        return !z ? iMax : Math.round((iMax * (Math.abs(pqVar.a(view2) - pqVar.d(view)) / (Math.abs(qc.be(view) - qc.be(view2)) + 1))) + (pqVar.j() - pqVar.d(view)));
    }

    public static int f(qp qpVar, pq pqVar, View view, View view2, qc qcVar, boolean z) {
        if (qcVar.ai() == 0 || qpVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        return !z ? qpVar.a() : (int) (((pqVar.a(view2) - pqVar.d(view)) / (Math.abs(qc.be(view) - qc.be(view2)) + 1)) * qpVar.a());
    }

    public static String g(String str, int i) {
        if (i <= 0) {
            if (i == -1) {
                return str.concat("[last()]");
            }
            throw new ass("Array index must be larger than zero", R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
        }
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append('[');
        sb.append(i);
        sb.append(']');
        return sb.toString();
    }

    public static String h(String str, String str2) throws ass {
        if (str.length() == 0) {
            throw new ass("Empty field namespace URI", R.styleable.AppCompatTheme_switchStyle);
        }
        if (str2.length() == 0) {
            throw new ass("Empty f name", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        atr atrVarD = hn.d(str, str2);
        if (atrVarD.a() != 2) {
            throw new ass("The field name must be simple", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        String str3 = atrVarD.b(1).a;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1);
        sb.append('/');
        sb.append(str3);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static amn i(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        IOException e;
        amn amnVar = new amn();
        if (bArr == null) {
            return amnVar;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i = objectInputStream.readInt(); i > 0; i--) {
                        amnVar.a.add(new amm(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    byteArrayInputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    try {
                        e.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        } catch (IOException e8) {
            objectInputStream = null;
            e = e8;
        } catch (Throwable th3) {
            th = th3;
        }
        return amnVar;
    }

    public static int j(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + ((Object) gg.e(i)) + " to int");
        }
    }

    public static int k(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
        }
    }

    public static int l(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                if (i == 5) {
                    return 6;
                }
                throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
        }
    }

    public static int m(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
        }
    }

    public static int n(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                throw new IllegalArgumentException("Could not convert " + i + " to State");
        }
    }
}

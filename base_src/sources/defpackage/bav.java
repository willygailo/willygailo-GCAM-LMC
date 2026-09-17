package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bav implements bac {
    private final Uri a;
    private final bax b;
    private InputStream c;

    public bav(Uri uri, bax baxVar) {
        this.a = uri;
        this.b = baxVar;
    }

    public static bav b(Context context, Uri uri, baw bawVar) {
        return new bav(uri, new bax(axv.b(context).c.b(), bawVar, axv.b(context).d, context.getContentResolver()));
    }

    @Override // defpackage.bac
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.bac
    public final void d() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x003d A[Catch: FileNotFoundException -> 0x00e7, TryCatch #11 {FileNotFoundException -> 0x00e7, blocks: (B:2:0x0000, B:9:0x0018, B:26:0x0035, B:42:0x00a2, B:72:0x00db, B:73:0x00e1, B:61:0x00ca, B:29:0x003d, B:31:0x0048, B:33:0x0052, B:34:0x0056, B:37:0x005e, B:38:0x009d, B:15:0x0023, B:19:0x002b, B:20:0x002e), top: B:86:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0048 A[Catch: FileNotFoundException -> 0x00e7, TryCatch #11 {FileNotFoundException -> 0x00e7, blocks: (B:2:0x0000, B:9:0x0018, B:26:0x0035, B:42:0x00a2, B:72:0x00db, B:73:0x00e1, B:61:0x00ca, B:29:0x003d, B:31:0x0048, B:33:0x0052, B:34:0x0056, B:37:0x005e, B:38:0x009d, B:15:0x0023, B:19:0x002b, B:20:0x002e), top: B:86:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2 A[Catch: FileNotFoundException -> 0x00e7, TRY_LEAVE, TryCatch #11 {FileNotFoundException -> 0x00e7, blocks: (B:2:0x0000, B:9:0x0018, B:26:0x0035, B:42:0x00a2, B:72:0x00db, B:73:0x00e1, B:61:0x00ca, B:29:0x003d, B:31:0x0048, B:33:0x0052, B:34:0x0056, B:37:0x005e, B:38:0x009d, B:15:0x0023, B:19:0x002b, B:20:0x002e), top: B:86:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db A[Catch: FileNotFoundException -> 0x00e7, TRY_ENTER, TryCatch #11 {FileNotFoundException -> 0x00e7, blocks: (B:2:0x0000, B:9:0x0018, B:26:0x0035, B:42:0x00a2, B:72:0x00db, B:73:0x00e1, B:61:0x00ca, B:29:0x003d, B:31:0x0048, B:33:0x0052, B:34:0x0056, B:37:0x005e, B:38:0x009d, B:15:0x0023, B:19:0x002b, B:20:0x002e), top: B:86:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.bac
    public final void f(ayc aycVar, bab babVar) throws Throwable {
        Cursor cursorA;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iF;
        try {
            bax baxVar = this.b;
            Uri uri = this.a;
            Cursor cursor = null;
            inputStreamOpenInputStream = null;
            inputStreamOpenInputStream = null;
            InputStream inputStreamOpenInputStream2 = null;
            try {
                cursorA = baxVar.a.a(uri);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (SecurityException e) {
                        if (cursorA == null) {
                            string = null;
                        }
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            bax baxVar2 = this.b;
                            try {
                                inputStreamOpenInputStream2 = baxVar2.c.openInputStream(this.a);
                                try {
                                    iF = vj.f(baxVar2.d, inputStreamOpenInputStream2, baxVar2.b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException e2) {
                                        }
                                    }
                                } catch (IOException e3) {
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                            iF = -1;
                                        } catch (IOException e4) {
                                            iF = -1;
                                        }
                                    } else {
                                        iF = -1;
                                    }
                                } catch (NullPointerException e5) {
                                    if (inputStreamOpenInputStream2 != null) {
                                        inputStreamOpenInputStream2.close();
                                        iF = -1;
                                    } else {
                                        iF = -1;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException e6) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e7) {
                            } catch (NullPointerException e8) {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            iF = -1;
                        }
                        if (iF != -1) {
                            inputStreamOpenInputStream = new bai(inputStreamOpenInputStream, iF);
                        }
                        this.c = inputStreamOpenInputStream;
                        babVar.b(inputStreamOpenInputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursorA;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() || file.length() <= 0) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = baxVar.c.openInputStream(uriFromFile);
                            } catch (NullPointerException e9) {
                                String strValueOf = String.valueOf(uri);
                                String strValueOf2 = String.valueOf(uriFromFile);
                                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 21 + String.valueOf(strValueOf2).length());
                                sb.append("NPE opening uri: ");
                                sb.append(strValueOf);
                                sb.append(" -> ");
                                sb.append(strValueOf2);
                                throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e9));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        bax baxVar3 = this.b;
                        inputStreamOpenInputStream2 = baxVar3.c.openInputStream(this.a);
                        iF = vj.f(baxVar3.d, inputStreamOpenInputStream2, baxVar3.b);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        iF = -1;
                    }
                    if (iF != -1) {
                        inputStreamOpenInputStream = new bai(inputStreamOpenInputStream, iF);
                    }
                    this.c = inputStreamOpenInputStream;
                    babVar.b(inputStreamOpenInputStream);
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            } catch (SecurityException e10) {
                cursorA = null;
            } catch (Throwable th4) {
                th = th4;
            }
            string = null;
            if (TextUtils.isEmpty(string)) {
                inputStreamOpenInputStream = null;
            } else {
                file = new File(string);
                if (file.exists()) {
                    inputStreamOpenInputStream = null;
                } else {
                    inputStreamOpenInputStream = null;
                }
            }
            if (inputStreamOpenInputStream != null) {
                bax baxVar4 = this.b;
                inputStreamOpenInputStream2 = baxVar4.c.openInputStream(this.a);
                iF = vj.f(baxVar4.d, inputStreamOpenInputStream2, baxVar4.b);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iF = -1;
            }
            if (iF != -1) {
                inputStreamOpenInputStream = new bai(inputStreamOpenInputStream, iF);
            }
            this.c = inputStreamOpenInputStream;
            babVar.b(inputStreamOpenInputStream);
        } catch (FileNotFoundException e11) {
            babVar.e(e11);
        }
    }

    @Override // defpackage.bac
    public final void fu() {
    }

    @Override // defpackage.bac
    public final int g() {
        return 1;
    }
}

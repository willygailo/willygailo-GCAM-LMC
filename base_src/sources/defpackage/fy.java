package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.view.Display;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class fy {
    static int a() {
        return View.generateViewId();
    }

    static int b(View view) {
        return view.getLayoutDirection();
    }

    static int c(View view) {
        return view.getPaddingEnd();
    }

    static int d(View view) {
        return view.getPaddingStart();
    }

    static Display e(View view) {
        return view.getDisplay();
    }

    static void f(View view, int i) {
        view.setLayoutDirection(3);
    }

    static void g(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    static boolean h(View view) {
        return view.isPaddingRelative();
    }

    public static Cursor i(aii aiiVar, ajw ajwVar, boolean z) {
        Cursor cursorO = aiiVar.o(ajwVar);
        if (z && (cursorO instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorO;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i = 0; i < abstractWindowedCursor.getColumnCount(); i++) {
                            switch (abstractWindowedCursor.getType(i)) {
                                case 0:
                                    objArr[i] = null;
                                    break;
                                case 1:
                                    objArr[i] = Long.valueOf(abstractWindowedCursor.getLong(i));
                                    break;
                                case 2:
                                    objArr[i] = Double.valueOf(abstractWindowedCursor.getDouble(i));
                                    break;
                                case 3:
                                    objArr[i] = abstractWindowedCursor.getString(i);
                                    break;
                                case 4:
                                    objArr[i] = abstractWindowedCursor.getBlob(i);
                                    break;
                                default:
                                    throw new IllegalStateException();
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    abstractWindowedCursor.close();
                    return matrixCursor;
                } catch (Throwable th) {
                    abstractWindowedCursor.close();
                    throw th;
                }
            }
        }
        return cursorO;
    }

    public static void j(ajy ajyVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        Cursor cursorB = ajyVar.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (true) {
            try {
                if (!cursorB.moveToNext()) {
                    break;
                } else {
                    arrayList.add(cursorB.getString(0));
                }
            } catch (Throwable th) {
                cursorB.close();
                throw th;
            }
        }
        cursorB.close();
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (str.startsWith("room_fts_content_sync_")) {
                ajyVar.g("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static int k(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + "`");
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static int l(Cursor cursor, String str) {
        String string;
        int iK = k(cursor, str);
        if (iK >= 0) {
            return iK;
        }
        try {
            string = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            string = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }
}

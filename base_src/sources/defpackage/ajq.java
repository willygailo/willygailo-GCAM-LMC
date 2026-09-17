package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ajq {
    public final int a;
    public ahy b;
    public final aiq c;
    public final String d;
    public final String e;

    public ajq(int i) {
        this.a = i;
    }

    public ajq(ahy ahyVar, aiq aiqVar, String str, String str2) {
        this(aiqVar.a);
        this.b = ahyVar;
        this.c = aiqVar;
        this.d = str;
        this.e = str2;
    }

    public static final void a(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: " + str);
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:61:0x0070 A[EDGE_INSN: B:61:0x0070->B:34:0x0070 BREAK  A[LOOP:1: B:8:0x0015->B:64:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[LOOP:2: B:20:0x003c->B:73:?, LOOP_END, SYNTHETIC] */
    public final void b(ajy ajyVar, int i, int i2) {
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z;
        boolean z2;
        int iIntValue;
        ahy ahyVar = this.b;
        if (ahyVar != null) {
            aih aihVar = ahyVar.d;
            List listEmptyList = null;
            if (i != i2) {
                ArrayList arrayList = new ArrayList();
                int i3 = i;
                do {
                    if (i2 <= i) {
                        if (i3 > i2) {
                            treeMap = (TreeMap) aihVar.a.get(Integer.valueOf(i3));
                            if (treeMap != null) {
                                break;
                                break;
                            }
                            if (i2 > i) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                z = true;
                                z2 = false;
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                    break;
                                }
                                iIntValue = ((Integer) it.next()).intValue();
                                if (i2 > i) {
                                    if (iIntValue > i2) {
                                    }
                                } else if (iIntValue < i2) {
                                }
                                if (z2) {
                                    arrayList.add((ajd) treeMap.get(Integer.valueOf(iIntValue)));
                                    i3 = iIntValue;
                                    break;
                                    break;
                                }
                            }
                        } else {
                            listEmptyList = arrayList;
                            break;
                        }
                    } else {
                        if (i3 >= i2) {
                            listEmptyList = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) aihVar.a.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            break;
                        }
                        if (i2 > i) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            z = true;
                            z2 = false;
                            if (it.hasNext()) {
                                z = false;
                                break;
                            }
                            iIntValue = ((Integer) it.next()).intValue();
                            if (i2 > i) {
                                if (iIntValue > i2 && iIntValue > i3) {
                                    z2 = true;
                                }
                            } else if (iIntValue < i2 && iIntValue < i3) {
                                z2 = true;
                            }
                            if (z2) {
                                arrayList.add((ajd) treeMap.get(Integer.valueOf(iIntValue)));
                                i3 = iIntValue;
                                break;
                            }
                        }
                    }
                } while (z);
            } else {
                listEmptyList = Collections.emptyList();
            }
            if (listEmptyList != null) {
                this.c.g(ajyVar);
                Iterator it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    ((ajd) it2.next()).a(ajyVar);
                }
                air airVarB = this.c.b(ajyVar);
                if (airVarB.a) {
                    this.c.f(ajyVar);
                    c(ajyVar);
                    return;
                } else {
                    throw new IllegalStateException("Migration didn't properly handle: " + airVarB.b);
                }
            }
        }
        ahy ahyVar2 = this.b;
        if (ahyVar2 != null && ((i > i2 && ahyVar2.l) || !ahyVar2.k)) {
            this.c.d(ajyVar);
            this.c.c(ajyVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public final void c(ajy ajyVar) {
        ajyVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ajyVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.d + "')");
    }
}

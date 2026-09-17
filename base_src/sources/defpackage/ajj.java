package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ajj {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public ajj(String str, Map map, Set set, Set set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static ajj a(ajy ajyVar, String str) {
        HashSet hashSet;
        aji ajiVar;
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(str);
        String str2 = "`)";
        sb.append("`)");
        Cursor cursorB = ajyVar.b(sb.toString());
        HashMap map = new HashMap();
        try {
            if (cursorB.getColumnCount() > 0) {
                int columnIndex = cursorB.getColumnIndex("name");
                int columnIndex2 = cursorB.getColumnIndex("type");
                int columnIndex3 = cursorB.getColumnIndex("notnull");
                int columnIndex4 = cursorB.getColumnIndex("pk");
                int columnIndex5 = cursorB.getColumnIndex("dflt_value");
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(columnIndex);
                    map.put(string, new ajf(string, cursorB.getString(columnIndex2), cursorB.getInt(columnIndex3) != 0, cursorB.getInt(columnIndex4), cursorB.getString(columnIndex5), 2));
                }
            }
            cursorB.close();
            HashSet hashSet2 = new HashSet();
            Cursor cursorB2 = ajyVar.b("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorB2.getColumnIndex("id");
                int columnIndex7 = cursorB2.getColumnIndex("seq");
                int columnIndex8 = cursorB2.getColumnIndex("table");
                int columnIndex9 = cursorB2.getColumnIndex("on_delete");
                int columnIndex10 = cursorB2.getColumnIndex("on_update");
                int columnIndex11 = cursorB2.getColumnIndex("id");
                int columnIndex12 = cursorB2.getColumnIndex("seq");
                int columnIndex13 = cursorB2.getColumnIndex("from");
                int columnIndex14 = cursorB2.getColumnIndex("to");
                int count = cursorB2.getCount();
                ArrayList<ajh> arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < count) {
                    cursorB2.moveToPosition(i2);
                    arrayList.add(new ajh(cursorB2.getInt(columnIndex11), cursorB2.getInt(columnIndex12), cursorB2.getString(columnIndex13), cursorB2.getString(columnIndex14)));
                    i2++;
                    count = count;
                    str2 = str2;
                    columnIndex11 = columnIndex11;
                    columnIndex12 = columnIndex12;
                    columnIndex13 = columnIndex13;
                }
                String str3 = str2;
                Collections.sort(arrayList);
                int count2 = cursorB2.getCount();
                int i3 = 0;
                while (i3 < count2) {
                    cursorB2.moveToPosition(i3);
                    if (cursorB2.getInt(columnIndex7) != 0) {
                        i = count2;
                    } else {
                        int i4 = cursorB2.getInt(columnIndex6);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (ajh ajhVar : arrayList) {
                            count2 = count2;
                            if (ajhVar.a == i4) {
                                arrayList2.add(ajhVar.c);
                                arrayList3.add(ajhVar.d);
                            }
                        }
                        i = count2;
                        hashSet2.add(new ajg(cursorB2.getString(columnIndex8), cursorB2.getString(columnIndex9), cursorB2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i3++;
                    count2 = i;
                }
                cursorB2.close();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PRAGMA index_list(`");
                sb2.append(str);
                String str4 = str3;
                sb2.append(str4);
                ajyVar = ajyVar;
                Cursor cursorB3 = ajyVar.b(sb2.toString());
                String str5 = "name";
                try {
                    int columnIndex15 = cursorB3.getColumnIndex(str5);
                    int columnIndex16 = cursorB3.getColumnIndex("origin");
                    int columnIndex17 = cursorB3.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        cursorB3.close();
                        hashSet = null;
                    } else {
                        HashSet hashSet3 = new HashSet();
                        while (true) {
                            if (!cursorB3.moveToNext()) {
                                cursorB3.close();
                                hashSet = hashSet3;
                            } else if ("c".equals(cursorB3.getString(columnIndex16))) {
                                String string2 = cursorB3.getString(columnIndex15);
                                boolean z = cursorB3.getInt(columnIndex17) == 1;
                                Cursor cursorB4 = ajyVar.b("PRAGMA index_xinfo(`" + string2 + str4);
                                try {
                                    int columnIndex18 = cursorB4.getColumnIndex("seqno");
                                    int columnIndex19 = cursorB4.getColumnIndex("cid");
                                    int columnIndex20 = cursorB4.getColumnIndex(str5);
                                    String str6 = str5;
                                    int columnIndex21 = cursorB4.getColumnIndex("desc");
                                    String str7 = str4;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        cursorB4.close();
                                        ajiVar = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        TreeMap treeMap2 = new TreeMap();
                                        while (cursorB4.moveToNext()) {
                                            if (cursorB4.getInt(columnIndex19) >= 0) {
                                                int i5 = cursorB4.getInt(columnIndex18);
                                                int i6 = columnIndex15;
                                                String string3 = cursorB4.getString(columnIndex20);
                                                Object obj = cursorB4.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i7 = columnIndex16;
                                                Integer numValueOf = Integer.valueOf(i5);
                                                treeMap.put(numValueOf, string3);
                                                treeMap2.put(numValueOf, obj);
                                                columnIndex15 = i6;
                                                columnIndex21 = columnIndex21;
                                                columnIndex16 = i7;
                                            }
                                        }
                                        columnIndex15 = columnIndex15;
                                        columnIndex16 = columnIndex16;
                                        ArrayList arrayList4 = new ArrayList(treeMap.size());
                                        arrayList4.addAll(treeMap.values());
                                        ArrayList arrayList5 = new ArrayList(treeMap2.size());
                                        arrayList5.addAll(treeMap2.values());
                                        ajiVar = new aji(string2, z, arrayList4, arrayList5);
                                        cursorB4.close();
                                    }
                                    if (ajiVar == null) {
                                        break;
                                    }
                                    hashSet3.add(ajiVar);
                                    str5 = str6;
                                    str4 = str7;
                                    columnIndex15 = columnIndex15;
                                    columnIndex16 = columnIndex16;
                                } catch (Throwable th) {
                                    cursorB4.close();
                                    throw th;
                                }
                            }
                        }
                        cursorB3.close();
                        hashSet = null;
                    }
                    return new ajj(str, map, hashSet2, hashSet);
                } catch (Throwable th2) {
                    cursorB3.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                cursorB2.close();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorB.close();
            throw th4;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajj)) {
            return false;
        }
        ajj ajjVar = (ajj) obj;
        if (!this.a.equals(ajjVar.a)) {
            return false;
        }
        Map map = this.b;
        if (map == null ? ajjVar.b != null : !map.equals(ajjVar.b)) {
            return false;
        }
        Set set2 = this.c;
        if (set2 == null ? ajjVar.c != null : !set2.equals(ajjVar.c)) {
            return false;
        }
        Set set3 = this.d;
        if (set3 == null || (set = ajjVar.d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}

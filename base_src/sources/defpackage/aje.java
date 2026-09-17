package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class aje {
    private static final String[] d = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final String a;
    public final Set b;
    public final Set c;

    public aje(Set set) {
        this.a = "ResourceFts";
        this.b = set;
        this.c = a("CREATE VIRTUAL TABLE IF NOT EXISTS `ResourceFts` USING FTS4(`experienceId` TEXT, `queryableTags` TEXT NOT NULL, `namespaceId` TEXT, `partitionId` TEXT, `f250ResourceId` TEXT, `nonSignedInDataOwners` TEXT NOT NULL, content=`ResourceEntity`)");
    }

    public aje(Set set, Set set2) {
        this.a = "ResourceFts";
        this.b = set;
        this.c = set2;
    }

    public static Set a(String str) {
        int i;
        if (str.isEmpty()) {
            return new HashSet();
        }
        String strSubstring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = -1;
        for (int i3 = 0; i3 < strSubstring.length(); i3++) {
            char cCharAt = strSubstring.charAt(i3);
            switch (cCharAt) {
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    } else if (((Character) arrayDeque.peek()).charValue() == cCharAt) {
                        arrayDeque.pop();
                    }
                    break;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    if (arrayDeque.isEmpty()) {
                        arrayList.add(strSubstring.substring(i2 + 1, i3).trim());
                        i2 = i3;
                    }
                    break;
                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    }
                    break;
                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                    if (!arrayDeque.isEmpty() && ((Character) arrayDeque.peek()).charValue() == '[') {
                        arrayDeque.pop();
                    }
                    break;
            }
        }
        arrayList.add(strSubstring.substring(i2 + 1).trim());
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            String str2 = (String) arrayList.get(i4);
            String[] strArr = d;
            int i5 = 0;
            while (true) {
                i = i4 + 1;
                if (i5 < 9) {
                    if (str2.startsWith(strArr[i5])) {
                        hashSet.add(str2);
                    }
                    i5++;
                }
            }
            i4 = i;
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aje)) {
            return false;
        }
        aje ajeVar = (aje) obj;
        if (this.a.equals(ajeVar.a) && this.b.equals(ajeVar.b)) {
            return this.c.equals(ajeVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "FtsTableInfo{name='" + this.a + "', columns=" + this.b + ", options=" + this.c + '}';
    }
}

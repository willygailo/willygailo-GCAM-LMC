package defpackage;

import android.util.Pair;
import com.google.android.apps.camera.bottombar.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nlr {
    static final String a;
    static final String b;
    static final String c;
    static final String d;
    public static final String e;
    public static final List f;
    private static final String[] g;
    private static final String[] h;
    private static final String[] i = {"com", "net", "gov", "edu", "org", "co", "ac", "muni", "ltd", "plc", "mil", "sch"};
    private static final String[] j = {"au", "at", "br", "hu", "nz", "il", "ru", "za", "kr", "tr", "uk"};
    private static final String[] k = {"com", "org", "edu", "gov", "co\\.uk"};
    private static final String[] l = {"http://www.", "https://www.", "www.", "http://", "https://"};

    static {
        String[] strArr = {"com\\.au", "com\\.br", "com\\.hk", "com\\.mx", "com\\.sg", "com\\.tw", "com", "org", "edu", "gov", "net", "mobi", "mil", "io", "info", "biz", "xyz", "nyc", "google", "co\\.uk", "co\\.il", "co\\.za", "co\\.id", "co\\.jp", "link", "chat", "au", "ca", "ch", "dev", "de", "fr", "gb", "in", "it", "jp", "nl", "ru", "sg", "tw", "uk", "um", "us", "vi", "(?<!co\\.reg\\.)no", "ai", "am", "be", "cn", "cu", "cz", "dk", "es", "eu", "fi", "fj", "gl", "gr", "hu", "ie", "il", "ir", "ke", "kr", "li", "lu", "ly", "mc", "menu", "me", "mx", "nl", "nz", "pl", "pr", "ps", "pt", "ro", "se", "th", "to", "tr", "tv", "ua", "va", "vn", "中国", "中國", "香港", "澳门", "澳門", "新加坡", "台湾", "台灣", "在线", "中文网", "移动", "网址", "网络", "公司", "商城", "机构", "我爱你", "商标", "世界", "集团", "닷컴", "닷넷", "みんな", "セール", "ファッション", "ストア", "ポイント", "クラウド", "コム", "佛山", "广东", "co"};
        g = strArr;
        String[] strArr2 = {"style", "today", "ar", "at", "br", "by", "cl", "hk", "hu", "id", "il", "la", "mx", "no", "sk", "za", "app", "baby", "blog", "book", "buy", "cloud", "corp", "cpa", "dds", "dev", "diy", "docs", "dog", "dot", "drive", "earth", "family", "film", "free", "fun", "fyi", "game", "games", "gmbh", "goo", "home", "inc", "live", "llc", "llp", "lol", "love", "mail", "map", "mba", "med", "mom", "moto", "movie", "music", "pet", "phd", "play", "plus", "search", "shop", "show", "site", "spot", "srl", "store", "talk", "team", "tech", "tube", "vip", "web", "wow", "you", "ads", "android", "boo", "cal", "car", "channel", "chrome", "dad", "day", "dclk", "eat", "esq", "fly", "foo", "gbiz", "gle", "gmail", "goog", "guge", "hangout", "here", "how", "ing", "kid", "meme", "mov", "new", "nexus", "page", "prod", "prof", "rsvp", "soy", "tour", "youtube", "zip", "グーグル", "谷歌"};
        h = strArr2;
        String strB = b(strArr);
        a = strB;
        String strValueOf = String.valueOf(strB);
        String strValueOf2 = String.valueOf(b(strArr2));
        b = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        ArrayList arrayList = new ArrayList(R.styleable.AppCompatTheme_windowActionBarOverlay);
        int i2 = 0;
        for (int i3 = R.styleable.AppCompatTheme_windowActionBarOverlay; i2 < i3; i3 = R.styleable.AppCompatTheme_windowActionBarOverlay) {
            String str = strArr[i2];
            if (str.length() > 2) {
                arrayList.add(str.replace("", " ").trim().replace(" ", "\\s*"));
            }
            i2++;
        }
        c = String.format("(%s)", oxk.e("|").a(arrayList));
        String[] strArr3 = l;
        ArrayList arrayList2 = new ArrayList(5);
        for (int i4 = 0; i4 < 5; i4++) {
            arrayList2.add(strArr3[i4].replace("", " ").trim().replace(" ", "\\s*").replace(".", "\\."));
        }
        d = String.format("(%s)", oxk.e("|").a(arrayList2));
        String[] strArr4 = k;
        String strB2 = b(strArr4);
        ArrayList arrayList3 = new ArrayList(5);
        for (int i5 = 0; i5 < 5; i5++) {
            arrayList3.add(String.format("(?!\\s*\\.\\s*%s)", strArr4[i5]));
        }
        String strA = oxk.e("").a(arrayList3);
        StringBuilder sb = new StringBuilder(String.valueOf(strB2).length() + 55 + String.valueOf(strA).length());
        sb.append("\\b([A-Za-z0-9\\.\\-]{2,})((?<!\\.)\\s*)(");
        sb.append(strB2);
        sb.append(")");
        sb.append(strA);
        sb.append("(:[0-9]+)?(?!\\.)\\b");
        e = sb.toString();
        f = Arrays.asList(Pair.create("comn", "com"), Pair.create("conm", "com"), Pair.create("co0m", "com"), Pair.create("c0om", "com"), Pair.create("coh", "com"), Pair.create("con", "com"), Pair.create("cor", "com"), Pair.create("cem", "com"), Pair.create("gom", "com"), Pair.create("goy", "gov"), Pair.create("het", "net"));
    }

    private static Iterable a(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(String.format("(?:%s)", str));
        }
        return arrayList;
    }

    private static String b(String[] strArr) {
        String strA = oxk.e("|").a(a(i));
        String strA2 = oxk.e("|").a(a(j));
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 14 + String.valueOf(strA2).length());
        sb.append("(?:(?:");
        sb.append(strA);
        sb.append(")\\.(?:");
        sb.append(strA2);
        sb.append("))");
        String string = sb.toString();
        String strA3 = oxk.e("|").a(a(strArr));
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(strA3).length());
        sb2.append(string);
        sb2.append("|");
        sb2.append(strA3);
        return sb2.toString();
    }
}

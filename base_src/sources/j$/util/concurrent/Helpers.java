package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
abstract class Helpers {
    static String mapEntryToString(Object obj, Object obj2) {
        String strObjectToString = objectToString(obj);
        int length = strObjectToString.length();
        String strObjectToString2 = objectToString(obj2);
        int length2 = strObjectToString2.length();
        char[] cArr = new char[length + length2 + 1];
        strObjectToString.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        strObjectToString2.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    private static String objectToString(Object obj) {
        String string;
        return (obj == null || (string = obj.toString()) == null) ? "null" : string;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxj extends Exception {
    public pxj(int i) {
        String string;
        switch (i) {
            case 0:
                string = "VR Service present";
                break;
            case 1:
                string = "VR Service missing";
                break;
            case 2:
                string = "VR Service disabled";
                break;
            case 3:
                string = "VR Service updating";
                break;
            case 4:
                string = "VR Service obsolete";
                break;
            case 5:
                string = "VR Service not connected";
                break;
            case 6:
                string = "No permission to do operation";
                break;
            case 7:
                string = "This operation is not supported on this device";
                break;
            case 8:
                string = "An unknown failure occurred";
                break;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Invalid connection result: ");
                sb.append(i);
                string = sb.toString();
                break;
        }
        super(string);
    }
}

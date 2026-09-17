package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class WatchFaceDecomposition implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.wearable.watchface.decomposition.WatchFaceDecomposition.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new WatchFaceDecomposition(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new WatchFaceDecomposition[i];
        }
    };
    private final List a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private final List h;
    private final boolean i;
    private final int j;

    public class Builder {
        public Builder() {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorFormat {
    }

    public interface Component {
    }

    public interface DrawnComponent extends Component {
    }

    public WatchFaceDecomposition(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        List parcelableArrayList = bundle.getParcelableArrayList("images");
        List parcelableArrayList2 = bundle.getParcelableArrayList("numbers");
        List parcelableArrayList3 = bundle.getParcelableArrayList("color_numbers");
        List parcelableArrayList4 = bundle.getParcelableArrayList("color_strings");
        List parcelableArrayList5 = bundle.getParcelableArrayList("date_times");
        List parcelableArrayList6 = bundle.getParcelableArrayList("fonts");
        List parcelableArrayList7 = bundle.getParcelableArrayList("custom_fonts");
        List parcelableArrayList8 = bundle.getParcelableArrayList("complications");
        this.a = parcelableArrayList == null ? Collections.emptyList() : parcelableArrayList;
        this.b = parcelableArrayList2 == null ? Collections.emptyList() : parcelableArrayList2;
        this.c = parcelableArrayList3 == null ? Collections.emptyList() : parcelableArrayList3;
        this.d = parcelableArrayList4 == null ? Collections.emptyList() : parcelableArrayList4;
        this.e = parcelableArrayList5 == null ? Collections.emptyList() : parcelableArrayList5;
        this.f = parcelableArrayList6 == null ? Collections.emptyList() : parcelableArrayList6;
        this.g = parcelableArrayList7 == null ? Collections.emptyList() : parcelableArrayList7;
        this.h = parcelableArrayList8 == null ? Collections.emptyList() : parcelableArrayList8;
        this.i = bundle.getBoolean("convert_units");
        this.j = bundle.getInt("color_format");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("images", new ArrayList<>(this.a));
        bundle.putParcelableArrayList("numbers", new ArrayList<>(this.b));
        bundle.putParcelableArrayList("color_numbers", new ArrayList<>(this.c));
        bundle.putParcelableArrayList("color_strings", new ArrayList<>(this.d));
        bundle.putParcelableArrayList("date_times", new ArrayList<>(this.e));
        bundle.putParcelableArrayList("fonts", new ArrayList<>(this.f));
        bundle.putParcelableArrayList("custom_fonts", new ArrayList<>(this.g));
        bundle.putParcelableArrayList("complications", new ArrayList<>(this.h));
        bundle.putBoolean("convert_units", this.i);
        bundle.putInt("color_format", this.j);
        parcel.writeBundle(bundle);
    }
}

package overwhelmer;

import android.content.Context;
import android.util.AttributeSet;
import com.SDE.getToneCurve;
import com.google.android.GoogleCameraEngR18F1.R;
import com.softmoore.android.graphlib.Graph;
import com.softmoore.android.graphlib.GraphView;
import com.softmoore.android.graphlib.Point;

/* JADX INFO: loaded from: classes2.dex */
public class ToneGraph_5 extends GraphView {
    public static double[] _ToneGraph;
    public static ToneGraph_5 sToneGraph;

    public ToneGraph_5(Context context) {
        super(context);
        sToneGraph = this;
        drawTone();
    }

    public ToneGraph_5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sToneGraph = this;
        drawTone();
    }

    public static void ArrayLogPointDouble(Point[] pointArr, String str) {
        int length;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(getToneCurve.tonePresetName_5);
        sb.append("\n");
        sb.append("\n");
        if (str == null || (length = pointArr.length) == 0) {
            sb.append("Length 0");
            sb.append("\n");
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(Double.toString(pointArr[i].getX()));
                sb.append("  -  ");
                sb.append(Double.toString(pointArr[i].getY()));
                sb.append("\n");
            }
        }
        sb.toString();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    public static void drawTone() {
        getToneCurve.tonePresetName_5 = "Default";
        _ToneGraph = getToneCurve.getToneCurve(5);
        Point[] pointArr = new Point[17];
        double d = 0.0d;
        for (int i = 0; d <= 1.0d && i < 17; i++) {
            pointArr[i] = new Point(d, _ToneGraph[i + 0]);
            d += 0.0625d;
        }
        ((GraphView) sToneGraph.findViewById(R.id.GRAPHbutton)).setGraph(new Graph.Builder().setWorldCoordinates(0.0d, 1.0d, 0.0d, 1.0d).addLineGraph(pointArr, -7829368).setAxesColor(-7829368).setBackgroundColor(0).build());
        ArrayLogPointDouble(pointArr, "addlogsdir/_ToneGraphPoint_5.log");
    }

    public static void refreshGraph() {
        drawTone();
    }
}

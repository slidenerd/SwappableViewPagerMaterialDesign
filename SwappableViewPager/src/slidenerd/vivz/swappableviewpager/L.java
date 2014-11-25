
package slidenerd.vivz.swappableviewpager;

import java.util.Map;
import java.util.Set;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class L {
    public static final String TAG = "VIVZ";
    public static final boolean DEBUG_DB_ALERTS = false;
    public static final boolean DEBUG_DB_LATEST = false;
    public static final boolean DEBUG_ABSTRACT_LOADER = false;
    public static final boolean DEBUG_DB_SUGGESTIONS = false;
    public static final boolean DEBUG_LOADER_ALERT = false;
    public static final boolean DEBUG_LOADER_SUGGESTION_INSERT_DELETE = false;
    public static final boolean DEBUG_LOADER_SUGGESTION_GET_ALL = false;
    public static final boolean DEBUG_FRAGMENT_DRAWER = false;
    public static final boolean DEBUG_ADAPTER_SUGGESTIONS = false;
    public static final boolean DEBUG_TASK_LOAD_SUGGESTIONS = false;
    public static final boolean DEBUG_FRAGMENT_ALERTS = false;
    public static final boolean DEBUG_DIALOG_ADD_EDIT_ALERT = false;
    public static final boolean DEBUG_ADAPTER_INFORMABLE = false;
    public static final boolean DEBUG_CUSTOM_PREFERENCE_LATEST_CATEGORY = true;
    public static final boolean DEBUG_LOADER_SUGGESTION_READ = true;
    public static final boolean DEBUG_APPLICATION = false;
    public static final boolean DEBUG_ADAPTER_CATEGORY_PREFERENCE = true;
    public static final boolean DEBUG_DHTORRENTZ = false;
    public static final boolean DEBUG_ABSTRACTDH = false;
    public static final boolean DEBUG_CATEGORY = true;
    public static final boolean DEBUG_FRAGMENT_LATEST = true;
    public static final boolean DEBUG_TASK_LOAD_RESULTS_LATEST = true;
    public static final boolean DEBUG_ADAPTER_LATEST = true;

    public static void a(int[] a) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            builder.append(a[i] + "\n");
        }
        L.m(builder.toString());
    }

    public static void a(String[] array) {
        StringBuilder builder = new StringBuilder();
        for (String item : array) {
            builder.append(item + "\n");
        }
        L.m(builder.toString());
    }

    public static void e(String message) {
        Log.e(TAG, message);
    }

    public static void e(Exception exception) {
        StackTraceElement[] stackTraceElements = exception.getStackTrace();
        StringBuilder message = new StringBuilder();
        message.append(exception.toString() + "\n");
        for (StackTraceElement current : stackTraceElements) {
            message.append(current.getClassName() + " " + current.getFileName()
                    + " " + current.getMethodName() + " "
                    + current.getLineNumber() + "\n");
        }
        Log.e(TAG, message.toString());
    }

    public static void e(String className, String methodName, int lineNumber,
            String message) {
        Log.e(TAG, "Class: " + className + ", Method: " + methodName
                + ", Line: " + lineNumber + " " + message);
    }

    public static void m(String message) {
        Log.d(TAG, message);
    }

    public static void m(String className, String methodName, int lineNumber,
            String message) {
        Log.d(TAG, "Class: " + className + ", Method: " + methodName
                + ", Line: " + lineNumber + " " + message);
    }

    public static void p(SharedPreferences preferences) {

        try {
            Map<String, ?> all = preferences.getAll();
            Set<String> keySet = null;
            StringBuilder keysBuilder = new StringBuilder();
            keySet = all.keySet();
            Object[] keys = (Object[]) keySet.toArray();
            for (Object current : keys) {
                keysBuilder.append(current + ":" + all.get(current) + "\n");
            }
            L.m(Thread.currentThread().getStackTrace()[2].getClassName(),
                    Thread.currentThread().getStackTrace()[2].getMethodName(),
                    Thread.currentThread().getStackTrace()[2].getLineNumber(),
                    "" + keysBuilder);
        } catch (Exception e) {
            L.e(e + "");
        }
    }

    public static void s(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void S(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}

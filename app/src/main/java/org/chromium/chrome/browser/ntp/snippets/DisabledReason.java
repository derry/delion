package org.chromium.chrome.browser.ntp.snippets;

/**
 * Created by yangdeli on 16-7-20.
 */
public class DisabledReason {
    public static final int NONE = 0;
    public static final int EXPLICITLY_DISABLED = 1;
    public static final int SIGNED_OUT = 2;
    public static final int SYNC_DISABLED = 3;
    public static final int PASSPHRASE_ENCRYPTION_ENABLED = 4;
    public static final int HISTORY_SYNC_DISABLED = 5;
    public static final int HISTORY_SYNC_STATE_UNKNOWN = 6;

    public DisabledReason() {
    }
}
